package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Colors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iColorsRepository extends JpaRepository<Colors, UUID> {

    List<Colors> findByIdColors(UUID idColors);

    @Query("SELECT c FROM Colors c WHERE c.hexCode = :hex")
    Colors findByHex(@Param("hex") String hex);

    @Query(value = "SELECT * FROM colors WHERE color_name = :name", nativeQuery = true)
    Colors findByName(@Param("name") String name);
}
