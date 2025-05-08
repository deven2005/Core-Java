public class RecurString {
    public static void reverse(String[] arr, int start, int end){

        if(start>=end){
            return;

        }

        String temp=arr[start];
        arr[start]=arr[end];
        arr[end]= temp;

        reverse(arr, start + 1, end-1);

    }

    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four"};
        reverse(arr,  0, arr.length-1);
        for (String i : arr) {
            System.out.print(i + " ");
          }

    }
 
    
    
}
