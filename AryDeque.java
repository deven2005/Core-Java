
import java.util.ArrayDeque;
public class AryDeque {
    public static void main(String[] args) {
        ArrayDeque <Integer> obj = new ArrayDeque<>();

        obj.offer(20);

        
        // special function


        obj.offerFirst(100);
        obj.offerLast(500);

        System.out.println(obj);
    }
    
}
