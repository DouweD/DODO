package nl.qien.dodo.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	
	
	public JerseyConfig() {
		// Douwe volgens mij moet jij nog de endpoint aanmaken. Je hoeft niet de naam DODO aan te houden
		//register(DodoEndpoint.class);
	}

}
