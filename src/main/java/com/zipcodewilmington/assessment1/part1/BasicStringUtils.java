package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
    String output = str.substring(0,1).toUpperCase() + str.substring(1);
        return output;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
    String temp="";
    for(int i = str.length()-1; i >= 0; i--){
        temp = temp + str.charAt(i);

    }

        return temp ;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        // reversed the string
        String reversedStr="";
       // String outputNew = "";
            for(int i = str.length() - 1; i >=0; i--){
                reversedStr = reversedStr + str.charAt(i);
               //
            }


            return reversedStr = reversedStr.substring(0,1).toUpperCase() + reversedStr.substring(1);


    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
          String answer = str.substring(1,str.length()-1);

        return answer;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        return null;
    }
}
