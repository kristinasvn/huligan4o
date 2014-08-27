/**
 * Created by Тишкаа on 08.07.2014.
 */
public class Main {

    public static void main(String[] args) {
        int length = 0;
        int[] fib = fibbonacci(length);
        for (int element : fib) {
            System.out.println(element);
        }

    }

    static int[] fibbonacci(int n) {
        int[] fib = new int[n];
        if (n == 0) {
            return fib;
        }
        if (n == 1) {
            fib[0] = 0;
            return fib;
        }
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<fib.length; i++) {
            fib[i] = fib[i-2] + fib[i-1];
        }
        return fib;
    }
}
