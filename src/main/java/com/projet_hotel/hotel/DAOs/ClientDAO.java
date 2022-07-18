package com.projet_hotel.hotel.DAOs;

import com.projet_hotel.hotel.entity.Client;
import com.projet_hotel.hotel.exceptions.EntityAlreadyExistsException;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class ClientDAO {

    private final EntityManager manager;



    public ClientDAO(EntityManager manager) {
        this.manager = manager;
    }

    //get by ID
    public Optional<Client> getById(int id ){
        return Optional.ofNullable( manager.find(Client.class, id) );
    }

    //get all
    public List<Client> getAll(){
        TypedQuery<Client> query = manager.createQuery("SELECT c FROM Client c", Client.class);
        return query.getResultList();
    }

    //insert one
    public void insert( Client toInsert ){

        try{
            beginTransact();
            manager.persist(toInsert);
            commit();
        }
        catch (RollbackException ex){
            throw new EntityAlreadyExistsException(toInsert.getClientId(), Client.class);
        }

    }

    //deleting
    public void deleteById(int id){

        beginTransact();
        getById(id).ifPresent( manager::remove );
        commit();

    }


    //updating
    public void update( Client client ){

        if( client == null )
            throw new IllegalArgumentException("section cannot be null");

        if( !existsById(client.getClientId()))
            throw new EntityNotFoundException("Entity not found");

        beginTransact();
        manager.merge(client);
        commit();
    }

    public boolean existsById(int id){
        TypedQuery<Integer> query = manager.createQuery("SELECT COUNT(c) FROM Client c WHERE c.id = " + id, Integer.class);
        return query.getSingleResult() > 0;
    }

    private void beginTransact(){
        manager.getTransaction().begin();
    }

    private void commit(){
        manager.getTransaction().commit();
    }


}
