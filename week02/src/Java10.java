public class Java10 {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 30; i<=120 ; i++) {
            if(i%3 == 0 && i%5 == 0){
                 sum += i;

            }
        }
        System.out.println("Sum of numbers from 30 to 120: " + sum);
    
    }
}