package com.kayroc.dao;

import com.kayroc.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class OrderDAOImpl implements OrderDAO {

    private static final List<Order> ORDERS = new ArrayList<Order>();

    @Override
    public Order orderItems(Order order) {
        ORDERS.add(order);

        return order;
    }
}
