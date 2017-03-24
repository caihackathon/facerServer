package facerserver.dao;

import java.util.List;
 
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
public class UserSubscriptionStatusDAO {
    
  
   public List<UserSubscStatus> getUserSubscriptionStatuses(String myid){
        Session session = SessionUtil.getSession();
        Transaction tx = session.beginTransaction();
        Query query = 
        session.createQuery("from UserSubscStatus where userId=" + myid);
        //query.setCacheable(false);
        List<UserSubscStatus> UserSubscStatuses 
        =  query.list();
        tx.commit();
        session.close();
        return UserSubscStatuses ;
    }
 
}
