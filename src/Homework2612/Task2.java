package Homework2612;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2 {

    public void checkOnlyEvens(){
        int[] myArr = new int[100];
        int index = 0;
        for(int i = 1; i<myArr.length; i++){
            if(i % 2 == 0){
                myArr[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(IntStream.of(myArr).filter(n -> n != 0).toArray()));
    }

    public static void main(String[] args) {
        Task2 task = new Task2();
        task.checkOnlyEvens();
    }
}
