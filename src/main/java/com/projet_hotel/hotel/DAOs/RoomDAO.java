package com.projet_hotel.hotel.DAOs;

import com.projet_hotel.hotel.entity.Client;
import com.projet_hotel.hotel.entity.Room;
import com.projet_hotel.hotel.exceptions.EntityAlreadyExistsException;
import com.projet_hotel.hotel.listeners.JpaListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class RoomDAO {

    private final EntityManager manager = JpaListener.createEntityManager();

    public RoomDAO(EntityManager manager) {
    }

    //get by ID
    public Optional<Room> getById(int id ){
        return Optional.ofNullable( manager.find(Room.class, id) );
    }

    //get all
    public List<Room> getAll(){
        TypedQuery<Room> query = manager.createQuery("SELECT r FROM Room r", Room.class);
        return query.getResultList();
    }

    //insert one
    public void insert( Room toInsert ){

        try{
            beginTransact();
            manager.persist(toInsert);
            commit();
        }
        catch (RollbackException ex){
            throw new EntityAlreadyExistsException(toInsert.getRoomId(), Room.class);
        }

    }

    //deleting
    public void deleteById(int id){

        beginTransact();
        getById(id).ifPresent( manager::remove );
        commit();

    }


    //updating
    public void update( Room room ){

        if( room == null )
            throw new IllegalArgumentException("room cannot be null");

        if( !existsById(room.getRoomId()))
            throw new EntityNotFoundException("Entity not found");

        beginTransact();
        manager.merge(room);
        commit();
    }

    public boolean existsById(int id){
        TypedQuery<Integer> query = manager.createQuery("SELECT COUNT(r) FROM Room r WHERE r.id = " + id, Integer.class);
        return query.getSingleResult() > 0;
    }

    private void beginTransact(){
        manager.getTransaction().begin();
    }

    private void commit(){
        manager.getTransaction().commit();
    }

}
