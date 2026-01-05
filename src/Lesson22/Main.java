package Lesson22;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // queue yarat, icinde elementler, her biri capa

//        Queue<Integer> queue = new ArrayDeque<>();
//        Queue<Integer> queue = new PriorityQueue<>();
//        queue.add(34);
//        queue.add(12);
//        queue.add(54);
//        queue.add(29);
//        queue.add(7);
//
//        Iterator<Integer> ite = queue.iterator();
//
//        while(ite.hasNext()){
//            System.out.println(ite.next());
//        }

        Set<Integer> set1 = new HashSet<>(List.of(2, 5, 7, 8, 4, 6, 8, 9));
        Set<Integer> set2 = new HashSet<>(List.of(6, 5, 7, 3, 7, 9, 2, 1));

        Set<Integer> crossSets = new HashSet<>();
        for (Integer s1 : set1) {
            for (Integer s2 : set2) {
                if (s1.equals(s2)) {
                    crossSets.add(s1);
                }
            }
        }
        System.out.println("Cross numbers from each sets -> " + crossSets);


        Set<Integer> unionSets = new HashSet<>();
        unionSets.addAll(set1);
        unionSets.addAll(set2);
        System.out.println("Union numbers from each sets -> " + unionSets);


        Set<Integer> differSet1 = new HashSet<>();
        for (Integer s1 : set1) {
            boolean isFound = false;
            for (Integer s2 : set2) {
                if (s1.equals(s2)) {
                    isFound = true;
                }
            }
            if (!isFound) {
                differSet1.add(s1);
            }
        }
        System.out.println("Only inside set 1 -> " + differSet1);


        Set<Integer> differSet2 = new HashSet<>();
        for (Integer s2 : set2) {
            boolean isFound = false;
            for (Integer s1 : set1) {
                if (s2.equals(s1)) {
                    isFound = true;
                }
            }
            if (!isFound) {
                differSet2.add(s2);
            }
        }
        System.out.println("Only inside set 2 -> " + differSet2);

    }
}
