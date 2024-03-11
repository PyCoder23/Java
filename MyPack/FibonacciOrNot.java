package mypack;
public class FibonacciOrNot {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x);
    }
    
    public boolean check(int num){
        boolean fib = false;

        int a = 1, b = 1, s = 0;

        while (s < num){
            s = a + b;
            a = b;
            b = s;

            if (s==num | num == 1) {
                fib = true;
                break;
            }
        }

        return fib;
    }

}
