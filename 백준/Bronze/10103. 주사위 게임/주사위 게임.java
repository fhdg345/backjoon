import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum_a = 100;
        int sum_b = 100;

        for (int i=0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {

            } else if (a > b) {
                sum_b = sum_b - a;
            } else if (a < b) {
                sum_a = sum_a - b;
            }
        }

        System.out.println(sum_a);
        System.out.println(sum_b);
    }
}