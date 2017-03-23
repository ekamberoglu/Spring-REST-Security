package com.kayroc.dao;


import com.kayroc.model.Item;
import com.kayroc.util.Util;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ItemDAOImpl implements ItemDAO {

    private static final Map<Long, Item> ITEMS;

    static {
        ITEMS = Util.createDummyItems();
    }

    @Override
    public List<Item> findAllItems() {
        List<Item> itemList = new ArrayList<Item>(ITEMS.values());
        return itemList;
    }

    @Override
    public boolean purchaseItem(long id) {
        if (ITEMS.containsKey(id)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Item findById(long id) {
        return ITEMS.get(id);
    }
}
