import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int run = scanner.nextInt();
        run %= 100;
        int distance = 0;
        for (int i = 0; i < run; i++) {
            if (i<5){
                distance++;
            }
            else if(i>=5&&i<10){
                distance--;
            }
            else if(i>=10&&i<20){
                distance++;
            }
            else if(i>=20&&i<30){
                distance--;
            }
            else if(i>=30&&i<45){
                distance++;
            }
            else if(i>=45&&i<60){
                distance--;
            }
            else if(i>=60&&i<80){
                distance++;
            }
            else {
                distance--;
            }
        }
        if (distance == 0){
            System.out.println(0);
        }
        if (distance> 0&&distance<=5){
            System.out.println(1);
        }
        if (distance> 5&&distance<=10){
            System.out.println(2);
        }
        if (distance> 10&&distance<=15){
            System.out.println(3);
        }
        if (distance> 15&&distance<=20){
            System.out.println(4);
        }
    }
}