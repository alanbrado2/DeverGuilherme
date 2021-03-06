package br.upis.wsrest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("MetroporPolegada")
public class MetroporPolegadas {
	@GET
	@Path("{m}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPolegadas(@PathParam("m")Double m) {
		double polegadas = m/0.0254;
		JSONObject json = new JSONObject();
		json.put("polegadas", polegadas);
		return Response.status(200).entity(json).build();
	}
}
