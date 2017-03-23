package com.kayroc.service;

import com.kayroc.model.Item;

import java.util.List;

public interface ItemService {

    List<Item> findAllItems();

    boolean purchaseItem(long id);

    Item findById(long id);
}