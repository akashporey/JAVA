import java.util.*;

public class multiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=0;
        int n = sc.nextInt();
        for(int i=1; i<11; i++){
            r=n*i;
            //System.out.println(r);
            System.out.println(n+ "X" + i + "=" + r);
        }
        sc.close();
    }
}
