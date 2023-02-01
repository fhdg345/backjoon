//구글링 해서 문제 풀었으므로 !다시 풀기!
//charAt 검색 후 공부하기 
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();

        int cnt=0;
        for(int i=0;i<H;i++) {
            String input=sc.next();
            for(int j=0;j<W;j++) {
                if(input.charAt(j)=='.'&&cnt==0) {
                    System.out.print(-1+" ");
                }
                else if(input.charAt(j)=='c') {
                    System.out.print(0+" ");
                    cnt=1;
                }
                else if(input.charAt(j)=='.'&& cnt!=0) {
                    System.out.print(cnt+" ");
                    cnt++;
                }
            }
            System.out.println();
            cnt=0;
        }
    }
}
 
