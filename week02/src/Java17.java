public class Java17 {
    public static void main(String[] args) {
       String str = "I Love Bangladesh";
       String [] arr = str.split("\\s+");

       for(int i = 0; i < arr.length; i++)
       {
           System.out.println(arr[i]);
       }
    }
}