package com.projet_hotel.hotel;

import com.projet_hotel.hotel.DAOs.ClientDAO;
import com.projet_hotel.hotel.DAOs.RoomDAO;
import com.projet_hotel.hotel.entity.Client;
import com.projet_hotel.hotel.entity.Reservation;
import com.projet_hotel.hotel.entity.Room;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String[] args) {

        List<Client> cli = new ArrayList<>();
        List<Reservation> res = new ArrayList<>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager manager = emf.createEntityManager();

//        Client a = new Client(1,"giuseppe","gucci","020202","gucci@gucci",res);
//        Client b = new Client(2,"abed","elbosso","020203","elbosso@elbosso",res);
          //Client c = new Client(3,"rami","ThePro","020204","thepro@thepro",res);
        RoomDAO dao = new RoomDAO(manager);
//        cli.add(a);
//        cli.add(b);
//        cli.add(c);
//        cli.add(d);
//
//        Optional<Client> c = dao.getById(3);
//        Client client = c.get();
//        client.setFirstName("TheProPro");
//        dao.update(client);

        List<Room> l = dao.getAll();
        for (Room r : l) {
            System.out.println(r.getRoomId());
        }





    }
}
