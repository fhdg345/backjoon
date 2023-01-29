import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int num = 1;
        for (int i = 0; i < m ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == num)
                num =  y;
            else if (y == num )
                num  = x;

        }
        System.out.println(num);
    }
}