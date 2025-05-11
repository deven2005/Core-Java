
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args) {



        // follow min heap order
        Queue <Integer> obj= new PriorityQueue<>();

        obj.add(29);
        obj.add(90);
        obj.add(2);
        obj.add(45);

        System.out.println(obj);

        // remove small element first

        obj.poll();
        System.out.println(obj);

        System.out.println(obj.peek());


        // for convert min heap to max heap use this condition
        // Queue <Integer> obj= new PriorityQueue<>(Comparator.reverseOrder());

        

    }
    
}


