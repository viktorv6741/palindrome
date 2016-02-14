package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Please, enter some word");
        String someWord = console.nextLine();

        String result = checkIfPalindrome(someWord);
        System.out.println(result);

    }

    public static String checkIfPalindrome(String str) {
        if ((str.length() == 0) || (str.length() == 1))
            return "This is not palindrome. \nPlease, try one more time. \n";
        else {
            if (str.charAt(0) == str.charAt(str.length() - 1)) return "This is palindrome.";
            else return checkIfPalindrome(str.substring(1, str.length() - 1));
        }
    }
}
