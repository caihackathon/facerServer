package facerserver.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
 
public class SessionUtil {
    
    private static SessionUtil instance=new SessionUtil();
    private SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;
    
    public static SessionUtil getInstance(){
            return instance;
    }
    
    private SessionUtil(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
                configuration.getProperties()). buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
       // sessionFactory = configuration.buildSessionFactory();
        
    }
    
    public static Session getSession(){
        Session session =  getInstance().sessionFactory.openSession();
        return session;
    }
}
