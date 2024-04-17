package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Artist {
  @Id
  @GeneratedValue
  private long id;
  private String firstName;
  private String lastName;
  private String instrument;


  }
