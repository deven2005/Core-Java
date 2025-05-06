
//revers number print 

public class Recurs2 {

    
    void rec( int i,int n){
       
        
        if(i>n)  //base case 
        {  
            return;
           
        }
        System.out.println(n);
        rec(i,n-1); // recursive call

    }
   
    public static void main(String[] args) {
        Recurs2 obj = new Recurs2();
        obj.rec(1,5);
    }
    
    
} 


// for linear no print n
// public class Recurs2 {

    
//     void rec( int i,int n){
       
        
//         if(i>n)  //base case 
//         {  
//             return;
           
//         }
//         System.out.println(i);
//         rec(i+1,n); // recursive call

//     }
   
//     public static void main(String[] args) {
//         Recurs2 obj = new Recurs2();
//         obj.rec(1,5);
//     }
    
    
// } 

















