package nl.qien.dodo.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nl.qien.dodo.domain.Ticket;

@Repository
public interface TicketRepository extends CrudRepository <Ticket, Long> {

}
