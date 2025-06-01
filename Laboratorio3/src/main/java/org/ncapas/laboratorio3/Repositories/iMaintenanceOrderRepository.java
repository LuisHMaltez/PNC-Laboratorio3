package org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.MaintenanceOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iMaintenanceOrderRepository extends JpaRepository<MaintenanceOrder, Integer> {
    List<MaintenanceOrder> findByRoomId(String roomId);
    List<MaintenanceOrder> findByReportedById(Long personId);
}
