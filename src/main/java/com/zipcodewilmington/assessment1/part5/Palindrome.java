package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input) {   //a b c c b a
        int pDromcount=0;                             // b c c b
        //looping forward from front                  //   c c
        for (int i = 0; i < input.length() ; i++) {  //     c
            //looping backwards from back
            for(int j = input.length(); i < j; j--){
                //checking if the input is the same forwards and backwards and if it is add to counter
                if(input.substring(i,j).equals(BasicStringUtils.reverse(input.substring(i,j)))){
                    pDromcount++;
                }
            }
        }





        return pDromcount;
    }
}

