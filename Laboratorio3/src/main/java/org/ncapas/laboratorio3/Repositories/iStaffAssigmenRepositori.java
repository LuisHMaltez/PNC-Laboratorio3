package org.ncapas.laboratorio3.Repositories;

public interface iStaffAssigmenRepositori extends JpaRepository<StaffAssignment, Integer> {

    List<StaffAssignment> findByName(String name);
}