package com.codethen.juices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
		zumo.ingredientes.add("agua");
		zumo.ingredientes.add("naranja");
		zumo.ingredientes.add("azucar");
		juices.add(zumo);

		Juice zumo2 = new Juice();
		zumo2.setName("zumo pomelo");
		zumo2.setPrice(4);
		zumo2.setAvailable(false);
		zumo2.ingredientes.add("agua");
		zumo2.ingredientes.add("pomelo");
		zumo2.ingredientes.add("azucar");
		juices.add(zumo2);

		Juice zumo3 = new Juice();
		zumo3.setName("limonada");
		zumo3.setPrice(2);
		zumo3.setAvailable(true);
		zumo3.ingredientes.add("agua");
		zumo3.ingredientes.add("limon");
		zumo3.ingredientes.add("azucar");
		juices.add(zumo3);
		
		Juice zumo4 = new Juice();
		zumo4.setName("zumo detox");
		zumo4.setPrice(5);
		zumo4.setAvailable(true);
		zumo4.ingredientes.add("agua");
		zumo4.ingredientes.add("remolacha");
		zumo4.ingredientes.add("zanahoria");
		zumo4.ingredientes.add("apio");
		juices.add(zumo4);
	}


	@GET
	public List<Juice> getAll(@QueryParam("available") Boolean available, @QueryParam("maxPrice") Double maxPrice) {

		if (available == null && maxPrice == null) {
			return juices;
		}

		List<Juice> juices2 = new ArrayList<>();
		
		if (available != null && maxPrice == null) {
			
			for (int i = 0; i < juices.size(); i++) {

				Juice zumo = juices.get(i);

				if (zumo.isAvailable() == available) {
					juices2.add(zumo);
				}
			}
		}
		
		if (available == null && maxPrice != null) {
			
			for (int i = 0; i < juices.size(); i++) {
				
				Juice zumo = juices.get(i);
			
				if (zumo.getPrice() <= maxPrice && available == null) {
					juices2.add(zumo);
				}
			}
		}
		
		if (available != null && maxPrice != null) {
			
			for (int i = 0; i < juices.size(); i++) {
				
				Juice zumo = juices.get(i);
				
				if (zumo.isAvailable() == available && zumo.getPrice() <= maxPrice) {
					juices2.add(zumo);
				}
			}
		}
		
		return juices2;
	}
}
