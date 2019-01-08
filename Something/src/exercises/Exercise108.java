/**
 * @(#)Exercise108.java
 *
 * This application search minimum degree of 2 which greater than input integer number n.
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
     * @return returns degree
     */

    public int calcDegree (int n){

        int r=0;
        for(int i=0;pow(2,i)<=n;i++){
            r++;
        }
        return r;
    }

}


