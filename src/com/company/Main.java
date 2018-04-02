package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array_list = new ArrayList<>();
        List<Integer> linked_list = new LinkedList<>();
        
        int recordsToAdd = 100_000;

        Date start = new Date();
        for (int i = 0; i < recordsToAdd; i++) {
            array_list.add(1);
        }

        System.out.print(String.format("Array List add %s records: ", recordsToAdd));
        printTimeDiff(start);


        start = new Date();
        for (int i = 0; i < recordsToAdd; i++) {
            linked_list.add(1);
        }
        System.out.print(String.format("Linked List add %s records: ", recordsToAdd));
        printTimeDiff(start);

        start = new Date();

        for (int i = 0; i < recordsToAdd; i++) {
            array_list.add(0, 2);
        }
        System.out.print(String.format("Array List insert %s records: ", recordsToAdd));

        printTimeDiff(start);
        start = new Date();
        for (int i = 0; i < recordsToAdd; i++) {
            linked_list.add(0, 2);
        }
        System.out.print(String.format("Linked List insert %s records: ", recordsToAdd));
        printTimeDiff(start);

    }

    static void printTimeDiff(Date date) {
        System.out.println((new Date().getTime() - date.getTime()));
    }
}
