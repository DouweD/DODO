package nl.qien.dodo.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

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
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON_VALUE)
	public Response saveUser(final User user) {
		userService.save(user);
		return Response.status(Status.CREATED).build();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public Response getUserById(@PathParam("id") Long id) {
		User user = userService.getUserById(id);
		return Response.ok(user).build();
	}
	
	
	@GET
	@Path("username/{username}")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public Response findUserByUsername(@PathParam("username") String username) {
		return Response.ok(userService.findUserByUsername(username)).build();
	}


}
