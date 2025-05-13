package org.ncapas.laboratorio3.Repositories;


public interface iFloorRepository extends iGenericRepository<Floor, Integer> {

    List<Floor> findByName(String name);

}