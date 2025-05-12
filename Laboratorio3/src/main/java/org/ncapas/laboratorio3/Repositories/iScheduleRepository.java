package org.ncapas.laboratorio3.Repositories;

public interface iScheduleRepository extends iGenericRepository<Schedule, Integer> {

    List<Schedule> findByName(String name);
    List<Schedule> findByStartTime(String startTime);
    List<Schedule> findByEndTime(String endTime);
    List<Schedule> findByDayOfWeek(String dayOfWeek);
    List<Schedule> findByIsActive(Boolean isActive);
}