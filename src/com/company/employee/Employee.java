package com.company.employee;

public class Employee {

    private String firstName;
    private String lastName;
    private String email;
    private Position position;

    public Employee(String firstName, String lastName, String email, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("Firstname: %s \n" +
                "Lastname: %s \n" +
                "Email: %s \n" +
                "Position: %s \n",
                firstName,
                lastName,
                email,
                position == null ? "Unemployed" : position.getPositionName());
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
