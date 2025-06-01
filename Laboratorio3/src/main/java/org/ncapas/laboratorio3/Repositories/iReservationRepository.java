package org.ncapas.laboratorio3.Repositories;


import org.ncapas.laboratorio3.Domain.Entities.EventHall;
import org.ncapas.laboratorio3.Domain.Entities.Person;
import org.ncapas.laboratorio3.Domain.Entities.Reservation;
import org.ncapas.laboratorio3.Domain.Entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface iReservationRepository extends JpaRepository<Reservation, Integer> {

    List<Reservation> findByGuest(Person guest);
    List<Reservation> findByRoom(Room room);
    List<Reservation> findByEventHall(EventHall eventHall);
    List<Reservation> findByActive(Boolean active);

}