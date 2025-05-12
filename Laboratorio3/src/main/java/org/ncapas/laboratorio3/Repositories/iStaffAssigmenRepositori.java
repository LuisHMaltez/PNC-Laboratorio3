package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.StaffAssigment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface iStaffAssigmenRepositori extends JpaRepository<StaffAssigment, Integer> {

    List<StaffAssigment> findByName(String name);
}