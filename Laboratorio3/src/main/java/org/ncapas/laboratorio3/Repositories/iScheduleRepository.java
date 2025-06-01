package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public interface iScheduleRepository extends JpaRepository<Schedule, UUID> {

    List<Schedule> findByIdSchedule(UUID idSchedule);
    List<Schedule> findByStartTime(LocalTime startTime);
    List<Schedule> findByEndTime(LocalTime endTime);
    List<Schedule> findByDayOfWeek(String dayOfWeek); // fixed here
    List<Schedule> findByStatus(boolean isActive);
}
