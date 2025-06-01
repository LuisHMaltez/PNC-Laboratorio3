package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.StaffRotation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface iStaffRotationRepositori extends JpaRepository<StaffRotation, Integer> {
    List<StaffRotation> findByNameRotation(String nameRotation);
    List<StaffRotation> findByStatus(String status);

}