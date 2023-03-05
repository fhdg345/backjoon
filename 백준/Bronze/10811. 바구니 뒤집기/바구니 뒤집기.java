import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            while (a < b) {
                int temp = arr[a];
                arr[a++] = arr[b];
                arr[b--] = temp;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}