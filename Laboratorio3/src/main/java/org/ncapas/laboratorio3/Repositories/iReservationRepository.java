package org.ncapas.laboratorio3.Repositories;


import org.ncapas.laboratorio3.Domain.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iReservationRepository extends JpaRepository<Reservation, Integer> {

    List<Reservation> findByGuestId(Long guestId);

    List<Reservation> findByRoomId(Integer roomId);

    List<Reservation> findByEventHallId(Integer eventHallId);

    List<Reservation> findByActive(Boolean active);
}