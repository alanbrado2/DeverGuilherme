package br.upis.wsrest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("metroporpes")
public class MetrosparaPes {
	@Path("{m}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response convert(@PathParam("m") Double m) {
		Double pes = m / 0.3048;
		JSONObject json = new JSONObject();
		json.put("pés", pes);
		return Response.status(200).entity(json).build();
	}
}
