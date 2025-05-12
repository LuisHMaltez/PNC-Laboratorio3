package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.UUID;

public class GuesPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idGuesPoints;

    @Column
    private double Point;

    @Column
    private String PointOrigin;
    @Column
    private Date LastSum;
}
