package com.hanze.service;

import com.hanze.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hanze on 12/02/2017.
 */
public interface RoomRepository extends JpaRepository<Room,Long> {
    Room findByRoomNo(String roomNo);
}
