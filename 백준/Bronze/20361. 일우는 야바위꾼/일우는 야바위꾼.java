import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int k = sc.nextInt();


        for (int i = 0; i < k; i++) {
            int ball = x;
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==ball)
                x = b;
            else if (b==ball)
                x = a;
        }
        System.out.println(x);

        }

}