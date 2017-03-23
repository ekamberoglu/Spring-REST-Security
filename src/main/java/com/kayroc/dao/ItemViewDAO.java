package com.kayroc.dao;

import java.time.LocalDateTime;
import java.util.List;


public interface ItemViewDAO {

    void insertView(long itemId, LocalDateTime localDateTime);

    List<LocalDateTime> getAllViewsByItemId(long itemId);

    int getNumberOfViewsInHourByItemId(Long itemId, LocalDateTime localDateTime);
}
