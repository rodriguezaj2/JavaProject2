public class Task6VowelMethod {

    String word;

     Task6VowelMethod(String word){
         this.word=word;
    }

    void vowelCounter(){
         int count=0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(word+" "+"has "+count+" vowels");
    }
}


/*
Create a method to count how many vowels are present in a string “documentation”
 */