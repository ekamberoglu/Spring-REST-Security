package com.kayroc.controller;

import com.kayroc.model.Item;
import com.kayroc.model.Order;
import com.kayroc.service.ItemNotFoundException;
import com.kayroc.service.ItemService;
import com.kayroc.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ItemRestController {

    private final Logger LOG = LoggerFactory.getLogger(ItemRestController.class);

    @Autowired
    ItemService itemService;

    @Autowired
    OrderService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Item>> listAllItems() {

       LOG.info("Getting all items - listAllItems()");

       List<Item> items = itemService.findAllItems();
        if (items.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getItemById(@PathVariable("id") long id) {

        LOG.info("Getting item with id: {}", id);

        Item item = itemService.findById(id);
        if (item == null) {
            return new ResponseEntity(new ItemNotFoundException(id), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ResponseEntity<?> orderItems(@RequestBody Order order) {
        LOG.info("Ordering an item: {}", order);

        order = orderService.orderItems(order);
        return new ResponseEntity<Order>(order, HttpStatus.OK);
    }
}