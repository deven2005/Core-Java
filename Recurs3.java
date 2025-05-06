
//sum of N numbers 

public class Recurs3 {
    void rec( int i, int sum){

       
       
        
                if(i<1)  //base case 
                {  
                    System.out.println(sum);
                    return;
                   
                }
               
                
                rec(i-1,sum+i); // recursive call
        
            }
           
            public static void main(String[] args) {
                Recurs3 obj = new Recurs3();
                obj.rec(3,0);
                
            }
            
    
}
