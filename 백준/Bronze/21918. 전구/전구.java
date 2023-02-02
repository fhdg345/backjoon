import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //전구 개수 입력
        int m = sc.nextInt(); //명령어 개수 입력
        int bulb[] = new int[n];
        int q;
        for(int i = 0; i < bulb.length; i++){
            do {
                q = sc.nextInt();
                bulb[i] = q;
            }while (q > 1 || q < 0);
        }

        for (int j = 0; j < m; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==1)
                bulb[b-1]= c;
            else if (a==2) {
                for (int k = b-1; k <c ; k++) {
                    if(bulb[k]==0)
                        bulb[k]=1;
                    else bulb[k]=0;
                }
            }
            if(a==3){
                for (int l = b-1; l <c ; l++) {
                    if(bulb[l] != 0)
                    bulb[l]=0;
                }
            }
            if(a==4){
                for (int o = b-1; o <c ; o++) {
                    if (bulb[o] != 1)
                    bulb[o]=1;

                }
            }


        }
        for (int p = 0; p <n ; p++) {
            System.out.print(bulb[p]+" ");
        }

    }

}



