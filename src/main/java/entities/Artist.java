package entities;

import javax.persistence.*;

@Entity
@Table(name = "artist")
public class Artist {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String firstName;
  private String lastName;
  private String instrument;

  public Artist(){
  }

  public Artist(String firstName, String lastName, String instrument) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.instrument = instrument;
  }

  public String getInstrument() {
    return instrument;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }
}
