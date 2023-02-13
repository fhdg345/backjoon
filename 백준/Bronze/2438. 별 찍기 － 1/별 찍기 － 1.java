import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";
        int cnt = 1;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < cnt; j++) {
                System.out.print(star);
            }
            System.out.println();
            cnt++;
        }
    }
}