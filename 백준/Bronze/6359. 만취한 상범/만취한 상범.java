import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //테스트 개수
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // 방 개수
            int [] arr = new int [n+1];

        for (int j = 1; j <= n; j++) {
            for (int k = 1; j * k<=n; k++) {
                if(arr[k*j] !=0)
                    arr[k*j]=0;
                else arr[k*j] = 1;
                 }
            }
        int count = 0;
        for(int l =1; l<= n ; l++){
            if(arr[l]==1) count++;
        }
            System.out.println(count);
        }

    }

}


