package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Royalty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRoyalty;

    private String name;

    private String description;

    private Integer pointCost;
}
