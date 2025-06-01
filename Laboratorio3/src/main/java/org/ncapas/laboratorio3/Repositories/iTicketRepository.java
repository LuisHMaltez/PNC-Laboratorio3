package  org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.GuestPoints;
import org.ncapas.laboratorio3.Domain.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface iTicketRepository extends JpaRepository<Ticket, Date> {
    List<Ticket> findByIdTicket(UUID idTicket);

    List<Ticket> findByDateTicket(Date dateTicket);

    List<Ticket> findByGuestPoints(GuestPoints guestPoints);
}