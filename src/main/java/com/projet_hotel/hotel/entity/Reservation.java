package com.projet_hotel.hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "idReservation")
 private int idReservation;
 @Column(name = "checkIn", columnDefinition = "DATETIME")
 private LocalDate checkIn;
 @Column(name = "checkOut", columnDefinition = "DATETIME")
 private LocalDate checkOut;

 @ManyToOne
 @JoinColumn(name = "idClient")
 private Client client;

 @ManyToOne
 @JoinColumn(name = "idRoom")
 private Room room;

 public Reservation(LocalDate checkIn, LocalDate checkOut, Client client, Room room) {
  this.checkIn = checkIn;
  this.checkOut = checkOut;
  this.client = client;
  this.room = room;
 }
}
