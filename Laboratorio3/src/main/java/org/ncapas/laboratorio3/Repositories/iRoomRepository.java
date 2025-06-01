package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Floor;
import org.ncapas.laboratorio3.Domain.Entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iRoomRepository extends JpaRepository<Room, Integer> {

    List<Room> findByIdRoom(UUID idRoom);
    List<Room> findByName(String name);
    List<Room> findByFloor(Floor floor);

}