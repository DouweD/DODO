package nl.qien.dodo.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	
	
	public JerseyConfig() {
		packages(getClass().getPackage().getName().replace("config", "api"));
	}

}


