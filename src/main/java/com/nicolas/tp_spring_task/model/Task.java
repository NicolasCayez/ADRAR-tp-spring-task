package com.nicolas.tp_spring_task.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class Task {
  /* *********************************
  * ATTRIBUTES
  ********************************* */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String description;
  private Date date;
  private boolean status;
  @ManyToMany
  @JoinTable(name = "tasks_categories",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
  private List<Category> categories = new ArrayList<>();

  /* *********************************
  * CONSTRUCTOR
  ********************************* */
  public Task() {
  }
  public Task(String title, String description, Date date, boolean status) {
    this.title = title;
    this.description = description;
    this.date = date;
    this.status = status;
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
  // title
  public String getTitle() {
    return this.title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  // description
  public String getDescription() {
    return this.description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  // date
  public Date getDate() {
    return this.date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  // status
  public boolean isStatus() {
    return this.status;
  }
  public boolean getStatus() {
    return this.status;
  }
  public void setStatus(boolean status) {
    this.status = status;
  }
 // Categories
  public List<Category> getCategories() {
    return this.categories;
  }
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  /* *********************************
  * toString
  ********************************* */
  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", title='" + getTitle() + "'" +
      ", description='" + getDescription() + "'" +
      ", date='" + getDate() + "'" +
      ", status='" + isStatus() + "'" +
      ", categories='" + getCategories() + "'" +
      "}";
  }
}
