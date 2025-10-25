import java.sql.Array;
import java.util.List;
import java.util.ArrayList;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum=0;
        for (int value:L)
        {
            sum+=value;
        }
        return sum;
        // return 0;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> result=new ArrayList<>();
        for (int value:L)
        {
            if (value%2==0)
            {
                result.add(value);
            }
        }

        return result;
        // return null;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> result=new ArrayList<>();
        for (int value:L1)
        {
            if (L1.contains(value) && L2.contains(value))
            {
                result.add(value);
            }
        }
        return result;
        // return null;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count=0;
        for(String value:words)
        {
            for (char d:value.toCharArray())
            {
                if (c==d)
                {
                    count+=1;
                }
            }
        }
        return count;
        // return 0;
    }
}
