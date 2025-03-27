import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String word1="listen";
        String word2="silent";

        if(word1.length()!=word2.length()){
            System.out.println("\""+word1+"\""+" "+"and "+"\""+word2+"\""+" are not anagrams bc length");
        }else {
            char[] char1 = word1.toCharArray();
            char[] char2 = word2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            if (Arrays.equals(char1, char2)) {
                System.out.println("\"" + word1 + "\"" + " " + "and " + "\"" + word2 + "\"" + " are anagrams");
            } else {
                System.out.println("\"" + word1 + "\"" + " " + "and " + "\"" + word2 + "\"" + " are not anagrams");
            }
        }


    }
}

/*
Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning
they contain the same characters in a different order. For example, "listen" and "silent" are
anagrams.
 */