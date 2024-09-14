package JavaPractice;

import java.util.Scanner;

class question2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a word to see if it is a  palindrome: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        boolean isPalindrome = true;
        int length = input.length();

        for(int i = 0; i < length / 2; ++i){
            if(input.charAt(i) != input.charAt(length - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(" The word is a Palindrome. ");
        } else {
            System.out.println(" The word is not a Palindrome. ");
        }
        scanner.close();
    }
}