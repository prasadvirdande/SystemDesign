package String;

public class CountVowel {


    public static void main(String[] args) {
        String s = "Hello World";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ele = Character.toLowerCase(s.charAt(i));


            if (ele == 'a' || ele == 'e' || ele == 'i'
                    || ele == 'o' || ele == 'u') {
                count++;
            }
        }

        System.out.println("Vowel count: " + count);
    }


}
