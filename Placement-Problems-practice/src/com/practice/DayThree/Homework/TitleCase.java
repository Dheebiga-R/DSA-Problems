package com.practice.DayThree.Homework;

import java.util.Scanner;

public class TitleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str = input.nextLine();
        System.out.println(titleCase(str));
    }

    private static String titleCase(String str) {
        String[] lowercaseWords = {"a", "an", "the", "and", "but", "for", "nor", "or", "so", "to", "on", "at", "by", "as", "up", "in", "of", "with"};
        String[] words = str.toLowerCase().split(" ");

        StringBuilder titlecase = new StringBuilder();

        for(int i=0;i<words.length;i++){
            if(i==0 || i== words.length-1 || !islowercaseWords(words[i],lowercaseWords)){
                titlecase.append(capitalize(words[i]));
            }else{
                titlecase.append(words[i]);
            }
            if(i!=words.length-1){
                titlecase.append(" ");
            }
        }
        return titlecase.toString();
    }

    private static String capitalize(String word) {
        return word.substring(0,1).toUpperCase()+word.substring(1);
    }

    private static boolean islowercaseWords(String word, String[] lowercaseWords) {
        for(int i=0;i<lowercaseWords.length;i++){
            if(word.equals(lowercaseWords[i])){
                return true;
            }
        }
        return false;
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}
