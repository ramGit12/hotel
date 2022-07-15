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
    @Column(name = "idClient")
    private int clientId;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "phone")
    private String tel;
    @Column(name = "email")
    private String mail;

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservationListClient;

}
