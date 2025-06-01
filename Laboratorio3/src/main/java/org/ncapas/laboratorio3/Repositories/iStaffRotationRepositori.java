package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Floor;
import org.ncapas.laboratorio3.Domain.Entities.Schedule;
import org.ncapas.laboratorio3.Domain.Entities.StaffRotation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface iStaffRotationRepositori extends JpaRepository<StaffRotation, Integer> {

    List<StaffRotation> findByIdStaffRotation(UUID idStaffRotation);
    List<StaffRotation> findByNameRotation(String nameRotation);
    List<StaffRotation> findByStatus(String status);
    List<StaffRotation> findBySchedule(Schedule schedule);
    List<StaffRotation> findByFloor(Floor floor);

}