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
public class StaffAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idStaffAssignment;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Employee"))
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Branch"))
    private Branch branch;

    @Column
    private String Department;

    @Column
    private String Superior;

    @Column(nullable = false)
    private Boolean Head; //ES O NO COORDINADOR

    @ManyToOne
    @JoinColumn(name = "staff_rotation_id", nullable = false, foreignKey = @ForeignKey(name = "FK_StaffRotation"))
    private StaffRotation staffRotation ;



}
