public class Task2 {
    public static void main(String[] args) {

        String name = "James12346w";
        int count=0;

        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                count++;

            }

        }
        System.out.println(count);

    }
}

// Find out how many alpha characters are present in a string?