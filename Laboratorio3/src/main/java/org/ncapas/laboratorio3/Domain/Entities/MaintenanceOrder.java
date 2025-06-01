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

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Employee"))
    private Employee reportedBy;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Room"))
    private Room room;

    private LocalDate date;
    private LocalTime time;

    @Column(length = 300, nullable = false)
    private String description;
}
