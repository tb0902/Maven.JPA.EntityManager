package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CD {
  @Id
  @GeneratedValue
  private long id;
  private String title;
  private String description;
  private String year;
  private Artist artist;
  private float price;


  @OneToMany
  private Set<Artist> artists = new HashSet<>();

}
