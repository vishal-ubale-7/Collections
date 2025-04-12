package Stack;

import java.util.Stack;

public class LearStack
{
    public static void main(String []args)
    {
        // LIFO
        Stack<String> animal = new Stack<>();
        animal.push("Loin");
        animal.push("Dog");
        animal.push("Horse");
        animal.push("Cat");
        System.out.println("Animals " + animal);

        System.out.println(animal.peek());

        animal.pop();
        System.out.println("Animals " + animal);

        System.out.println(animal.peek());
        System.out.println("Animals " + animal);


    }
}
