import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        Map<Integer,Character>map=new HashMap<>();
        Map<Integer,Character>map1=new HashMap<>();
        for (int i = 0; i <b.length(); i++) {
            map.put(i,b.charAt(i));
        }
        for (int i = 0; i <a.length() ; i++) {
            if(!map.containsValue(a.charAt(i))){
               map1.put(i,a.charAt(i));
               System.out.print(map1.get(i));
            }
        }

/*        String []c=a.split("");
        String []d=b.split("");
        int size=c.length;
        System.out.println(size);
        for (int i = 0; i <d.length; i++) {

            for (int j = 0; j <c.length ; j++) {
                if(d[i].equals(c[j])){
                    int p=j;
                    while(p<size-1){
                        c[p]=c[p+1];
                        p++;
                    }
                    if((j+1)!=c.length&d[i].equals(c[j+1]))
                        System.out.println(j);
                        j--;
                    System.out.println(j);
                    size--;

                    //System.out.println(size);
                }
            }
        }
        for (int i = 0; i <size ; i++) {
            System.out.print(c[i]);
        }
    }
    */
    }
}
