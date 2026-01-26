package Lab1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("palindrome!");
        } else {
            System.out.println("Not palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
