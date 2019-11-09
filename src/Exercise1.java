import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<1||n>100){
            throw new InputMismatchException();
        }
        if((n>5&&n%4==0)||(n>5&&n%8==0)||(n>5&&n%6==0)){
            int t=n/8;
            for (; t >=0 ;t--) {
                int s=(n-t*8)%6;
                if(s==0){
                    System.out.println(t+(n-t*8)/6);
                    break;
                }
            }
        }else
        System.out.println(-1);
    }
}
