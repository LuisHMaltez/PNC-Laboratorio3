package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

public class StaffAssigment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idStaffAssigment;
    @Column
    private String Branch;//
    @Column
    private String Department;
    @Column
    private String Superior;
    @Column
    private Boolean Head; //ES O NO COORDINADOR

}
