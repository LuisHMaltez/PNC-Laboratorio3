package org.ncapas.laboratorio3.Repositories;


import org.ncapas.laboratorio3.Domain.Entities.Branch;
import org.ncapas.laboratorio3.Domain.Entities.StaffAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface iStaffAssigmentRepository extends JpaRepository<StaffAssignment, UUID> {


}