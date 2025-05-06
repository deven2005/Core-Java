public class RecurChar {
    public static void reverse(char [] letter, int start,int end) {

        if(start>=end){
            return;
        }

        char temp=letter[start];
        letter[start]= letter[end];
        letter[end]= temp;

       
        reverse(letter, start + 1, end - 1);
        
    }
   

   

    public static void main(String[] args) {
        char[]letter= {'H', 'e', 'l', 'l', 'o'};
        reverse(letter, 0, letter.length-1);
        for (char i : letter) {
            System.out.print(i + " ");
          }
    }
    }
      
    
      
        
    
    

