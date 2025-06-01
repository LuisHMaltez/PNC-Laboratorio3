package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iEmployeeRepository extends JpaRepository<Employee, UUID> {

    List<Employee> findByIdEmployee(UUID idEmployee);

    @Query("SELECT e FROM Employee e WHERE e.lastName = :lastName")
    List<Employee> findByLastName(@Param("lastName") String lastName);

    @Query(value = "SELECT * FROM employee WHERE first_name = :firstName", nativeQuery = true)
    List<Employee> findByFirstName(@Param("firstName") String firstName);
}
