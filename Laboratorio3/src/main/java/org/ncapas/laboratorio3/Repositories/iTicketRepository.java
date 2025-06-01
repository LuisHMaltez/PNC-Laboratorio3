package  org.ncapas.laboratorio3.Repositories;

import org.ncapas.laboratorio3.Domain.Entities.GuestPoints;
import org.ncapas.laboratorio3.Domain.Entities.Reservation;
import org.ncapas.laboratorio3.Domain.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface iTicketRepository extends JpaRepository<Ticket, UUID> {

    List<Ticket> findByReservation(Reservation reservation);

    @Query("SELECT t FROM Ticket t WHERE t.total > :minPrice")
    List<Ticket> findTicketsAbovePrice(@Param("minPrice") double minPrice);

    @Query(value = "SELECT * FROM ticket WHERE dateTicket > :date", nativeQuery = true)
    List<Ticket> findByDate(@Param("date") String date);
}