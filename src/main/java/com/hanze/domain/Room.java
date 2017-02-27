package com.hanze.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by Hanze on 12/02/2017.
 */

@Entity
@Table(name = "ROOM")
public class Room implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "ROOM_NO")
    private String roomNo;

    @NotNull
    @Column(name = "PRICE")
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROOM_TYPE")
    private RoomType roomType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "room")
    private Set<Item> items;

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Set<Item> getOrders() {
        return items;
    }

    public void setOrders(Set<Item> items) {
        this.items = items;
    }
}
