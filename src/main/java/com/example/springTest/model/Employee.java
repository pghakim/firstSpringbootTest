package com.example.springTest.model;

public class Employee {


  private String firstName;
  private String lastName;
  private int id;


  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }


  public Employee() {

  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


}
