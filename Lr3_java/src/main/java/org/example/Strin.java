package org.example;
import java.util.Scanner;
class Strin {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Text: ");
        String text = sc.nextLine();

        String space = text.replaceAll("\\s+"," ");
        String[] words = space.split(" ");

        for(String word : words){

            System.out.println(word + " | " + word.length());
        }
    }
}
