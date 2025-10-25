import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        Map<Character,Integer> result=new HashMap<>();
        for (int j=0;j<alphabets.length();j+=1)
        {
            result.put(alphabets.charAt(j),j+1);
        }
        return result;
        // return null;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer,Integer> result=new HashMap<>();
        for(int value:nums)
        {
            result.put(value,value*value);
        }
        // return null;
        return result;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String,Integer> result=new HashMap<>();
        for(String word:words)
        {
            if (result.containsKey(word))
            {
                int a=result.get(word)+1;
                result.put(word,a);
            }

            else
            {
                result.put(word,1);
            }
        }
        // return null;
        return result;
    }
}
