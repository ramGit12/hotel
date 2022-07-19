package com.projet_hotel.hotel.services;

import com.projet_hotel.hotel.DAOs.ClientDAO;
import com.projet_hotel.hotel.entity.Client;
import com.projet_hotel.hotel.listeners.JpaListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientService {

    private final ClientDAO dao = new ClientDAO();

    private static ClientService instance;
    public static ClientService getInstance(){
        System.out.println("recup de l'instance du service");
        return instance == null ? instance = new ClientService() : instance;
    }

    public ClientService() {}
    // endregion

    public List<Client> getAll(){
        return dao.getAll();
    }

    public Optional<Client> getOne(int id){
        return dao.getById(id);
    }

    public void insert(Client toInsert){
        dao.insert(toInsert);
    }
}
