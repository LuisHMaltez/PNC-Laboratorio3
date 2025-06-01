package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaintenanceOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idMaintenanceOrder;

    @Column
    private String roomId; //Arreglar esto para que sea una referencia a la entidad Room

    @ManyToOne
    private Person reportedBy;

    @ManyToOne
    private Room room;

    private LocalDate date;
    private LocalTime time;
    private String description;
}
