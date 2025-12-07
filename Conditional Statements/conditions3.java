import java.util.*;

public class conditions3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int button = sc.nextInt();

        if (button==0) {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
        sc.close();
    }
}
