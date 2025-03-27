public class Task3 {
    public static void main(String[] args) {

        String word="Hello";
        StringBuilder sb=new StringBuilder(word);
        sb.reverse();
        word=sb.toString();
        System.out.println(word);

    }
}

/*
Reverse a String: Write a function to reverse a given string. For example, given the input "Hello",
the output should be "olleH".
 */