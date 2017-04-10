package com.codethen.juices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/juices")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class JuicesResource {

	@GET
	@Path("/fake")
	public Juice getJuice() {

		Juice zumo = new Juice();

		zumo.setName("zumo naranja");
		zumo.setPrice(3);
		zumo.setAvailable(true);

		return zumo;
	}
}
