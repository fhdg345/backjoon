import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int A[] = new int[n];
        Integer B[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }
        Arrays.sort(B, Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            sum+= A[i]*B[i];
        }
        System.out.print(sum);

    }
}