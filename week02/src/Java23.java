import java.util.Scanner; 
public class Java23 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("enter the value of a and b: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
       
        int sum = add(a, b);
        System.out.println("Sum of a and b is: " + sum);
        int difference = subtract(a, b);
        System.out.println("Difference of a and b is: " + difference);
        int product = multiply(a, b);
        System.out.println("Product of a and b is: " + product);
        int quotient = divide(a, b);
        System.out.println("Quotient of a and b is: " + quotient);

        
    }
    static int add(int a, int b)
{
    int result = a + b;
    return result;
}
static int subtract(int a, int b)
{
    int result = a - b;
    return result;
}
static int multiply(int a, int b)
{
    int result = a * b;
    return result;
}
static int divide(int a, int b)
{
    int result = a / b;
    return result;
}

}