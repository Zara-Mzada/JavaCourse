package Lesson7;

public class Polyndrome {

    public String PolyndromeWord(String word){
        String reversed = "";
        for(int i = word.length() - 1; i >= 0; i-- ){
            reversed += word.charAt(i);
        }

        if(word.equals(reversed)){
            return "Word is polyndrome";
        }
        else{
            return "Word is not polyndrome";
        }
    }
}
