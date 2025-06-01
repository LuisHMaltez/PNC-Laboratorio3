package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Branch;
import org.ncapas.laboratorio3.Domain.Entities.Person;
import org.ncapas.laboratorio3.Domain.Entities.StaffAssigment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface iStaffAssigmentRepository extends JpaRepository<StaffAssigment, UUID> {

    List<StaffAssigment> findByIdStaffAssigment(UUID idStaffAssigment);
    List<StaffAssigment> findByPerson(Person person);
    List<StaffAssigment> findByBranch(Branch branch);
    List<StaffAssigment> findByDepartment(String Department);
    List<StaffAssigment> findByHead(Boolean head);
}