import java.util.HashMap;

public class Task9 {


    public static char findNonRepeatingChar(String word){

        HashMap<Character,Integer> charCount= new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c=word.charAt(i);
            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c)+1);
            }else{
                charCount.put(c,1);
            }


        }
        for (int i = 0; i < word.length(); i++) {
            if(charCount.get(word.charAt(i))==1){
               return word.charAt(i);
            }

        }
        return 0;


    }

    public static void main(String[] args) {
        char result=findNonRepeatingChar("abracadabra");

        if(result!=0){
            System.out.println("First non repeating letter: "+result);
        }else{
            System.out.println("There is no non-repeating letters found");
        }
    }
}


/*
Find the First Non-Repeating Character in a String: Given a string, find and return the first non-
repeating character. For example, in the string "abracadabra", the first non-repeating character is
'c'.
 */