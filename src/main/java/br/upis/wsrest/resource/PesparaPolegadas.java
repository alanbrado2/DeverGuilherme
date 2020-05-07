package br.upis.wsrest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("pesparapolegadas")
public class PesparaPolegadas {
	@GET
	@Path("{p}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPolegadas(@PathParam("p")Double p) {
		Double pes = p/0.08333;
		JSONObject json = new JSONObject();
		json.put("pés", pes);
		return Response.status(200).entity(json).build();
	}
}
