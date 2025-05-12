package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Royalty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iRoyaltyRepository extends JpaRepository<Royalty, Integer> {

    List<Royalty> findByName(String name);

    List<Royalty> findByPointCost(Integer pointCost);
}
