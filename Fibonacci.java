public class Fibonacci{
    public static int no(int n) {
        int last;
        int seclast;
        if (n <= 1) {
            return n;
        }


        // multiple recursive call


        last = no(n - 1);
        seclast = no(n - 2);
        return last + seclast;
    }

    public static void main(String[] args) {
        int result = no(5); 
        System.out.println(result);
    }
}
