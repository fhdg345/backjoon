import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum = sc.nextInt();
        int type = sc.nextInt();
        int receipt = 0;
        for (int i = 0; i <type; i++) {
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            receipt += price*cnt;
        }
        if(sum == receipt)
            System.out.println("Yes");
        else
            System.out.println("No");




    }
}