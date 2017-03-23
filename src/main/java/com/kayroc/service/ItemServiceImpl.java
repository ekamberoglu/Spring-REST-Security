package com.kayroc.service;


import com.kayroc.dao.ItemDAO;
import com.kayroc.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    private ItemDAO itemDAO;

    @Autowired
    public ItemServiceImpl(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    @Override
    public List<Item> findAllItems() {
        return itemDAO.findAllItems();
    }

    @Override
    public boolean purchaseItem(long id) {
        return itemDAO.purchaseItem(id);
    }

    @Override
    public Item findById(long id) {
        return itemDAO.findById(id);
    }
}
