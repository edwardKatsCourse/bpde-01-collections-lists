package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String line = "";

        //add elements to list
        while (!(line = scanner.nextLine()).equals("exit")) {
            languages.add(line);
        }


        //print them all
        System.out.println("printing all languages");
        for (int i = 0; i < languages.size(); i++) {
            System.out.println(i + ". " + languages.get(i));
        }

        System.out.println("Enter index to remove");
        //input index to remove
        int indexToRemove = Integer.parseInt(scanner.nextLine());

        //remove
        languages.remove(indexToRemove);


        //print list after removal
        System.out.println("print list after removal");
        for (int i = 0; i < languages.size(); i++) {
            System.out.println(i + ". " + languages.get(i));
        }

        //figure out element index by value (for example, PYTHON - index 4)
        System.out.println("Enter value to search:");
        String indexOf = scanner.nextLine();
        System.out.println("List indexOf [" + indexOf + "] is " +
                languages.indexOf(indexOf));


        //Check if list is empty
        System.out.println("Check if list is empty");
        System.out.println("Is empty: " + languages.isEmpty());

//        int a [] = new int[30];
        //list size = 25 (list capacity 30)
        //after trimToSize
        //list capacity = 25


        //all list elements removal
        System.out.println("calling list.clear()");
        languages.clear();

        //print after all elements removal
        System.out.println("print after list.clear()");
        for (int i = 0; i < languages.size(); i++) {
            System.out.println(i + ". " + languages.get(i));
        }

        //Check if list is empty
        //isEmpty == list.size() == 0
        System.out.println("is empty after list.clear()");
        System.out.println(languages.isEmpty());

    }
}
