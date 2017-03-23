package com.kayroc.dao;


import com.kayroc.util.Util;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;

@Repository
public class ItemViewDAOImpl implements ItemViewDAO {

    private static final Map<Long, List<LocalDateTime>> ITEM_VIEWS;

    static {
        ITEM_VIEWS = Util.createDummyItemViews();
    }


    @Override
    public void insertView(long itemId, LocalDateTime localDateTime) {
        List<LocalDateTime> list = ITEM_VIEWS.get(itemId);

        if (list == null) {
            list = new ArrayList<LocalDateTime>();
        }

        list.add(localDateTime);
        ITEM_VIEWS.put(itemId, list);
    }

    @Override
    public List<LocalDateTime> getAllViewsByItemId(long itemId) {
        List<LocalDateTime> list =  ITEM_VIEWS.get(itemId);

        Collections.sort(list, Collections.reverseOrder());//Sort descending order
        return list;
    }

    @Override
    public int getNumberOfViewsInHourByItemId(Long itemId, LocalDateTime localDateTime) {
        List<LocalDateTime> list = getAllViewsByItemId(itemId);
        int numberOfViews = 0;

        for(LocalDateTime dateTime : list) {
            if (dateTime.isBefore(localDateTime)) {
                numberOfViews++;
            }
        }

        return numberOfViews;
    }
}
