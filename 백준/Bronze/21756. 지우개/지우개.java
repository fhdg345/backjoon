import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        while(true) {
            if(list.size()==1)
                break;
            for (int i = 0; i < list.size(); i++) {
                list.remove(i);
            }

        }
        System.out.println(list.get(0));
    }
}