import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] person = new int[9];
        int fake1 = 0, fake2= 0;
        int sum = 0;
        for (int i = 0; i < person.length ; i++) {
            person[i]= sc.nextInt();
            sum+=person[i];
        }
        Arrays.sort(person);
        for (int i = 0; i < person.length ; i++) {
            for (int j = 1; j < 9; j++) {
                if(person[i]+person[j]==sum-100){
                    fake1=i;
                    fake2=j;
                    break;
                }
            }
        }
        for (int i = 0; i < person.length ; i++) {
            if(i==fake1 || i==fake2){
                continue;
            }
            System.out.println(person[i]);
        }
    }
}