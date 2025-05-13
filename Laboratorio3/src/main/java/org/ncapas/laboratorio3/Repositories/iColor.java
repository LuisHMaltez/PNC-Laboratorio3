package org.ncapas.laboratorio3.Repositories;

public interface iColorRepository extends iGenericRepository<Color, Integer> {

    List<Color> findByName(String name);
    List<Color> findByHexCsode(String hexCode);
}
