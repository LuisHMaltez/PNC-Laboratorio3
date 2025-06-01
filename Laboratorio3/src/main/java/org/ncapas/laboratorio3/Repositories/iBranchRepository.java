package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iBranchRepository extends JpaRepository<Branch, Integer> {

    List<Branch> findByIdBranch(UUID idBranch);
    List<Branch> findByName(String name);
    List<Branch> findByLocation(String location);
}