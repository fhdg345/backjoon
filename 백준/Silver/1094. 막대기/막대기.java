import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;
        int stick = 64;
        while (x > 0) {
            if (stick > x) {
                stick /= 2;
            } else {
                count++;
                x -= stick;
            }
        }
        System.out.println(count);
    }
        }