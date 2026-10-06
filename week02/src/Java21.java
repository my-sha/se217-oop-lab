public class Java21 {
    public static void main(String[] args) {
        evenOrOdd(10);
        evenOrOdd(15);
        evenOrOdd(20);
        evenOrOdd(25);
        evenOrOdd(30);
    
    }
    static void evenOrOdd(int num)
    {
        if(num % 2 == 0)
            System.out.println(num + " is Even Number.");
        else
            System.out.println(num + " is Odd Number.");
    }
}