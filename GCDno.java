public class GCDno {
    int gcd; 
 public int GCD(int n1, int n2) {
   
        for(int i = 1; i<n1 && i<n2; i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
               
               
            }
           
        }

        return gcd;
    }


    public static void main(String[] args) {
        GCDno ob = new GCDno();
        int result = ob.GCD(4, 6);

        System.out.println(result);

    }
}