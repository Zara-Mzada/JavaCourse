public class Calculator {





//    public void multiplication(int num){
//
//        for(int i = 1; i <= 10; i++){
//            int multip = num * i;
//            System.out.println(num + " * " + i + " = " + multip);
//        }
//    }

    public Integer summarization(int a, int b){
        return a+b;
    }

    public Integer deduction(int a, int b){
        return a-b;
    }

    public Integer multiplication(int a, int b){
        return a*b;
    }

    public Integer division(int a, int b){
        return a/b;
    }

    public int[] findMin(int[] arr, int limit){
        int count = 0;
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 50){
                count++;
                newArr[count] = arr[i];
            }
        }
        return newArr;
    }

    public float average(int x, int y, int z){
        return (x+y+z)/3f;
    }

    public int[] dividedNums(int number){
        int[] divide = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;

        for(int i = 0; i < divide.length; i++){
            if(number%divide[i] == 0){
                count++;
            }
        }

        int[] newArr = new int[count];
        int newIndex = 0;

        for(int i = 0; i < divide.length; i++){
            if(number % divide[i] == 0){
                newArr[newIndex++] = divide[i];
            }
        }

        return newArr;
    }

    public int returnLastNum(int num){
        int remainder = num%10;
        return remainder;
    }

    public int[] evenNums(int n){
        int[] array = new int[n];

        for(int i = 1; i <= n; i++){
            array[i-1] = i;
        }

        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                count++;
            }
        }

        int[] evenNums = new int[count];
        int index = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                evenNums[index++] = array[i];
            }
        }
        return evenNums;
    }
}
