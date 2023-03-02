import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp = 0;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=i+1;
        }
        for (int a = 0; a < m; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            temp = arr[i-1];
            arr[i-1]=arr[j-1];
            arr[j-1]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
