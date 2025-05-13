package org.ncapas.laboratorio3.Repositories;

public interface iStaffRotationRepositori extends iGenericRepository<StaffRotation, Integer> {
    List<StaffRotation> findByName(String name);
    List<StaffRotation> findByStartDate(Date startDate);
    List<StaffRotation> findByEndDate(Date endDate);
    List<StaffRotation> findByStatus(String status);
    List<StaffRotation> findByLocation(String location);
}