package nl.qien.dodo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import nl.qien.dodo.domain.User;
import nl.qien.dodo.service.UserService;

@Path("/users")
@Controller
public class UserResource {
	
	@Autowired
	private UserService userService;
	

	@GET
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public Response getUsers() {
		Iterable<User> userResults = userService.getUsers();
		return Response.ok(userResults).build();
	}

}
