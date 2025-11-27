import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter Num2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        
        System.out.println(num1 + " + " +num2 + " = " + sum);
        input.close();
    }
}
