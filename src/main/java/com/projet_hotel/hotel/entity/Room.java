package com.projet_hotel.hotel.entity;

import com.projet_hotel.hotel.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private int roomId;
    private String roomNbr;
    private String roomType;
    private Boolean tv;
    private Boolean coffeMachine;
    private Boolean shower;
    private Boolean miniBar;
    private Boolean outdor;
    private Boolean animalsAccepted;
    private Boolean kitchen;
    private Boolean children;
    private Boolean additionalBed;
    private int capacity;
    private double price;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservationListRoom;




}
