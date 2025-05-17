
import java.util.Stack;


public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("dog");
        animal.push("lion");
        animal.push("tiger");
        animal.push("fish");

        System.out.println(animal);

    //    cheak top element in stack

    //    System.out.println(animal.peek());

       
    //  remove top element from stack

    animal.pop();
    
    System.out.println(animal.peek());
    System.out.println(animal);
  


       
    }

    
}

