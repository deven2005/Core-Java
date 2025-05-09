import java.util.Scanner;

class math {

   public int countdigit(int n){
    int count=0;

    while(n>0){
        count++;
        n=n/10;


    }
    return count;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
         int n= sc.nextInt();
       
         math q = new math();
         int result= q.countdigit(n);
         System.out.println(result);
    }


}