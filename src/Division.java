import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Integer:");
        int numerator = scanner.nextInt();
        System.out.println("Enter the Second Integer");
        int denominator = scanner.nextInt();
        try{
            int result = divide(numerator,denominator);
            System.out.println("Result of division :" +result);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }
    }
    public static int divide(int numerator, int denominator){
        return numerator / denominator;
    }
}
