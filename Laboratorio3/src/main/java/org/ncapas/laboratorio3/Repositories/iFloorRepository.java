package org.ncapas.laboratorio3.Repositories;


import org.ncapas.laboratorio3.Domain.Entities.Floor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface iFloorRepository extends JpaRepository<Floor, Integer> {

    List<Floor> findByName(String name);

}