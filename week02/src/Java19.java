//import java.util.Scanner;

public class Java19 {
    public static void main(String[] args) {
        sayHi();

        int addition = getSum(10, 20);
        System.out.println("The sum is: " + addition);
    }
    static int getSum(int a, int b) {
            int sum = a + b;
            return sum;

        }
    static void sayHi(){
        System.out.println("Hi Bangladesh!");
    }
}