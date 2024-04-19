package EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManager {

  static EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
  public static javax.persistence.EntityManager getEntityManager(){
    return emf.createEntityManager();
  }
}
