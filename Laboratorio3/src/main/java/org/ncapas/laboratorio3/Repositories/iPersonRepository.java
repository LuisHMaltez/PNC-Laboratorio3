package org.ncapas.laboratorio3.Repositories;


import org.ncapas.laboratorio3.Domain.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iPersonRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByFirstName(String firstName);

    List<Employee> findByLastName(String lastName);

    Employee findByEmail(String email);
}