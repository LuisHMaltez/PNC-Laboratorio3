package  org.ncapas.laboratorio3.Repositories;

public interface iTicket extends JpaRepository<Ticket, double> {
    List<Ticket> findByName(String name);

    List<Ticket> findByPointCost(Integer pointCost);
    List<Ticket> findByDateAndName(Date date, String name);

    List<Ticket> findByDateAndPointCost(Date date, Integer pointCost);
}