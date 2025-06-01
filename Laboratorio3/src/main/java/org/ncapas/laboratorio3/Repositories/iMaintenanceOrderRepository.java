package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Employee;
import org.ncapas.laboratorio3.Domain.Entities.MaintenanceOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iMaintenanceOrderRepository extends JpaRepository<MaintenanceOrder, Integer> {

    List<MaintenanceOrder> findByIdMaintenanceOrder(UUID idMaintenanceOrder);
    List<MaintenanceOrder> findByDescription(String description);
}

