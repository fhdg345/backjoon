
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hun1 = num1/100;
        int ten1 = (num1/10)%10;
        int one1 = num1%10;
        int sg1 = one1*100 + ten1*10 + hun1;
        int hun2 = num2/100;
        int ten2 = (num2/10)%10;
        int one2 = num2%10;
        int sg2 = one2*100 + ten2*10 + hun2;

        if(sg1>sg2)
            System.out.println(sg1);
        else
            System.out.println(sg2);
    }

}