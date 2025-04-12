package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap
{
    public static void main(String [] args )
    {
        Map<String, Integer>  numbers = new HashMap<>();
        //Map<String,Integer> numbers = new TreeMap<>();// TreeMap shorted key in alphabetic from
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);
        System.out.println(numbers);

        for(Map.Entry<String, Integer> e: numbers.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(String Key: numbers.keySet())
        {
            System.out.println(Key);  // show only key
        }

        for (Integer value : numbers.values())
        {
            System.out.println(value); // show only value
        }

    }
}
