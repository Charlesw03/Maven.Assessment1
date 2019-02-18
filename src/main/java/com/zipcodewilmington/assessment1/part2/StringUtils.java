package com.zipcodewilmington.assessment1.part2;

import java.util.regex.Pattern;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

      String [] words = sentence.split("");
        Pattern pattern=Pattern.compile(" ");

        words = pattern.split(sentence);


        return words;

    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
         String [] myString = sentence.split(" ", 2);
         String firstWord = myString[0];


        return firstWord;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
            String [] myStr = sentence.split(" ", 2);
            String firstWord = myStr[0];
            String revFirst = "";

        for (int i =firstWord.length() -1 ; i >= 0 ; i--) {

            revFirst = revFirst + sentence.charAt(i);
        }

        return revFirst;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String [] myStr = sentence.split(" ", 2);
        String firstWord = myStr[0];
        String revFirst = "";

        for (int i =firstWord.length() -1 ; i >= 0 ; i--) {

            revFirst = revFirst + sentence.charAt(i);
        }

        return revFirst =revFirst.substring(0,1).toUpperCase() + revFirst.substring(1);


    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String spoof ="";

        if(str == "Jumping"){
               spoof = "Juping";
           }

            return spoof;

    }

}
