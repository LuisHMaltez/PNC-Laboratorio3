package org.ncapas.laboratorio3.Repositories;

@Repository
public interface iGuestPointRepository extends JpaRepository<GuestPoints, UUID> {
    GuestPoints findByIdGuestPoints(UUID idGuestPoints);
    List<GuestPoints> findByPoint(double point);
}