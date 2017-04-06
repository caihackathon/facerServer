package com.facerServer.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.facerServer.dao.UserLoginDao;
import com.facerServer.model.UserLogin;

@Path("users")
public class IncidentRest {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getByUserId() throws Exception {    	
    	List<UserLogin> userList = new ArrayList<UserLogin>();
    	userList = UserLoginDao.readByUserId();
    	return Response.status(200).entity(userList).build();
    }

    @Path("name")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getActive() throws Exception {    	
    	List<UserLogin> userList = new ArrayList<UserLogin>();
    	userList = UserLoginDao.readByLastName();
    	return Response.status(200).entity(userList).build();
    }

}