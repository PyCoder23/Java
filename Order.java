import java.util.Scanner;
import java.util.ArrayList; 

public class Order {
    public static void main(String[] args) {

        Scanner me = new Scanner(System.in);
        System.out.println("Welcome to my Ordering system!");

        System.out.print("Please enter your name : ");
        final String nam = me.nextLine();

        System.out.print(nam+", Please enter your mobile number : ");
        final String mob = me.nextLine();
        
        String[] a = {"Soap", "Pen", "Towel", "Laptop", "Watch"};
        int[] b = {50, 70, 130, 2000, 900};

        ArrayList<String> des = new ArrayList<String>();
        ArrayList<Integer> pri = new ArrayList<Integer>();
        ArrayList<Integer> qua = new ArrayList<Integer>();

        String op = "y";

        while (op.equals("y")){
            z = 0;
            xyz = 0;
            its += 1;
            System.out.println("\nWhat do you want to order from:\n");

            for (int i = 0; i < a.length; i++){
                String x = a[i];
                int y = b[i];  

                System.out.println(x + " of Worth $" + y);
            }

            System.out.print("\nPlease enter the name of the desired Item: ");
            String it = me.nextLine();
            
            while (xyz == 0){
                for (int i = 0; i < a.length; i++) {
                    if (a[i].toLowerCase().equals(it.toLowerCase())){
                        z = i;
                        xyz = 1;
                        break;
                    }
                }

                if (xyz == 0){
                    System.out.print("\n"+xyz+"\nInvalid Name!\nPlease enter the name of the desired Item: ");
                    it = me.nextLine();
                } else {
                    System.out.print("\nHow many "+it+"(s) do you want to order? ");
                    int q = me.nextInt();

                    des.add(it);
                    pri.add((int)b[z]*q);
                    qua.add(q);

                    //System.out.println(des);
                    //System.out.println(pri);
                    //System.out.println(qua);

                    total = total + ((int)b[z]*q);
                    //System.out.println(total);


                    do {
                        System.out.println();
                        me.nextLine();
                        System.out.print("Do you want to order anything else? ");
                        String k = me.nextLine();
                        op = k;
                        if (op.toLowerCase().equals("yes") | op.toLowerCase().equals("y") | op.toLowerCase().equals("ya") | op.toLowerCase().equals("oui")){
                            op = "y";
                        } else if (op.toLowerCase().equals("no") | op.toLowerCase().equals("n") | op.toLowerCase().equals("non")) {
                            op = "n";
                            System.out.println("\nCustomer details : ");
                            System.out.println("Name : "+nam);
                            System.out.println("Mobile : "+mob);

                            System.out.println("\nOrder details : \n");

                            String ob;
                            int pr, qu;
                            for (int i = 0; i < des.size(); i++){
                                ob = des.get(i);
                                pr = pri.get(i);
                                qu = qua.get(i);

                                System.out.println("Item : "+ob);
                                System.out.println("Cost : "+((int)pr/qu));
                                System.out.println("Quantity : "+qu);
                                System.out.println("Price : "+pr);
                                System.out.println("Price after GST : "+pr*108/100);
                                System.out.println();
                            }

                            System.out.println("Items : "+its);
                            System.out.println("SubTotal : "+total);
                            System.out.println("GST : "+(total*18/100));
                            System.out.println("Total : "+(total*118/100));

                            System.out.println("\nThanks for shopping!");
                            System.out.println("Please visit again!");
                        } else{
                            System.out.println("Invalid Input!");
                        }
                    }
                    while ((!op.toLowerCase().equals("y")) && (!op.toLowerCase().equals("n")));
                }
            }
        }
        me.close();
    }
    public static int z = 0;
    public static int xyz = 0;
    public static int total = 0;
    public static int its = 0;
}
