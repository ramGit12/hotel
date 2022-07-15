package com.projet_hotel.hotel.entity;

import com.projet_hotel.hotel.entity.Reservation;
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
public class Client {

    @Id
    private int clientId;
    private String lastName;
    private String firstName;
    private String tel;
    private String mail;

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservationListClient;

}
