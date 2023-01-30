import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a <= 4 || b <= 4){

            b += a;
                if(b>4) {
                    System.out.println("yt");
                    break;
                }
                else{
                    a+=b;
                    if(a>4) {
                        System.out.println("yj");
                        break;
                    }
                }





        }

    }


}