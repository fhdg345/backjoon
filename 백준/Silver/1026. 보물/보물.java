import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        Integer B[] = new Integer[n];
        int s=0;
        for (int i = 0; i < n; i++) {
            A[i]= sc.nextInt();
        }
        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(B, Comparator.reverseOrder());
        for (int i = 0; i <n; i++) {
            s+=A[i]*B[i];
        }
        System.out.println(s);
    }
}