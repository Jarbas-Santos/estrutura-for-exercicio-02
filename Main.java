import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int inside = 0;
        int outside = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                inside++;
            }
            else {
                outside++;
            }
        }

        System.out.println(inside + " in");
        System.out.println(outside + " out");
        
        sc.close();
    }
}