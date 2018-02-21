package nl.qien.dodo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import nl.qien.dodo.domain.Ticket;
import nl.qien.dodo.service.TicketService;

@Path("/tickets")
@Controller
public class TicketResource {
	
	@Autowired
	private TicketService ticketService;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public Response getTickets() {
		Iterable<Ticket> ticketResults = ticketService.getTickets();
		return Response.ok(ticketResults).build();
	}

}
