package br.upis.wsrest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("pesparametros")
public class PesparaMetro {
	
	@Path("{f}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMetros(@PathParam("f") Float f) {
		Double metros;
		metros = f * 0.3048;
		System.out.println("teste");
		JSONObject json = new JSONObject();
		json.put("metros", metros);
		return Response.status(200).entity(""+json).build();
				
	}
}
