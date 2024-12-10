package app;

import java.util.Random;
import java.util.Scanner;

public class L4PR {
    public static void main(String[] args) {

        String occuranceStr = "Hello World";
        char c = 'o';
        System.out.println(findSymbolOccurance(occuranceStr, c));

        String source = "Hotel", target = "tel";
        System.out.println(findWordPosition(source, target));

        String reverseStr = "Room tour";
        System.out.println(reverseString(reverseStr));

        String palindromeStr = "ini", palindromeStr2 = "Work";
        System.out.println(isPalindrome(palindromeStr));
        System.out.println(isPalindrome(palindromeStr2));

        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot",
                "avocado" , "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        String secretWord = words[random.nextInt(words.length)];
        Scanner scanner = new Scanner(System.in);

        boolean guessed = false;
        while(!guessed) {
            System.out.println("Please enter your secret word: ");
            String userGuess = scanner.nextLine();

            if(userGuess.equals(secretWord)) {
                System.out.println("You guessed correctly!");
                guessed = true;
            }else{
                System.out.println("Your guess is not correct! Tip: ");
                System.out.println(generateHint(secretWord , userGuess));

            }
        }

        scanner.close();


    }

    public static int findSymbolOccurance(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (sb.toString().equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static String generateHint(String secretWord, String userGuess) {
        StringBuilder hint = new StringBuilder();

            for (int i = 0; i < 15; i++) {
                if (i < secretWord.length() && i < userGuess.length()
                        && secretWord.charAt(i) == userGuess.charAt(i)) {
                    hint.append(secretWord.charAt(i));
                } else {
                    hint.append("#");
                }
            }
            return hint.toString();
        }
    }