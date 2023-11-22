import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character:");
        char ch = sc.next().charAt(0);

        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel");
        } else if (isConsonant(ch)) {
            System.out.println(ch + " is a consonant");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is not a vowel , consonant or digit");
        }
    }

        public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' ;
        }

        public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return !isVowel(ch) && !Character.isDigit(ch) && Character.isLetter(ch);
        }
}