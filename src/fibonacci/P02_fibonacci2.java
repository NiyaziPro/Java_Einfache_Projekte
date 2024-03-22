package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class P02_fibonacci2 {
    static Map<Integer,Integer>memo = new HashMap<>(Map.of(0,0,1,1));
    private static int fibonacci3(int n){
        if (memo.containsKey(n)) { // Memoisationsschritt
            memo.put(n, fibonacci3(n - 1) + fibonacci3(n - 2));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci3(5));
        System.out.println(fibonacci3(20));
    }
}
