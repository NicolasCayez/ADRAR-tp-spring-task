package com.nicolas.tp_spring_task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    /* *********************************
  * ATTRIBUTES
  ********************************* */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String lastname;
  private String firstname;
  private String email;
  private String password;
  @ManyToOne
  @JoinColumn(name = "id_role")
  private Role role;

  /* *********************************
  * CONSTRUCTOR
  ********************************* */
  public User() {
  }
  public User(String lastname, String firstname, String email, String password, Role role) {
    this.lastname = lastname;
    this.firstname = firstname;
    this.email = email;
    this.password = password;
    this.role = role;
  }

  /* *********************************
  * GET / SET
  ********************************* */
  // id
  public Long getId() {
    return this.id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  // lastname
  public String getLastname() {
    return this.lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  // firstname
  public String getFirstname() {
    return this.firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  // email
  public String getEmail() {
    return this.email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  // password
  public String getPassword() {
    return this.password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  // role
  public Role getRole() {
    return this.role;
  }
  public void setRole(Role role) {
    this.role = role;
  }

  /* *********************************
  * toString
  ********************************* */
  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", lastname='" + getLastname() + "'" +
      ", firstname='" + getFirstname() + "'" +
      ", email='" + getEmail() + "'" +
      ", password='" + getPassword() + "'" +
      ", role='" + getRole() + "'" +
      "}";
  }
}
