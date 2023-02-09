import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (0 < i && 100 > i)
                sum++;
            else {
                int one = i % 10;
                int ten = (i / 10) % 10;
                int hun = i / 100;
                if (hun - ten == ten - one)
                    sum++;

            }

        }
        System.out.println(sum);
    }
}

