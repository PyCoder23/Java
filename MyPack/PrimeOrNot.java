package mypac;
public class PrimeOrNot {
  public static void main(String[] args) {
    int x = 0;
    System.out.println(x);
  }
  public boolean check(int num){
    boolean pri = true;
    for (int j = 2; j<num; j++){
        if (num%j == 0){
            pri = false;
        }
    }
    return pri;
  }
}
