package com.kayroc.service;


import com.kayroc.dao.ItemViewDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service("itemViewService")
public class ItemViewServiceImpl implements ItemViewService {

    @Autowired
    private ItemViewDAO itemViewDAO;

    @Override
    public void insertView(long itemId, LocalDateTime localDateTime) {
        itemViewDAO.insertView(itemId, localDateTime);
    }

    @Override
    public List<LocalDateTime> getAllViewsByItemId(long itemId) {
        return itemViewDAO.getAllViewsByItemId(itemId);
    }


    @Override
    public int getNumberOfViewsInHourByItemId(Long itemId, LocalDateTime localDateTime) {
        return itemViewDAO.getNumberOfViewsInHourByItemId(itemId, localDateTime);
    }
}
