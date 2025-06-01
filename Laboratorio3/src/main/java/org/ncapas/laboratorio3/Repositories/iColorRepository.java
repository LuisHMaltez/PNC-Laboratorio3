package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Colors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface iColorRepository extends JpaRepository<Colors, Integer> {

    List<Colors> findByColorName(String colorName);
    List<Colors> findByHexCode(String hexCode);

}
