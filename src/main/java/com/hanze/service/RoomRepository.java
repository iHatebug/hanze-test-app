package com.hanze.service;

import com.hanze.domain.Room;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Hanze on 12/02/2017.
 */
public interface RoomRepository extends CrudRepository<Room,Long> {
    Room findByRoomNo(String roomNo);
}
