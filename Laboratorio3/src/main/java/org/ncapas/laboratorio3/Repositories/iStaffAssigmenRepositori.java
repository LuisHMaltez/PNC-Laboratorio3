package org.ncapas.laboratorio3.Repositories;

public interface iStaffAssigmenRepositori extends iGenericRepository<StaffAssignment, Integer> {

    List<StaffAssignment> findByName(String name);
}