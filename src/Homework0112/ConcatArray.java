package Homework0112;

import java.util.Arrays;

public class ConcatArray {

    public int[] array1;
    public int[] array2;

    public ConcatArray(int[] array1, int[] array2){
        this.array1 = array1;
        this.array2 = array2;
    }

    public int[] mergeArrays(){
        int[] merge = new int[array1.length + array2.length];

        for(int i = 0; i < array1.length; i++){
            merge[i]=array1[i];
        }

        int index = 0;
        for(int j = array1.length; j < merge.length; j++){
            merge[j] = array2[index];
            index++;
        }

        int[] temp = new int[merge.length];
        int count = 0;

        for(int i = 0; i < merge.length; i++){
            boolean isExist = false;

            for(int j = 0; j < count; j++){
                if(temp[j] == merge[i]){
                    isExist = true;
                    break;
                }
            }

            if(!isExist){
                temp[count] = merge[i];
                count++;
            }
        }

        int[] result = new int[count];

        for(int i = 0; i < result.length; i++){
            result[i] = temp[i];
        }

        return result;

    }
    public static void main(String[] args){
        int[] arr1 = {2, 4, 5, 6, 7};
        int[] arr2 = {3, 4, 6, 8, 9};
        ConcatArray merge1 = new ConcatArray(arr1, arr2);

        System.out.print(Arrays.toString(merge1.mergeArrays()));
    }
}
// student name, age  constr nsme age,