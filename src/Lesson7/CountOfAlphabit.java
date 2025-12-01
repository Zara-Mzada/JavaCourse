package Lesson7;

public class CountOfAlphabit {

    public void counter(String word){ // seercc

        char[] alph = new char[30]; // [s, , ,]
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i); // s
            alph[i] = c;
        }

        for(int j = 0; j < alph.length; j++){ // s
            int count = 0;
            for(int k = j + 1; k < alph.length; k++){ //
                if(alph[j] == alph[k]){ //s
                    count++;
                }
            }
        }
    }
}
