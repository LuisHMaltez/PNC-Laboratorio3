package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iRoleRepository extends JpaRepository<Role, UUID> {

    List<Role> findByIdRole(UUID idRole);
    List<Role> findByRole(String Role);
}
