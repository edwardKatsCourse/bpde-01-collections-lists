package com.company;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        /**
         * LIST - списки
         * SET - куча
         * MAP - ключ-значение
         */

        /**
         *                 LIST
         *     ARRAY LIST       LINKED LIST
         *     self-extend      sequential access
         */
        int [] array = new int[100];

        List<Integer> arrayList = new ArrayList<>(100); //10
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 101; i++) {
            arrayList.add(1);


            linkedList.add(0, 1);
            linkedList.get(50); //49 51
        }
        //linked list [-1, 0, 1, 2, 3, 4]
        //array list   [0(0), 1(1), 2(2), 3(3), 4(4)]
        //(increase capacity)  [    0(0), 1(1), 2(2), 3(3), 4(4)]
        //              [    0(1), 1(2), 2(3), 3(4), 4(5)]
        //              [-1(0), 0(1), 1(2), 2(3), 3(4), 4(5)]


        //add(to the end) vs insert(add to specific index)
        //

        System.out.println(arrayList.size());
        System.out.println(linkedList.size());













    }

    static void map_demo() {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "peter");
        map.put(2, "anatoly");
        map.put(3, "simon");
        map.put(4, "anna");
        map.put(5, "anna");
        map.put(6, "peter");
        map.put(6, "andrew");

        System.out.println(map.toString());
        //[0, 1, 2]
        // 1  2  3
        System.out.println(map.get(7));

        System.out.println("------------------");

        System.out.println(UUID.randomUUID().toString());

        Map<String, String> uuidMap = new HashMap<>();

        uuidMap.put(UUID.randomUUID().toString(), "peter");
        uuidMap.put(UUID.randomUUID().toString(), "sarah");
        uuidMap.put(UUID.randomUUID().toString(), "jimmy");
        uuidMap.put(UUID.randomUUID().toString(), "david");



        System.out.println();
        System.out.println(uuidMap.toString());
        System.out.println(uuidMap.containsValue("peter"));
    }

}
