package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iGuestRepository extends JpaRepository<Guest, UUID> {

    List<Guest> findByFirstName(String firstName);

    @Query("SELECT g FROM Guest g WHERE g.lastName = :lastName")
    List<Guest> findByLastName(@Param("lastName") String lastName);

    @Query(value = "SELECT * FROM guest WHERE email = :email", nativeQuery = true)
    Guest findByEmail(@Param("email") String email);
}
