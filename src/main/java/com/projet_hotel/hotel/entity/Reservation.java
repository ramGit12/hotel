package com.projet_hotel.hotel.entity;

import jdk.internal.logger.LocalizedLoggerWrapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

 @Id
 @Column(name = "idReservation")
 private int idReservation;
 @Column(name = "checkIn")
 private LocalDate checkIn;
 @Column(name = "checkOut")
 private LocalDate checkOut;

 @ManyToOne
 private Client client;

 @ManyToOne
 private Room room;

}
