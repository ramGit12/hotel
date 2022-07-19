package com.projet_hotel.hotel.servlets;

import com.projet_hotel.hotel.entity.Client;
import com.projet_hotel.hotel.entity.Reservation;
import com.projet_hotel.hotel.entity.Room;
import com.projet_hotel.hotel.services.ClientService;
import com.projet_hotel.hotel.services.ReservationService;
import com.projet_hotel.hotel.services.RoomService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@WebServlet(name = "PayementServlet", value = "/PayementServlet")
public class PayementServlet extends HttpServlet {

    private final ClientService service = new ClientService();
    private final RoomService serviceRoom = new RoomService();
    private final ReservationService serviceReservation = new ReservationService();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Client client = new Client(request.getParameter("nom"),
                request.getParameter("prenom"),
                request.getParameter("tel"),
                request.getParameter("email"));
        service.insert(client);

        Room room = serviceRoom.getOne(Integer.parseInt(request.getParameter("id")))
                .orElseThrow(() -> new RuntimeException("not found"));


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        LocalDate in = LocalDate.parse(request.getParameter("checkIn"), formatter);
        LocalDate out = LocalDate.parse(request.getParameter("checkOut"), formatter);

        Reservation reservation = new Reservation(in, out, client, room);

        serviceReservation.insert(reservation);

        request.setAttribute("checkIn", request.getParameter("checkIn") );
        request.setAttribute("checkOut", request.getParameter("checkOut") );
        request.getRequestDispatcher("/resume.jsp" ).forward(request, response);
    }
}
