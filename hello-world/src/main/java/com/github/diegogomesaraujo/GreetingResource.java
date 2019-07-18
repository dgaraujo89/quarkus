package com.github.diegogomesaraujo;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.diegogomesaraujo.services.GreetingService;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class GreetingResource {

    @Inject
    private GreetingService greetingResource;

    @GET
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/greeting/{name}")
    public String greeting(@PathParam("name") String name) {
        return greetingResource.greeting(name);
    }
    
}