public class Java11 {
    public static void main(String[] args) { 
        int sum = 0;
        int i = 5;
        while(i<=100){
            sum += i;
            i += 5;
        }

        System.out.println("Sum of numbers from 5 to 100 with step of 5: " + sum);
    
    }
}