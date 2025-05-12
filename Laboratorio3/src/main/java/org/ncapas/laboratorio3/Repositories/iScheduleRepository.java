package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface iScheduleRepository extends JpaRepository<Schedule, Integer> {

    List<Schedule> findByName(String name);
    List<Schedule> findByStartTime(String startTime);
    List<Schedule> findByEndTime(String endTime);
    List<Schedule> findByDayOfWeek(String dayOfWeek);
    List<Schedule> findByIsActive(Boolean isActive);
}