package com.vs.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ROOM_TYPES")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomType implements Serializable {
    @Id
    @Column(name = "ROOM_TYPE_ID")
    Integer roomTypeId;
    @Column(name = "ROOM_TYPE_NAME")
    String roomTypeName;
    @Column(name = "PRICE_PER_NIGHT")
    Float pricePerNight;
    @Column(name = "DESCRIPTION")
    String description;
}