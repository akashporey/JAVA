import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter Num2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        
        System.out.println(num1 + " + " +num2 + " = " + sum);
        System.out.println(num1 + " - " +num2 + " = " + sub);
        System.out.println(num1 + " * " +num2 + " = " + mul);
        System.out.println(num1 + " / " +num2 + " = " + div);
        input.close();
    }
}
