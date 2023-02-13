import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        String star = "*";
        int count=T;
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < count-1; j++) {
                System.out.printf(" ");
            }
            for (int j = T; j > count-1; j--) {
                System.out.printf(star);
            }
            System.out.println(); count--;
        }
    }
}