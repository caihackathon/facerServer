package com.facerServer.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.facerServer.dao.IncidentDao;
import com.facerServer.model.Incident;

@Path("incidents")
public class IncidentRest {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() throws Exception {    	
    	List<Incident> incidentList = new ArrayList<Incident>();
    	incidentList = IncidentDao.readAll();
    	return Response.status(200).entity(incidentList).build();
    }

    @Path("active")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getActive() throws Exception {    	
    	List<Incident> incidentList = new ArrayList<Incident>();
    	incidentList = IncidentDao.readActive();
    	return Response.status(200).entity(incidentList).build();
    }

}