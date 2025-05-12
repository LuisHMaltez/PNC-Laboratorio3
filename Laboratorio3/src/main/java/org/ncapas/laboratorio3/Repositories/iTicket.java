package  org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface iTicket extends JpaRepository<Ticket, Double> {

    List<Ticket> findByName(String name);

    List<Ticket> findByPointCost(Integer pointCost);
    List<Ticket> findByDateAndName(Date date, String name);

    List<Ticket> findByDateAndPointCost(Date date, Integer pointCost);
}