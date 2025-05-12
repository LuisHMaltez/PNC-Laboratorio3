package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;

    @ManyToOne
    private Person guest;

    @ManyToOne
    private Room room;

    @ManyToOne
    private EventHall eventHall;

    private LocalDate checkIn;
    private LocalDate checkOut;
    private boolean active;
}
