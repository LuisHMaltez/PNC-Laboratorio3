package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.EventHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iEventHallRepository extends JpaRepository<EventHall, UUID> {

    List<EventHall> findByDistinctive(String distinctive);

    @Query("SELECT e FROM EventHall e WHERE e.capacity > :min")
    List<EventHall> findByCapacityGreaterThan(@Param("min") int min);

    @Query(value = "SELECT * FROM event_hall WHERE name = :name", nativeQuery = true)
    List<EventHall> findByName(@Param("name") String name);
}