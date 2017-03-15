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
 
import facerserver.dao.ApplicationStatus;
import facerserver.dao.ApplicationStatusDAO;
 
 
@Path("applications")
public class FacerResource {
 
    @GET
    @Produces("application/json")
    public List<ApplicationStatus> getApplicationStatus() {
        ApplicationStatusDAO dao = new ApplicationStatusDAO();
        List ApplicationStatuses = dao.getApplicationStatuses();
        return ApplicationStatuses;
    }
}
 