package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Royalty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iRoyaltyRepository extends JpaRepository<Royalty, Integer> {

    List<Royalty> findByIdRoyalty(UUID idRoyalty);
    List<Royalty> findByName(String name);

    List<Royalty> findByDescription(String description);
    List<Royalty> findByPointCost(Integer pointCost);
}
