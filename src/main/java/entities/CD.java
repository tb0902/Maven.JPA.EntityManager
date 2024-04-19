package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cd")
public class CD {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;



  private String title;
  private String description;
  private String year;
  @OneToOne
  private Artist primaryArtist; // this is essentially the main artist
  private float price;
  @OneToMany
  private Set<Artist> artists = new HashSet<>();

  public CD() {
  }

  public CD(String title, String description, String year, Artist primaryArtist, float price) {
    this.title = title;
    this.description = description;
    this.year = year;
    this.primaryArtist = primaryArtist;
    this.price = price;
  }

  public Artist getPrimaryArtist() {
    return primaryArtist;
  }

  public void setPrimaryArtist(Artist primaryArtist) {
    this.primaryArtist = primaryArtist;
  }

  public String getTitle() {
    return title;
  }

  public long getId() {
    return id;
  }

  public String getDescription() {
    return description;
  }

  public String getYear() {
    return year;
  }

  public float getPrice() {
    return price;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public void setArtists(Set<Artist> artists) {
    this.artists = artists;
  }
}
