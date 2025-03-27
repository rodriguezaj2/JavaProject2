public class Task4 {
    public static void main(String[] args) {
        String word="madam";
        StringBuilder sb=new StringBuilder(word);
        sb.reverse();
        //System.out.println(sb);

        if(word.equals(sb.toString())){
            System.out.println(word+" is a palindrome");
        }else{
            System.out.println(word+" is not a palindrome");
        }

    }
}

/*
Check if a String is Palindrome: Determine whether a given string is a palindrome, which means
it reads the same forwards and backward. For example, "madam" is a palindrome.
 */