package facerserver.dao;

import java.util.List;
 
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
public class ApplicationStatusDAO {
    
  
   public List<ApplicationStatus> getApplicationStatuses(){
        Session session = SessionUtil.getSession();    
        Query query = 
        session.createQuery("from ApplicationStatus");
        List<ApplicationStatus> ApplicationStatuses 
        =  query.list();
        session.close();
        return ApplicationStatuses;
    }
 
}
