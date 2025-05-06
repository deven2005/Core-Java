public class Recurs1 {
    void rec(int count){
        if(count==0)  //base case 
        {  
            return;
        }
        String name = "deven";
        System.out.println(name);
        rec(count-1);    // recursive call

    }
   
    public static void main(String[] args) {
        Recurs1 obj = new Recurs1();
        obj.rec(3);
    }
    
}


// another method 

// public class Recurs1 {
//     void rec(int count, int n){
//         if(count>n)  //base case 
//         {  
//             return;
//         }
//         String name = "deven";
//         System.out.println(name);
//         rec(count+1,n);    // recursive call

//     }
   
//     public static void main(String[] args) {
//         Recurs1 obj = new Recurs1();
//         obj.rec(1,5);
//     }
    
// }




