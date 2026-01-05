package Homework3012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        todo   Task 1
        System.out.println("=========================================================================");
        System.out.println("                              Task   1                                  ");
        System.out.println("=========================================================================");
        Queue<Integer> pqueue = new PriorityQueue<>();

        pqueue.add(10);
        pqueue.add(20);
        pqueue.add(30);

        System.out.println(pqueue.poll());
        System.out.println(pqueue);
        System.out.println("=========================================================================");
        System.out.println("                               Task   2                                  ");
        System.out.println("=========================================================================");

//        todo Task 2

        Queue<Integer> arrayDequeue = new ArrayDeque<>();

        arrayDequeue.add(10);
        arrayDequeue.add(20);
        arrayDequeue.add(30);
        arrayDequeue.add(40);
        arrayDequeue.add(50);
        arrayDequeue.add(60);
        arrayDequeue.add(70);

        System.out.println(arrayDequeue);
        while(!arrayDequeue.isEmpty()){
            arrayDequeue.poll();
        }

        System.out.println("Queue is empty ->" + arrayDequeue);
        System.out.println("=========================================================================");
        System.out.println("                              Task   3                                   ");
        System.out.println("=========================================================================");

//        todo Task 3

        Queue<String> customer = new PriorityQueue<>();

        customer.add("Customer 1");
        customer.add("Customer 2");
        customer.add("Customer 3");

        while(!customer.isEmpty()){
            System.out.println(customer.poll() + " is done!");
        }
        System.out.println("=========================================================================");
        System.out.println("                              Task   4                                   ");
        System.out.println("=========================================================================");

//        todo Task 4

        Set<String> cities = new HashSet<>();

        cities.add("Baku");
        cities.add("Ganja");
        cities.add("Sumgayit");

        System.out.println(cities.contains("Ganja"));
        System.out.println("=========================================================================");
        System.out.println("                              Task   5                                  ");
        System.out.println("=========================================================================");


//        todo Task 5

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));

        Set<Integer> newNumbers = new HashSet<>(numbers);

        System.out.println(newNumbers);

    }
}
