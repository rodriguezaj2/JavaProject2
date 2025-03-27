import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> word= new ArrayList<>();
        word.add("Hello");
        word.add("Anthony");
        word.add("Heaven");
        word.add("Ammiel");


        for (int i = 0; i < word.size(); i++) {
            String newWord=word.get(i).toString();
            char letter=newWord.charAt(0);

            if(Character.toLowerCase(letter)=='a'||letter=='A'){
                System.out.println(newWord);
            }


        }

    }
}

/*
You have a list of strings and you want to keep only those that start with “A” and you want to
return them in lower case".
 */
