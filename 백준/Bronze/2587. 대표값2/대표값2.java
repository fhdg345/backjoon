import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int avg=0;
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            avg+=arr[i];
        }
        avg/=5;
        System.out.println(avg);
        Arrays.sort(arr);
        result=arr[2];
        System.out.println(result);
    }
}