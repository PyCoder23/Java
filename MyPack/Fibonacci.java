import java.util.Scanner;
import mypack.FibonacciOrNot;

public class Fibonacci{
    public static void main(String[] args){
        FibonacciOrNot myObj = new FibonacciOrNot();

        Scanner me = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = me.nextInt();
        int k = 0;
        for (int i = 2; i < n+1; i++) {
            boolean ab = myObj.check(i);
            if (ab == true){
                if (k == 0){
                    System.out.print("Numbers on Fibonacci series from 1 to "+n+" are : 1 ");
                }
                k++;
                System.out.print(i);
                System.out.print(' ');
            }
        }
        if (k == 0){
            System.out.println("There is no number on Fibonacci series between 1 and "+n+'!');
        } else {
            System.out.println("\nThere are "+(k+1)+" numbers on Fibonacci series between 1 and "+n+'!');
        }
        me.close();
    }
}
