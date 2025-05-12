package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iRoomRepository extends JpaRepository<Room, Integer> {

    List<Room> findByName(String name);

    List<Room> findByFloorId(Integer floorId);
}
