import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        int cnt=1;
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum=a+b;
            System.out.println("Case #"+cnt+": "+sum);
            cnt++;
        }
    }
}