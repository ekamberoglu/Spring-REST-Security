package com.kayroc.dao;


import com.kayroc.model.Item;

import java.util.List;

public interface ItemDAO {

    List<Item> findAllItems();

    boolean purchaseItem(long id);

    Item findById(long id);
}
