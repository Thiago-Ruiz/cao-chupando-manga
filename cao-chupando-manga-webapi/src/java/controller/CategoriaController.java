package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/categoria") 
public class CategoriaController {
    
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String index(){
        return "teste";
    }
}
