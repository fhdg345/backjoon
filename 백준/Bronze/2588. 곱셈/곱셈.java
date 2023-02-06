import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int count=1;
        for (int i = 0; i < 3; i++) {
            sum+=a*(b%10)*count;
            System.out.println(a*(b%10));
            b/=10; 
            count*=10;
        }
        System.out.println(sum);


        }
    }





