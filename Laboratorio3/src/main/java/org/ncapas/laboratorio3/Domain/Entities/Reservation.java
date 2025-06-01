package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idReservation;

    @ManyToOne
    private Person guest; //arreglar esto para que sea una referencia a la entidad Person

    @ManyToOne
    private Room room; //arreglar esto para que sea una referencia a la entidad Room

    @ManyToOne
    private EventHall eventHall; //arreglar esto para que sea una referencia a la entidad EventHall

    private LocalDate checkIn;
    private LocalDate checkOut;
    private boolean active;
}
