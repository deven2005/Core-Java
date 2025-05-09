import java.util.Scanner;

public class amstrong {

    public boolean amst(int n) {
        int original = n;
        int sum = 0;
        
        while (n > 0) { 
            int lastDigit = n % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        amstrong obj = new amstrong();
        if (obj.amst(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
