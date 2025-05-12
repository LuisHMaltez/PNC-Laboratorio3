package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffAssigment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idStaffAssigment;
    @Column
    private String PersonId;
    @Column
    private String Branch;
    @Column
    private String Department;
    @Column
    private String Superior;
    @Column
    private Boolean Head; //ES O NO COORDINADOR
    @ManyToOne
    @JoinColumn(name = "idStaffRotation", nullable = false, foreignKey = @ForeignKey(name = "FK_StaffRotation"))// rotacion del staff
    private StaffRotation staffRotation ;



}
