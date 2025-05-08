// sum of linear numbers usimg recursion

public class RecuSum {
    public int rc (int n) {
        if(n==0){
            return 0;

            
        }


        return(n+rc(n-1));
    }

    public static void main(String[] args) {
        RecuSum obj = new RecuSum();
        int result =obj.rc(5);
        System.out.println(result);
    }
    
}
