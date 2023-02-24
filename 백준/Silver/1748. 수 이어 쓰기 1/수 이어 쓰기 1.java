import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int cnt =1;
        int digit = 10;
        for (int i = 1; i < n+1; i++) {
            if(i==digit){
                cnt++;
                digit*=10;
            }
            result += cnt;
        }
        System.out.println(result);
    }
        }