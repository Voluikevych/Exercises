/**
 * @(#)Exercise108.java
 *
 * This application search minimum number 2^r which greater than input natural number n.
 */
package exercises;

import static java.lang.Math.pow;

public class Exercise108 {

    public static void main(String[] args) {

        int n=-5;
        Exercise108 exercise108 = new Exercise108();
        int result = exercise108.calcDegree(n);
        System.out.println(result);
    }

    /**
     *
     * @param n it is input parameter n
     * @return returns minimum number 2^r greater than n
     */
    public int calcDegree (int n){

        if(n < 0){
            throw new IllegalArgumentException("n should be positive");
        }

        int r=0;
        for(int i=0;pow(2,i)<=n;i++){
            r++;
        }
        return (int) pow(2,r);
    }

}


