package com.company.employee;

public class Position {

    private String positionName;
    private Double salary;

    public Position(String positionName, Double salary) {
        this.positionName = positionName;
        this.salary = salary;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionName='" + positionName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
