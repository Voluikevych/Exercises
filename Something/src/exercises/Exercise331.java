/**
 * @(#)Exercise331.java
 *
 * This application search three integer numbers x, y, z the sum of square which is equal to some integer number n.
 */
package exercises;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Exercise331 {

    public static void main(String[] args) {
        int n = -12;
        Exercise331 exercise331 = new Exercise331();
        List<Parameter> result = exercise331.calcSumOfSquare(n);
        if (result.size() == 0)
        {System.out.println("Fail: the number " + n
                + " can not be represented as sum of squares of 3 integers");
        }
        else {System.out.println(result.get(0).getX()+ " " +result.get(0).getY()+ " " +result.get(0).getZ());}

    }

    /**
     *
     * @param param it is the input parameter n
     * @return returns numbers x, y, z the sum of square which is equal to n
     */

    public List<Parameter> calcSumOfSquare(int param) {

        int sumOfSquare;
        List<Parameter> result = new ArrayList<>();
        int size = (int) (sqrt(param) + 1);


        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                for (int z = 0; z < size; z++) {
                    sumOfSquare = x * x + y * y + z * z;
                    if (sumOfSquare == param) {
                        result.add(new Parameter(x, y, z));
                    }
                }
            }
        }
        return result;
    }

}