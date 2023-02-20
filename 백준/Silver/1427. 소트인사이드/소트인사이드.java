import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        Integer[] arr = new Integer[n.length()];
        for (int i = 0; i < n.length() ; i++) {
            arr[i]=n.charAt(i)-'0';
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < n.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}