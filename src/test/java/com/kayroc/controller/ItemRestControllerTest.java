package com.kayroc.controller;



import com.kayroc.model.Item;
import com.kayroc.service.ItemServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(value = ItemRestController.class, secure = false)
public class ItemRestControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    ItemServiceImpl itemService;

    private Item item;


    @Before
    public void prepare() {
        item = new Item(1l,"Lamp", "Lamp desc", 10);
    }

    @Test
    public void findById() throws Exception {
        given(itemService.findById(1l)).willReturn(item);
        mvc.perform(get("/api/item/1").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.name", is("Lamp")))
                .andExpect(jsonPath("$.description", is("Lamp desc")))
                .andExpect(jsonPath("$.price", is(10.0)));
    }

    @Test
    public void itemNotFoundTest() throws Exception {
        given(itemService.findById(1l)).willReturn(item);
        mvc.perform(get("/api/item/10").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isNotFound());
     }
}
