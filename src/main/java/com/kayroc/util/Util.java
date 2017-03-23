package com.kayroc.util;


import com.kayroc.model.Item;
import com.kayroc.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {

    public static Map<String, UserDetails> createDummyUserDetails() {

        Map<String, UserDetails> userDetailsHashMap = new HashMap<String, UserDetails>();
        User user1= new User(1L, "jim@domain.com", "$2a$10$g51wPrmsY0e6c4Ba04gUuOkdb/I1y6uBT2Ukb2ZnX28SErjgQ3mca", true);
        User user2= new User(2L, "bob@domain.com", "$2a$10$g51wPrmsY0e6c4Ba04gUuOkdb/I1y6uBT2Ukb2ZnX28SErjgQ3mca", true);
        User user3= new User(3L, "bili@domain.com", "$2a$10$g51wPrmsY0e6c4Ba04gUuOkdb/I1y6uBT2Ukb2ZnX28SErjgQ3mca", true);

        userDetailsHashMap.put(user1.getUsername(), user1);
        userDetailsHashMap.put(user2.getUsername(), user2);
        userDetailsHashMap.put(user3.getUsername(), user3);

        return userDetailsHashMap;
    }

    public static Map<Long, Item> createDummyItems() {
        Map<Long, Item> itemsMap = new HashMap<Long, Item>();

        Item item1 = new Item(1,"Lamp", "Lamp desc", 10);
        Item item2 = new Item(2, "Glass", "Glass desc", 5);
        Item item3 = new Item(3, "Table", "Table desc", 100);
        Item item4 = new Item(4, "Chair", "Chair desc", 25);

        itemsMap.put(item1.getId(), item1);
        itemsMap.put(item2.getId(), item2);
        itemsMap.put(item3.getId(), item3);
        itemsMap.put(item4.getId(), item4);

        return itemsMap;
    }

    public static Map<Long, List<LocalDateTime>> createDummyItemViews() {
        Map<Long, List<LocalDateTime>> itemViewsMap = new HashMap<Long, List<LocalDateTime>>();

        List<LocalDateTime> dateTimesList = new ArrayList<LocalDateTime>();
        LocalDateTime today = LocalDateTime.now();

        LocalDateTime today2 = today.minusMinutes(1);
        LocalDateTime today3 = today.minusMinutes(2);
        LocalDateTime today4 = today.minusMinutes(3);
        LocalDateTime today5 = today.minusMinutes(4);
        LocalDateTime today6 = today.minusMinutes(5);
        LocalDateTime today7 = today.minusMinutes(8);
        LocalDateTime today8 = today.minusMinutes(10);
        LocalDateTime today9 = today.minusMinutes(20);
        LocalDateTime today10 = today.minusMinutes(30);
        LocalDateTime today11 = today.minusMinutes(40);
        LocalDateTime today12 = today.minusMinutes(60);
        LocalDateTime today13 = today.minusMinutes(61);
        LocalDateTime today14 = today.minusMinutes(71);

        dateTimesList.add(today);
        dateTimesList.add(today2);
        dateTimesList.add(today3);
        dateTimesList.add(today4);
        dateTimesList.add(today5);
        dateTimesList.add(today6);
        dateTimesList.add(today7);
        dateTimesList.add(today8);
        dateTimesList.add(today9);
        dateTimesList.add(today10);
        dateTimesList.add(today11);
        dateTimesList.add(today12);
        dateTimesList.add(today13);
        dateTimesList.add(today14);

        itemViewsMap.put(1L, dateTimesList);
        itemViewsMap.put(2L, dateTimesList);


        LocalDateTime tempToday2 = today.minusMinutes(11);
        LocalDateTime tempToday3 = today.minusMinutes(21);
        LocalDateTime tempToday4 = today.minusMinutes(33);
        LocalDateTime tempToday5 = today.minusMinutes(44);
        LocalDateTime tempToday6 = today.minusMinutes(55);

        List<LocalDateTime> tempDateTimesList = new ArrayList<LocalDateTime>();
        tempDateTimesList.add(tempToday2);
        tempDateTimesList.add(tempToday3);
        tempDateTimesList.add(tempToday4);
        tempDateTimesList.add(tempToday5);
        tempDateTimesList.add(tempToday6);

        itemViewsMap.put(3L, tempDateTimesList);

        return itemViewsMap;
    }

    public static boolean checkRawAndEncodedPasswordMatch(String rawPassword, String encodedPassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        return encoder.matches(rawPassword, encodedPassword);
    }

    public static String encodePassword(String rawPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(rawPassword);
        return hashedPassword;
    }
}
