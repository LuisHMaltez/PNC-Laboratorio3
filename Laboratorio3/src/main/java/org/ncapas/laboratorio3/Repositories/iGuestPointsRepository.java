package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.GuestPoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iGuestPointsRepository extends JpaRepository<GuestPoints, UUID> {

    List<GuestPoints> findByIdGuestPoints(UUID idGuestPoints);

    @Query(value = "SELECT * FROM guest_points WHERE guest_id = :guestId", nativeQuery = true)
    List<GuestPoints> findByGuest(@Param("guestId") UUID guestId);
}