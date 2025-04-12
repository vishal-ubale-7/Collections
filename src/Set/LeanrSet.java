package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LeanrSet
{
    public static void main(String  []args)
    {
       // Set<Integer> set = new HashSet<>();
       // Set<Integer> set = new LinkedHashSet<>(); //same but linedHashset maintain the order

        Set<Integer> set = new TreeSet<>(); // TreeSet Shorted the elements in acceding order

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);

        /*set.remove(10);
        System.out.println(set); // remove the element

        System.out.println(set.contains(20)); // return boolean values true or false

        System.out.println (set.isEmpty());// return boolean values

        System.out.println(set.size()); // how many element present in this set

        set.clear();
        System.out.println(set); // clear the all set
*/
    }
}
