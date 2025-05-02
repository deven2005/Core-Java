
//  factorial code of N number


public class factorial {
    public int  mul (int n){
        if(n==1)  //base case 
        {  
            return 1;
        }

         
          return n* mul(n-1);  // recursive call

    }
    public static void main(String[] args) {
        factorial obj = new factorial();
        int result = obj.mul(3);
        System.out.println(result);
    }
   
    
}
