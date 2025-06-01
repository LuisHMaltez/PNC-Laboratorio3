package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffRotation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idStaffRotation;

    @Column(nullable = false)
    private  String nameRotation;

    @Column(nullable = false)
    private  String status;

    @ManyToOne
    @JoinColumn(name = "schedule_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Schedule"))
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "floor_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Floor"))
    private Floor floor;

}
