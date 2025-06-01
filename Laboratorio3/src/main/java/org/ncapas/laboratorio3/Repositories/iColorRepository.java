package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Colors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface iColorRepository extends JpaRepository<Colors, UUID> {

    List<Colors> findByIdColors(UUID idColors);
    List<Colors> findByColorName(String colorName);
    List<Colors> findByHexCode(String hexCode);

}
