package fibonacci;

import java.util.stream.IntStream;

public class P04_fibonacci4 {
    private int last = 0, next = 1;
    public IntStream stream(){
        return IntStream.generate(()->{
            int oldLast = last;
            last=next;
            next=oldLast+next;
            return oldLast;
        });
    }

    public static void main(String[] args) {
        P04_fibonacci4 fibonacci4 = new P04_fibonacci4();
        fibonacci4.stream().limit(41).forEachOrdered(System.out::println);
    }
}
