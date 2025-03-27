import java.util.ArrayList;
import java.util.LinkedHashSet;


public class Task10 {
    public static void main(String[] args) {

        ArrayList<String> word = new ArrayList<>();
        word.add("Matthew");
        word.add("Mark");
        word.add("Luke");
        word.add("John");
        word.add("John");

        LinkedHashSet<String> newCollection=new LinkedHashSet<>(word);
        System.out.println(word); //contains the duplicate
        System.out.println(newCollection); //duplicate removed

    }
}
