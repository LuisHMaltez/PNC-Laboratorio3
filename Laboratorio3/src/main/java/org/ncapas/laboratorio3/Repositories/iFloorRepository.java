package org.ncapas.laboratorio3.Repositories;


public interface iFloorRepository extends JpaRepository<Floor, Integer> {

    List<Floor> findByName(String name);

}