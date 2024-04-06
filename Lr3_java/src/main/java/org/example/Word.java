package org.example;
import java.util.Scanner;

public class Word {
    /*
     * З клавіатури вводиться текстовий рядок.
     * Скласти програму, яка підраховує кількість розділових знаків у тексті;
     * виводить всі слова, що мають парну кількість літер;
     * міняє місцями першу і останню літери кожного слова.
     */

     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Text: ");
        String text = sc.nextLine();
        String space = text.replaceAll("\\s+"," ");

        char[] characters = space.toCharArray();
        int i = 0;

        for (char word : characters){
            if ((word == '.') || (word == ',') || (word == ':') ||
                    (word == ';') || (word == '[') || (word == ']') ||
                    (word == '"') || (word == '/') || (word == '(') ||
                    (word == ')') || (word == '!') || (word == '?')){
                i++;
            }
        }
        System.out.println("Count Punctuation: " + i);

//  Виводить всі слова, що мають парну кількість літер;

        String wor = text.replaceAll("[\\p{Punct}\\s]", " ");
        String[] words = wor.split("\\s+");
         System.out.println("\nWords with an even number of letters: ");

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
//  Міняє місцями першу і останню літери кожного слова.
        System.out.println("\nNem Words: ");
        for (String up : words){
            if (up.length() < 2) {
                System.out.println(up);
                continue;
            }
            char firstLetter = up.charAt(0);
            char lastLetter = up.charAt(up.length() - 1);

            String newWord = lastLetter + up.substring(1, up.length() - 1) + firstLetter;
            System.out.println(newWord);
        }
    }
}
