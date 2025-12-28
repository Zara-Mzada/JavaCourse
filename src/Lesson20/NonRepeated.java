package Lesson20;

import java.util.ArrayList;
import java.util.Arrays;

public class NonRepeated {

    ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3,6,4,1,3,5,6,8,10));
    ArrayList<Integer> newArray = new ArrayList<>();

    public void checkNumbers(){

        for(int i = 0; i<array.size(); i++){
            boolean isDuplicate = false;

            for(int j = i+1; j<array.size(); j++){
                if(array.get(i).equals(array.get(j))){
                   isDuplicate = true;
                   break;
                }
            }

            if(!isDuplicate){
                newArray.add(array.get(i));
            }

        }

//        for (int i = 0; i < array.size(); i++) {
//            if (!newArray.contains(array.get(i))) {
//                newArray.add(array.get(i));
//            }
//        }

        System.out.println(newArray);
    }

    public static void main(String[] args) {
        NonRepeated n1 = new NonRepeated();
        n1.checkNumbers();
    }
}
