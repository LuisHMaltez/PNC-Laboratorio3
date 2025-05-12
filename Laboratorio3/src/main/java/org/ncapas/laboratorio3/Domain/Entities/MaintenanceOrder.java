package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class MaintenanceOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMaintenanceOrder;

    @ManyToOne
    private Person reportedBy;

    @ManyToOne
    private Room room;

    private LocalDate date;
    private LocalTime time;
    private String description;
}
