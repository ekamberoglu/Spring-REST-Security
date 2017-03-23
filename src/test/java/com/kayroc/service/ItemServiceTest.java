package com.kayroc.service;


import com.kayroc.dao.ItemDAO;
import com.kayroc.model.Item;
import com.kayroc.util.Util;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ItemServiceTest {

    private ItemDAO itemDAO;

    private ItemService service;

    private Map<Long, Item> ITEMS;

    private Item item;

    @Before
    public void prepare() {
        ITEMS = Util.createDummyItems();
        item = ITEMS.get(1l);
        itemDAO = mock(ItemDAO.class);
        service = new ItemServiceImpl(itemDAO);
    }

    @Test
    public void findByIdTest() {
        when(itemDAO.findById(1l)).thenReturn(item);
        assertEquals(service.findById(1l), item);
    }

    @Test
    public void findAllItemsTest() {
        when(itemDAO.findAllItems()).thenReturn(new ArrayList<Item>(ITEMS.values()));
        assertTrue(new ArrayList<Item>(service.findAllItems()).contains(item));
        assertEquals(new ArrayList<Item>(service.findAllItems()).size(), 4);
    }

    @Test
    public void purchaseItemTest() {
        //TODO: implement it
    }
}
