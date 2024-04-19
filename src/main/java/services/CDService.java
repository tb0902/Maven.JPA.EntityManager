package services;
import entities.Artist;
import entities.CD;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Set;

import static EntityManager.EntityManager.getEntityManager;


public class CDService {

  public CD findById(Long id){
    EntityManager em = getEntityManager();
    CD cd = em.find(CD.class, new Long(id));
    em.detach(cd);
    return cd;
  }
  public void create(String title, String description, String year, Artist primaryArtist, float price, Set<Artist> artists){
  EntityManager em = getEntityManager();

  em.getTransaction();

  CD cd = new CD();
  cd.setArtists(artists);
  cd.setTitle(title);
  cd.setDescription(description);
  cd.setYear(year);
  cd.setPrimaryArtist(primaryArtist);
  cd.setPrice(price);

  em.persist(cd);
  em.getTransaction().commit();
  }
  public void deleteById(Long id){
    EntityManager em = getEntityManager();
    em.getTransaction().begin();
    CD cd = em.find(CD.class, new Long(id));
    em.remove(cd);
    em.getTransaction().commit();
  }
  public void update(Long id){
    EntityManager em = getEntityManager();
    CD cd = cd.getId(id);
    em.detach(cd);
    em.getTransaction().begin();
    em.merge(cd);
    em.getTransaction().commit();
  }
}
