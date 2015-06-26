package com.logistics.hello_world;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    
	//private String name;
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it ok!";
    }
    
    @Path("{name}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get(@PathParam("name") String name) {
    	return "Hello " + name  + "!";
    }
}
