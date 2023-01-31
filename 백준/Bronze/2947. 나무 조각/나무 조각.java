import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] tree = new int[5] ;

        for (int i = 0; i < 5; i++) {
            tree[i] = sc.nextInt();
        }
        while(true) {
            if (tree[0] == 1 && tree[1] == 2 && tree[2] == 3 && tree[3] == 4 && tree[4] == 5) {
                break;
            }
            for (int j = 0; j < 4; j++) {
                if (tree[j] > tree[j + 1]) {
                    int k = tree[j];
                    tree[j] = tree[j + 1];
                    tree[j + 1] = k;
                    for (int l = 0; l < 5; l++) {
                        System.out.print(tree[l] + " ");
                    }

                    System.out.println();

                }


            }

        }


    }

}


