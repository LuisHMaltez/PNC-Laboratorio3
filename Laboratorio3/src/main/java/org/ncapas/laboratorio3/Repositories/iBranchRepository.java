package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iBranchRepository extends JpaRepository<Branch, Integer> {

    List<Branch> findByName(String name);

    List<Branch> findByLocation(String location);
}