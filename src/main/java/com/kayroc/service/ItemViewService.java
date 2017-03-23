package com.kayroc.service;


import java.time.LocalDateTime;
import java.util.List;

public interface ItemViewService {

    void insertView(long itemId, LocalDateTime localDateTime);

    List<LocalDateTime> getAllViewsByItemId(long itemId);

    int getNumberOfViewsInHourByItemId(Long itemId, LocalDateTime localDateTime);
}
