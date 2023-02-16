import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr= new String[N];
        for (int i = 0; i < N; i++) {
            arr[i]=sc.next();
        }

        for (int i = 0; i < N; i++) {
            int count=0;
            int sum=0;
            for (int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j)=='O'){
                    count++;
                }
                else count=0;
                sum += count;
            }
            System.out.println(sum);
        }
    }
}