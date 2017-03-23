package com.kayroc.service;

import com.kayroc.dao.OrderDAO;
import com.kayroc.model.Item;
import com.kayroc.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;


@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemViewService itemViewService;

    @Autowired
    private OrderDAO orderDAO;

    @Override
    public Order orderItems(Order order) {

        LocalDateTime transactionDate = LocalDateTime.now();
        int numberOfViewsForItem = itemViewService.getNumberOfViewsInHourByItemId(order.getItemId(), transactionDate);

        Item item = itemService.findById(order.getItemId());

        float itemSalePrice = item.getPrice();
        float originalItemPrice = item.getPrice();
        int numberOfItems = order.getNumberOfItems();

        if (numberOfViewsForItem >= 10) {
            itemSalePrice += itemSalePrice * 0.1;
        }

        float totalAmountOfPurchase = numberOfItems * itemSalePrice;
        long id = new Random().nextLong();
        order.setId(id);
        order.setItemName(item.getName());
        order.setSaleItemPrice(itemSalePrice);
        order.setOriginalItemPrice(originalItemPrice);
        order.setTotalAmountOfPurchase(totalAmountOfPurchase);
        order.setTransactionDate(transactionDate);

        order = orderDAO.orderItems(order);

        return order;
    }
}
