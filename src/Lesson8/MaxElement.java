package Lesson8;

public class MaxElement {

    int[] array;

    public MaxElement(int[] array){
        this.array = array;
    }
    public int findMax(int[] array){

        int max = array[0];
        for(int i = 0; i <= array.length-1; i++) {

            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
