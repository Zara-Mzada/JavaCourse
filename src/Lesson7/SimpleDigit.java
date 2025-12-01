package Lesson7;

public class SimpleDigit {

    public boolean prime(int num){

        boolean isPrime = true;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            return true;
        }
        else{
            return false;
        }
    }
}
