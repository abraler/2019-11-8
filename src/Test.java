public class Test {
    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
    }
    public static int getValue() {
        int i = 1;
        try {
            i = 4;
        } finally{
            System.out.println("sndsdnewj");
            i=i++;
            return i;
        }
    }

}
