import java .util.ArrayList;
import java.util.List;


public class ArrList {

    public static void main(String[] args) {
    

        List<Integer> List = new ArrayList<>();


        List.add(2);
        List.add(4);
        List.add(6);
        System.out.println(List);


        // adding one element in arraylist

        List.add(12);
        System.out.println(List);

        // add on index

        List.add(1, 50);
        System.out.println(List);
        

        // adding another list in above list
        
        List<Integer> num = new ArrayList<>();
        num.add(200);
        num.add(300);

        List.addAll(num);
        System.out.println(List);



        // method for getting no from the list 

        System.out.println(List.get(1));
        
        // for removing element

        System.out.println(List.remove(1));
        System.out.println(List);

        // if element present in the list
        
        System.out.println(List.contains(200));

        // change index element 

        List.set(4, 10000);
        System.out.println(List);

    
    }
    
    
}