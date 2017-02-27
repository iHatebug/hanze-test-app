package com.hanze.service;

import com.hanze.SpringBootSampleTest;
import com.hanze.domain.Item;
import com.hanze.domain.Room;
import com.hanze.domain.RoomType;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;


import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Hanze on 25/02/2017.
 */
public class ItemRepositoryTest extends SpringBootSampleTest {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private ItemRepository itemRepository;

    private Room room;

    @Before
    public void setup(){
        room = new Room();
        room.setRoomNo("101");
        room.setRoomType(RoomType.SINGLE_BED);
        room.setPrice(new BigDecimal("149.00456893"));
        room = roomRepository.save(room);

        Item item1 = new Item();
        item1.setRoom(room);
        item1.setTotal(new BigDecimal("1089.99"));
        itemRepository.save(item1);

        Item item = new Item();
        item.setRoom(room);
        item.setTotal(new BigDecimal("2333.99"));
        itemRepository.save(item);
    }

    @Test
    public void shouldFindOrder() throws Exception{
        List<Item> orderList = itemRepository.findByRoom(room);
        assertThat(orderList.size()).isEqualTo(2);
    }
}
