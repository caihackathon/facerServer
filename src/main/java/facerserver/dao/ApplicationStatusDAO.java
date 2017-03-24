package facerserver.dao;

import java.util.List;
 
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
public class ApplicationStatusDAO {
    
  
   public List<ApplicationStatus> getApplicationStatuses(){
        Session session = SessionUtil.getSession();
        Transaction tx = session.beginTransaction();
        Query query = 
        session.createQuery("from ApplicationStatus");
        //query.setCacheable(false);
        List<ApplicationStatus> ApplicationStatuses 
        =  query.list();
        tx.commit();
        session.close();
        return ApplicationStatuses;
    }
 
}
