package fibonacci;

public class P01_fibonacci1 {
    public static int fibonacci1(int n){
        return fibonacci1(n-1)+fibonacci1(n-2);
    }
    public static int fibonacci2(int n){
        if (n<2)
            return n;
        return fibonacci2(n-1)+fibonacci2(n-2);
    }

    public static void main(String[] args) {
      //  System.out.println(fibonacci1(5));  java.lang.StackOverflowError
        System.out.println(fibonacci2(5));  //  5
        System.out.println(fibonacci2(10)); // 55
        System.out.println(fibonacci2(4));  //  3
        System.out.println(fibonacci2(1));  //  1
    }
}
