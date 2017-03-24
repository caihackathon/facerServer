package facerserver;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.MultivaluedMap;


import facerserver.dao.ApplicationStatus;
import facerserver.dao.ApplicationStatusDAO;
import facerserver.dao.UserSubscriptionStatusDAO;
import facerserver.dao.UserSubscStatus;
import facerserver.dao.UserSubscriptionStatusDAO;
 


@Path("/applications")
public class FacerResource {
 
    @GET
    @Path("/apps")
    @Produces("application/json")
    public List<ApplicationStatus> getApplicationStatus() {
        ApplicationStatusDAO dao = new ApplicationStatusDAO();
        List ApplicationStatuses = dao.getApplicationStatuses();
        return ApplicationStatuses;
    }

  /*  @GET
    @Path("/{myusr}/{myloc}")
    @Produces("application/json")
    public List<UserSubscStatus> getUserSubscriptionStatuses(@Context UriInfo uri) {
    	MultivaluedMap paramMap = uri.getPathParameters();
        String myloc = (String) paramMap.getFirst("myloc");
        System.out.printf(myloc);
        UserSubscriptionStatusDAO dao = new UserSubscriptionStatusDAO();
        List ApplicationStatuses = dao.getUserSubscriptionStatuses(myloc);
        return ApplicationStatuses;
    }
    */
    @GET
    @Path("/{myusr}/{myloc}/DoItAgain")
    @Produces("application/json")
    public List<UserSubscStatus> getUserSubscriptionStatuses(@Context UriInfo uri) {
    	MultivaluedMap paramMap = uri.getPathParameters();
        String myloc = (String) paramMap.getFirst("myloc");
        System.out.printf(myloc);
        UserSubscriptionStatusDAO dao = new UserSubscriptionStatusDAO();
        List ApplicationStatuses = dao.getUserSubscriptionStatuses(myloc);
        return ApplicationStatuses;
    }
   
}
 