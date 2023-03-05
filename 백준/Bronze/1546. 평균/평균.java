import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int [] arr = new int[n];
        int max =0;
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        sum=(sum*100)/max;
        System.out.print(sum/n);
    }
}