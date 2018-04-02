package com.company.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeApplication {
    static List<Position> positions = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        //Initialize positions
        init();

        //Print menu and read user input
        int menuResult = printMenu();

        //Show menu, unit user chooses to leave (#3 in menu is exit)
        while (menuResult != 3) {
            switch (menuResult) {
                //Create a new employee
                case 1:
                    //Creates a new employee (without position)
                    Employee employee = EmployeeProcessor.newEmployee();

                    Position position = positions.get(readEmployeePosition());
                    employee.setPosition(position);

                    //update is by email
                    EmployeeProcessor.updateEmployee(employee);
                    break;

                //Print employee
                case 2:
                    EmployeeProcessor.printEmployees();
                    break;
            }

            menuResult = printMenu();
        }
    }

    private static void printPositions() {
        System.out.println("Set new employee's position");
        System.out.println("----------------------");
        System.out.println("0. Junior Developer");
        System.out.println("1. Middle Developer");
        System.out.println("2. Senior Developer");
        System.out.println("3. Team Leader");
    }

    private static Integer readEmployeePosition() {
        printPositions();
        System.out.println("Enter employee position index: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static int printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Create new employee");
        System.out.println("2. See employee list");
        System.out.println("3. Exit");

        return Integer.parseInt(scanner.nextLine());
    }


    private static void init() {
        Position juniorDeveloper = new Position(
                "Junior Developer",
                2000.00);

        Position middleDeveloper = new Position(
                "Middle Developer",
                3500.00);

        Position seniorDeveloper = new Position(
                "Senior Developer",
                5000.00);

        Position teamLeader = new Position(
                "Team Leader",
                6500.00);

        positions.add(juniorDeveloper);
        positions.add(middleDeveloper);
        positions.add(seniorDeveloper);
        positions.add(teamLeader);
    }
}
