package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Colors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface iColorRepository extends JpaRepository<Colors, Integer> {
    
    List<Colors> findByName(String name);
    
    List<Colors> findByHexCsode(String hexCode);
}
