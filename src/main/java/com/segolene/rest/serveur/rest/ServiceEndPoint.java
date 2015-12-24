package com.segolene.rest.serveur.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class ServiceEndPoint {
	
	@GET 
	public Response getHello() { 
	      return Response.status(200).entity("Hello World").build();
	 }
	
}

