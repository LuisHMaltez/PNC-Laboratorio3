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

    @ManyToOne
    @JoinColumn(name = "idPerson", nullable = false, foreignKey = @ForeignKey(name = "FK_Person")) // persona
    private Person person;

    @ManyToOne
    @JoinColumn(name = "idBranch", nullable = false, foreignKey = @ForeignKey(name = "FK_Branch")) // sucursal
    private Branch branch;

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
