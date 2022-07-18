package com.projet_hotel.hotel.entity;

import com.projet_hotel.hotel.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.swing.text.StyledEditorKit;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @Column(name = "idRoom")
    private int roomId;
    @Column(name = "roomNbr")
    private String roomNbr;
    @Column(name = "roomType")
    private String roomType;
    @Column(name = "tv")
    private Boolean tv;
    @Column(name = "coffeeMachine")
    private Boolean coffeeMachine;
    @Column(name = "shower")
    private Boolean shower;
    @Column(name = "minibar")
    private Boolean miniBar;
    @Column(name = "outdoor")
    private Boolean outdoor;
    @Column(name = "animals")
    private Boolean animalsAccepted;
    @Column(name = "kitchen")
    private Boolean kitchen;
    @Column(name = "children")
    private Boolean children;
    @Column(name = "addBed")
    private Boolean additionalBed;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "price")
    private double price;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservationListRoom;




}
