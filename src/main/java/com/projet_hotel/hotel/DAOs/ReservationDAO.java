package com.projet_hotel.hotel.DAOs;

import com.projet_hotel.hotel.entity.Reservation;
import com.projet_hotel.hotel.exceptions.EntityAlreadyExistsException;
import com.projet_hotel.hotel.listeners.JpaListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class ReservationDAO {

    private final EntityManager manager = JpaListener.createEntityManager();


    public ReservationDAO(EntityManager manager) {
    }

    //getOne
    public Optional<Reservation> getById(int id ){
        return Optional.ofNullable( manager.find(Reservation.class, id) );
    }

    //getAll
    public List<Reservation> getAll(){
        TypedQuery<Reservation> query = manager.createQuery("SELECT r FROM Reservation  r", Reservation.class);
        return query.getResultList();
    }

    //insertOne
    public void insert( Reservation toInsert ){

        try{
            beginTransact();
            manager.persist(toInsert);
            commit();
        }
        catch (RollbackException ex){
            throw new EntityAlreadyExistsException(toInsert.getIdReservation(), Reservation.class);
        }

    }

    //deleting
    public void deleteById(int id){

        beginTransact();
        getById(id).ifPresent( manager::remove );
        commit();

    }


    //updating
    public void update( Reservation reservation ){

        if( reservation == null )
            throw new IllegalArgumentException("reservation cannot be null");

        if( !existsById(reservation.getIdReservation()))
            throw new EntityNotFoundException("Entity not found");

        beginTransact();
        manager.merge(reservation);
        commit();
    }

    public boolean existsById(int id){
        TypedQuery<Integer> query = manager.createQuery("SELECT COUNT(r) FROM Reservation r WHERE r.id = " + id, Integer.class);
        return query.getSingleResult() > 0;
    }

    private void beginTransact(){
        manager.getTransaction().begin();
    }

    private void commit(){
        manager.getTransaction().commit();
    }


}
