import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int z=sc.nextInt();
        int h=sc.nextInt();
        int count=0;

        while(z != h) {
            z = z/2 + z%2;
            h = h/2 + h%2;
            count++;
        }
        System.out.println(count);

    }
}