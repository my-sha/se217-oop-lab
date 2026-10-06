public class Java6 {
    public static void main(String[] args) {
        int age = 20;

        if(age < 2){
            System.out.println("Infant");
        }
        else if(age >= 2 && age < 10){
            System.out.println("Child");
        }
        else if(age >= 10 && age < 20){
            System.out.println("Teenager");
        }
        else if(age >= 20 && age < 30){
            System.out.println("Young Adult");
        }
        else{
            System.out.println("Adult");
        }
    }
}