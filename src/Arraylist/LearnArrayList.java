package Arraylist;

import java.util.ArrayList;
import java.util.List;
public class LearnArrayList
{
    public static void main(String[] args)
    {
         /*ArrayList<Integer> student = new ArrayList<>();
         student.add(1);
         student.add(2);
         student.add(3);
         student.add(4);
         System.out.println(student);
         student.add(5);// add element

         student.add(2 ,20); // add the new elements 2 index positions
         System.out.print(student);

        List<Integer> newList = new ArrayList<>();
        newList.add(11);
        newList.add(12);
        student.addAll(newList); // add the new list
        System.out.println(student);


        System.out.println(student.get(3));// get the value using mentions index number
        */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);
        list.add(70);
        System.out.println(list);

       /*
         Use For Loop

         for(int i = 0; i<list.size();i++)
         {
             System.out.println( "The Elements is " + list.get(i)); // using for loop
         }

         for(Integer element: list)
         {
             System.out.println(element);
         }*/


         /*Update methods
         list.set(1,10); // change the values
         System.out.print(list);

        System.out.println(list.contains(50)); // check values is present or not
*/

        /* Remove Methods
         list.remove(2);   // remove the element 2 index
        System.out.println(list);

        list.remove(Integer.valueOf(30)); // remove the direct values mentions
        System.out.println(list);

        list.clear();
        System.out.println(list); // clear the all string
*/

    }
}
