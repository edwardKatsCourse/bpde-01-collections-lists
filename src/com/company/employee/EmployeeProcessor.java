package com.company.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeProcessor {
    static List<Employee> employees = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public static void printEmployees() {
        System.out.println("Total employees in the company: " + employees.size());
        System.out.println("------------------------");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static Employee newEmployee() {
        System.out.println("Enter employee first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter employee last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter employee email: ");
        String email = scanner.nextLine();

        while (!isEmailUnique(email)) {
            System.out.println("EMAIL IS NOT UNIQUE. Please, enter a valid email");
            email = scanner.nextLine();
        }

        Employee employee = new Employee(
                firstName,
                lastName,
                email,
                null);

        employees.add(employee);

        System.out.println("New employee has been successfully added!");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println();

        return employee;
    }

    public static void updateEmployee(Employee employee) {
        Integer indexToUpdate = getIndex(employee.getEmail());
        if (indexToUpdate != null) {
            employees.set(indexToUpdate, employee);
        } else {
            String message = String.format("Employee with email %s does not exist. No update occurred", employee.getEmail());
            System.out.println(message);
        }
    }

    private static Integer getIndex(String email) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmail().equalsIgnoreCase(email)) {
                return i;
            }
        }

        return null;
    }

    //Not in use
    private static Employee findByEmail(String email) {
        for(Employee employee : employees) {
            if (employee.getEmail().equalsIgnoreCase(email)) {
                return employee;
            }
        }

        return null;
    }

    private static boolean isEmailUnique(String email) {
        boolean emailIsUnique = true;
        for (Employee employee : employees) {
            if (employee.getEmail().equalsIgnoreCase(email)) {
                emailIsUnique = false;
                break;
            }
        }
        return emailIsUnique;
    }
}
