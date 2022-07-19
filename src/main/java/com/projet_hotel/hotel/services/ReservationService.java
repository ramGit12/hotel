package com.projet_hotel.hotel.services;

import com.projet_hotel.hotel.DAOs.ReservationDAO;
import com.projet_hotel.hotel.entity.Reservation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReservationService {


    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    ReservationDAO dao =  new ReservationDAO(em);

    // region SINGLETON
    private static ReservationService instance;
    public static ReservationService getInstance(){
        System.out.println("recup de l'instance du service");
        return instance == null ? instance = new ReservationService() : instance;
    }
    public ReservationService() {}
    // endregion

    private final List<Reservation> list = new ArrayList<>();

    public List<Reservation> getAll(){
        return new ArrayList<>(list);
    }


    //getOne
    public Optional<Reservation> oneOfIt(int id){
        return dao.getById(id);
    }

    //getAll
    public List<Reservation> allOfIt() {
        return dao.getAll();
    }

    //insertOne
    public void insert(Reservation toInsert){
         dao.insert(toInsert);
    }

    //deleting
    public void deleteIt(int id) {
        dao.deleteById(id);
    }

    //updating
    public void updateIt (Reservation reservation) {
        dao.update(reservation);
    }


}
