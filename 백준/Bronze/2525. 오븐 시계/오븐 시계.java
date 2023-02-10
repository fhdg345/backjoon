import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cooktime = sc.nextInt();
        minute = minute+cooktime ;
        while(minute>=60){
                hour++;
                minute = minute - 60;
            if(hour>=24)
                hour = hour-24;
            }

        System.out.println(hour+" "+minute);
    }
}
