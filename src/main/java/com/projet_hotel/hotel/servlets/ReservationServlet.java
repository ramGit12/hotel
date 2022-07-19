package com.projet_hotel.hotel.servlets;

import com.projet_hotel.hotel.entity.Client;
import com.projet_hotel.hotel.entity.Room;
import com.projet_hotel.hotel.services.ClientService;
import com.projet_hotel.hotel.services.RoomService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "RoomServlet", value = "/RoomServlet")
public class ReservationServlet extends HttpServlet {

    RoomService roomService = RoomService.getInstance();



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // logique metier

        Optional<Client> client = clientService.getOne(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("client", client);
        request.getRequestDispatcher("resume.jsp").forward(request, );
        Optional<Room> room = roomService.getOne(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("room", room);
        request.getRequestDispatcher("resume.jsp").forward( request, response );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
