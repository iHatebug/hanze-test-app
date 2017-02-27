package com.hanze.service;

import com.hanze.SpringBootSampleTest;
import com.hanze.domain.Room;
import com.hanze.domain.RoomType;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Hanze on 12/02/2017.
 */
public class RoomRepositoryTest extends SpringBootSampleTest{

    @Autowired
    private RoomRepository roomRepository;

    @Before
    public void setup(){
        Room room = new Room();
        room.setRoomNo("101");
        room.setRoomType(RoomType.SINGLE_BED);
        room.setPrice(new BigDecimal("149.00456893"));
        roomRepository.save(room);
    }

    @Test
    public void shouldFindRoom(){
        Room room = this.roomRepository.findByRoomNo("101");
        assertNotNull(room);
    }
}
