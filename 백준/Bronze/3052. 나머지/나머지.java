import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean bl;
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt()%42;
        }
        for (int i = 0; i < arr.length ; i++) {
            bl = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    bl = true;
                    break;
                }
            }
            if (bl == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}
