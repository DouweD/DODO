package nl.qien.dodo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.dodo.domain.Ticket;
import nl.qien.dodo.persistence.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	public Iterable<Ticket> getTickets() {
		return ticketRepository.findAll();
	}
	
	public void save(final Ticket ticket) {
		ticketRepository.save(ticket);
	}

}
