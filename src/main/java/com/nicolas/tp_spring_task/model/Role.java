package com.nicolas.tp_spring_task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
  /* *********************************
  * ATTRIBUTES
  ********************************* */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "role_name")
  private String name;

  /* *********************************
  * CONSTRUCTOR
  ********************************* */
  public Role() {
  }
  public Role(String name) {
    this.name = name;
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
  // name
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /* *********************************
  * toString
  ********************************* */
  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", name='" + getName() + "'" +
      "}";
  }
}
