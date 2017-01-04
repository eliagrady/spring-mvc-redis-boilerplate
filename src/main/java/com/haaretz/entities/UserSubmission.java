package com.haaretz.entities;

/**
 * Created by elia.grady on 04/01/2017.
 */
public class UserSubmission {

  private String firstName;
  private String lastName;
  private String email;

  public UserSubmission() {

  }

  public UserSubmission(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
