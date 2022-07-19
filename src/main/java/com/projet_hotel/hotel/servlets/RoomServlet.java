package com.projet_hotel.hotel.servlets;


import com.projet_hotel.hotel.entity.Room;
import com.projet_hotel.hotel.services.RoomService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "RoomServlet", value = "/rooms")
public class RoomServlet extends HttpServlet {

    private final RoomService  service = RoomService.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.setAttribute("checkIn", request.getAttribute("checkIn") );
//        request.setAttribute("checkOut", request.getAttribute("checkOut") );
//        request.getRequestDispatcher("/jsps/rooms.jsp" ).forward(request, response);
//        //response.sendRedirect("/jsps/rooms.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/jsps/rooms.jsp" ).forward(request, response);

    }
}
