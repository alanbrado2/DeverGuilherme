package br.upis.wsrest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("polegadasparapes")
public class PolegadasporPes {
	@Path("{p}")
	@GET
	@Produces
	public Response getPes(@PathParam("p") Double p) {
		Double pes = p * 0.08333;
		JSONObject json = new JSONObject();
		json.put("Pés", pes);
		return Response.status(200).entity(json).build();
	}
}
