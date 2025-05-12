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

    @Column
    private  String nameRotation;

    @ManyToOne
    @JoinColumn(name = "idschedule", nullable = false, foreignKey = @ForeignKey(name = "FK_idSchedule"))//horario asignado
    private Schedule schedule ;

    @ManyToOne
    @JoinColumn(name = "idfloor", nullable = false, foreignKey = @ForeignKey(name = "FK_idFloor"))// piso asignado
    private Floor floor ;

}
