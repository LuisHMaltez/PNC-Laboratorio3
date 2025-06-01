package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.EventHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iEventHall extends JpaRepository<EventHall, UUID> {

    List<EventHall> findByIdEventHall(UUID idEventHall);
    List<EventHall> findByName(String name);
    List<EventHall> findByCapacity(int Capacity);
    List<EventHall> findByDistinctive(String distinctive);

}