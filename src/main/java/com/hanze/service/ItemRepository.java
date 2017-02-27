package com.hanze.service;

import com.hanze.domain.Item;
import com.hanze.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Hanze on 25/02/2017.
 */
public interface ItemRepository extends JpaRepository<Item,Long> {
    List<Item> findByRoom(Room room);
}
