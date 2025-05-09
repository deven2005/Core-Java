import java.util.Scanner;

public class factors {
    
    void fac( int n) {
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }

        }

    }

    public static void main(String[] args) {
         factors obj= new factors();
         obj.fac(6);
    }

}
