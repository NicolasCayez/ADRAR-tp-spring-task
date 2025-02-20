package com.nicolas.tp_spring_task.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class Category {
    /* *********************************
  * ATTRIBUTES
  ********************************* */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "label")
  private String label;
  @ManyToMany
  @JoinTable(name = "tasks_categories",
                    joinColumns = @JoinColumn(name = "category_id"),
                    inverseJoinColumns = @JoinColumn(name = "task_id"))
  private List<Task> tasks = new ArrayList<>();

  /* *********************************
  * CONSTRUCTOR
  ********************************* */
  public Category() {
  }
  public Category(String label) {
    this.label = label;
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
  // label
  public String getLabel() {
    return this.label;
  }
  public void setLabel(String label) {
    this.label = label;
  }
  // Tasks
  public List<Task> getTasks() {
    return this.tasks;
  }
  public void setTasks(List<Task> tasks) {
    this.tasks = tasks;
  }

  /* *********************************
  * toString
  ********************************* */
  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", label='" + getLabel() + "'" +
      ", tasks='" + getTasks() + "'" +
      "}";
  }
}
