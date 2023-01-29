import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int d = sc.nextInt();
            int s = 1;
            while(s*s+s<=d)
                s++;
            System.out.println(s-1);


        }
    }
}