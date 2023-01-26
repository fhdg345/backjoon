import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int zero = 0;
            for (int j = n; j <= m; j++) {
                int k =j;
                if(k==0)zero++;
                while(k>=1){
                    if(k%10==0)zero++;
                    k/=10;
                }

            }
            System.out.println(zero);
        }

    }
}    