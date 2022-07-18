package com.projet_hotel.hotel.services;

import com.projet_hotel.hotel.DAOs.RoomDAO;
import com.projet_hotel.hotel.entity.Room;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RoomService {
    private static RoomService instance;
    private static RoomService getInstance(){
        return instance == null? instance = new RoomService() : instance;
    }

    EntityManagerFactory emf  = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    RoomDAO dao = new RoomDAO(em);
    private RoomService(){
    }

    private final List<Room> list = new ArrayList();

    public List<Room> getAll(){
        return new ArrayList<>(list);
    }

    public Optional<Room> getOne(int id){
        return dao.getById(id);
    }


    public void insert(Room toInsert){
        dao.insert(toInsert);
    }
}
