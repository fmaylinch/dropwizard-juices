package com.codethen.juices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/juices")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class JuicesResource {

	// properties
	private List<Juice> juices;


	// constructor
	public JuicesResource () {

		juices = new ArrayList<>();

		Juice zumo = new Juice();
		zumo.setName("zumo naranja");
		zumo.setPrice(3);
		zumo.setAvailable(true);
		juices.add(zumo);

		Juice zumo2 = new Juice();
		zumo2.setName("zumo pomelo");
		zumo2.setPrice(5);
		zumo2.setAvailable(false);
		juices.add(zumo2);

		Juice zumo3 = new Juice();
		zumo3.setName("limonada");
		zumo3.setPrice(2);
		zumo3.setAvailable(true);
		juices.add(zumo3);
	}


	@GET
	public List<Juice> getAll() {

		return juices;
	}
}
