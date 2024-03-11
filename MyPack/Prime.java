import java.util.Scanner;
import mypac.PrimeOrNot;

public class Prime{
    public static void main(String[] args){
        PrimeOrNot myObj = new PrimeOrNot();

        Scanner me = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = me.nextInt();
        int k = 0;
        for (int i = 2; i < n+1; i++) {
            boolean ab = myObj.check(i);
            if (ab == true){
                if (k == 0){
                    System.out.print("Prime numbers from 1 to "+n+" are : ");
                }
                k++;
                System.out.print(i);
                System.out.print(' ');
            }
        }
        if (k == 0){
            System.out.println("There is no prime number between 1 and "+n+'!');
        } else {
            System.out.println("\nThere are "+k+" prime numbers between 1 and "+n+'!');
        }
        me.close();
    }
}
