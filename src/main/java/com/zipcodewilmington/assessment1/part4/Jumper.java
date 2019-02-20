package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        // get someone to explain this to you. probably elenor
        // shes the one who said it was a oneliner.

    int numberJumps = k%j;
    int numK = (k -numberJumps)/j;
    return numberJumps + numK;

        /* int numberOfJumps = 0;//counter
    int heightofFlags = k;//k
    int heightOfJump = j;//j

        if(heightOfJump > heightofFlags){
            numberOfJumps = k;

        } else if(k%j==0){
            numberOfJumps = k/j;


        } else {
            heightOfJump = k % j;
            heightofFlags =k/j;
            numberOfJumps = j + k;

        }

        return numberOfJumps ;
        /*/

    }
}
