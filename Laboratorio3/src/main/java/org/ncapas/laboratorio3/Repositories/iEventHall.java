package org.ncapas.laboratorio3.Repositories;

@Repository
public interface iEventHall extends JpaRepository<EventHall, UUID> {
    List<EventHall> findByName(String name);
    List<EventHall> findByCapacity(int capacity);
    List<EventHall> findByDistinctive(String distinctive);
}