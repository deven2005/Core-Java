public class palindrome {
    public static void main(String[] args) {
        StringBuilder original = new StringBuilder("madam");

        original.reverse();
        if (original.equals(original)) {
            System.out.println("it is palindrome");

            
        }
        else{
            System.out.println("not  palindrome");
        }

    }
    
}
