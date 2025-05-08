
import java.util.Scanner;

public class reverseno {
   
   public int countdigit(int n){
    int reverse =0;

    while(n>0){
       int lastdigit = n%10;
        n=n/10;

        reverse = (reverse*10)+ lastdigit;

    }
    return reverse;
    
        
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
         int n= sc.nextInt();
       
         reverseno q = new reverseno();
         int result= q.countdigit(n);
         System.out.println(result);
    }


}
    

