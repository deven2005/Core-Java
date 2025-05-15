
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    

    public static void main(String[] args) {
        Map<String , Integer> obj = new TreeMap<>();  
        obj.put("one" ,1);
        obj.put("two", 2);
        obj.put("zero", 0);
      

        System.out.println(obj);

    }
}
