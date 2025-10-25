import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        int[] array={1,2,3,4,5,6};
        return array;
        // return null;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        // TODO: Fill in this function.
        String[] Ergun_food={"beyti", "pizza", "hamburger", "tea"};
        String[] Erik_food={"sushi", "pasta", "avocado", "coffee"};
        if (customer.equals("Ergun"))
        {
            return Ergun_food;
        }
        else if (customer.equals("Erik"))
        {
            return Erik_food;
        }
        else
        {
            return new String[3];
        }
        // return null;
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.
        int minvalue=array[0];
        int maxvalue=array[0];

        for (int values:array)
        {
            if (values>maxvalue)
            {
                maxvalue=values;
            }

            if (values<minvalue)
            {
                minvalue=values;
            }
        }
        int difference=maxvalue-minvalue;
        return difference;
        // return 0;
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // TODO: Fill in this function.

        if (x==1) // recursion exit
        {
            list.add(x);
            return list;
        }

        else if (x % 2==0) // even
        {
            list.add(x);
            hailstoneHelper(x/2,list);
        }

        else if (x%2!=0) // odd
        {
            list.add(x);
            hailstoneHelper(3*x+1,list);
        }

        return list;
        // return null;
    }

}
