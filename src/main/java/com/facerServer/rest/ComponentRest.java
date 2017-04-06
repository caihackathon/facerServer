package com.facerServer.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.facerServer.dao.ComponentDao;
import com.facerServer.model.StdComponent;

@Path("components")
public class ComponentRest {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() throws Exception {    	
    	List<StdComponent> compList = new ArrayList<StdComponent>();
    	compList = ComponentDao.readAll();
    	return Response.status(200).entity(compList).build();
    }

    @Path("active")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getActive() throws Exception {    	
    	List<StdComponent> compList = new ArrayList<StdComponent>();
    	compList = ComponentDao.readActive();
    	return Response.status(200).entity(compList).build();
    }

}