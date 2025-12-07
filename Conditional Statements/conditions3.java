import java.util.*;

public class conditions3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int button = sc.nextInt();

        if (button==1) {
            System.out.println("Hello");
        }
        else if (button == 2){
            System.out.println("Namaste");
        }
        else if (button ==3){
            System.out.println("What's Up!");
        }
        else{
            System.out.println("Invalid Output");
        }
        sc.close();
    }
}
