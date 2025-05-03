public class prime {
    void fac(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++; // count how many numbers divide n exactly
            }
        }

        if (count == 2) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        prime obj = new prime();
        obj.fac(3);  // Change the number here to test different values
    }
}
