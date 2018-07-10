package com.RSearch.RestUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class Ping  {
	
	@GET
	@Path("/test")
	public Response getMsg() {
 
		String output = "Ping! Hello There!";
		return Response.status(200).entity(output).build();
		
	}

}
