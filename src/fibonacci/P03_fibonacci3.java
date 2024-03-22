package fibonacci;

public class P03_fibonacci3 {
    private static int fibonacci4(int n ){
        int last = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            int oldLast = last;
            last=next;
            next = oldLast+next;

        }return last;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci4(20));
        System.out.println(fibonacci4(19));
        System.out.println(fibonacci4(18));
        System.out.println(fibonacci4(17));
    }
}
