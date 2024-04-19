package services;

import entities.Artist;
import entities.CD;

import javax.persistence.EntityManager;
import java.util.Set;

import static EntityManager.EntityManager.getEntityManager;
//
public class ArtistService {
  public Artist findById(Long id){
    EntityManager em = getEntityManager();
    Artist artist = em.find(Artist.class, new Long(id));
    em.detach(artist);
    return artist;
  }
  public void create(String firstName, String lastName, String instrument){
    EntityManager em = getEntityManager();

    em.getTransaction();

    Artist artist = new Artist();
    artist.setInstrument(instrument);
    artist.setFirstName(firstName);
    artist.setLastName(lastName);

    em.persist(artist);
    em.getTransaction().commit();
  }
  public void deleteById(Long id){
    EntityManager em = getEntityManager();
    em.getTransaction().begin();
    Artist artist = em.find(Artist.class, new Long(id));
    em.remove(artist);
    em.getTransaction().commit();
  }
  public void update(Long id){
    EntityManager em = getEntityManager();
    Artist artist = artist.getId(id);
    em.detach(artist);
    em.getTransaction().begin();
    em.merge(artist);
    em.getTransaction().commit();
  }
}
