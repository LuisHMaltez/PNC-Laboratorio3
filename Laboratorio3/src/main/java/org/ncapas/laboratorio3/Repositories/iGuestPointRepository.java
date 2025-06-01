package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.GuestPoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iGuestPointRepository extends JpaRepository<GuestPoints, UUID> {

    List<GuestPoints> findByIdGuestPoints(UUID idGuestPoints);
    List<GuestPoints> findByPoint(double point);

    List<GuestPoints> findByPointOrigin(String pointOrigin);

}