package bkm.test.rest;

import org.json.JSONObject;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import org.glassfish.jersey.client.ClientProperties;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Path("/helloworld")
public class HelloWorld {
	@Context UriInfo uriInfo;
	@Context Request request;
	HttpSession session;//628f394f

	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/joke")
	public String getData(@QueryParam("par1") String par1, @Context HttpServletRequest req) {
		session = req.getSession(true);
		session.setMaxInactiveInterval(10);
		return new Date(session.getCreationTime())+" "+session.getId();

	}

}