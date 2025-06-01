package org.ncapas.laboratorio3.Repositories;


import org.ncapas.laboratorio3.Domain.Entities.Colors;
import org.ncapas.laboratorio3.Domain.Entities.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iFloorRepository extends JpaRepository<Floor, UUID> {

    List<Floor> findByIdFloor(UUID idFloor);

    @Query("SELECT f FROM Floor f WHERE f.name = :name")
    Floor findByName(@Param("name") String name);

    @Query(value = "SELECT * FROM Floor WHERE colors = :colors", nativeQuery = true)
    List<Floor> findByColors(@Param("colors") Colors colors);
}