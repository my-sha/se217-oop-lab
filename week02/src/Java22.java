public class Java22 {
    public static void main(String[] args) {
        divisors(12);


    }
    static void divisors(int num)
    {
        System.out.println("Divisors of " + num + " are: ");
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}