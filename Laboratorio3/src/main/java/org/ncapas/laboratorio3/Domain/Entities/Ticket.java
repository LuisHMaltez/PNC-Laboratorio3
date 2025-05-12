package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTicket;

    @Column
    private Date dateTicket;
    @Column
    private double Tally;

}
