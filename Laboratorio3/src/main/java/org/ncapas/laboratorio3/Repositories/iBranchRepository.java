package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iBranchRepository extends JpaRepository<Branch, UUID> {

    List<Branch> findByIdBranch(UUID idBranch);

    @Query("SELECT b FROM Branch b WHERE b.location = :location")
    List<Branch> findByLocation(@Param("location") String location);

    @Query(value = "SELECT * FROM branch WHERE name = :name", nativeQuery = true)
    List<Branch> findByName(@Param("name") String name);
}