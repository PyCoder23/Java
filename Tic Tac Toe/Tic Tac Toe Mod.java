import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class TicTacToeMod {
    static JFrame root;
    static JLabel title;
    static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    static String TokenC = "", TokenU = "";
    static String hi = "", ci = "", winT = "", winP = "";
    static int stat = 1, com = 0;
    static boolean cur = true;

    static ArrayList<String> mov = new ArrayList<String>();
    static ArrayList<String> movU = new ArrayList<String>();
    static ArrayList<String> movC = new ArrayList<String>();


    public static void press(){
        if (stat == 1){
            cur = true;
            System.out.println("You pressed -> "+hi);

            if (mov.contains(hi)){
                mov.remove(hi);
                movU.add(hi);
                System.out.println("Your move -> "+hi);

                if (mov.size() != 0){
                    System.out.println("Available Moves -> "+mov);
                }
                else{
                    System.out.println("No move left!");
                }

                check();

                if (cur){
                    mob();
                }
                
                System.out.println();


            } 
            else {
                System.out.println("Move already chosen!");
                
                if (mov.size() != 0){
                    System.out.println("Try Moving From -> "+mov);
                }
                else{
                    System.out.println("No move left!");
                }

                System.out.println();
            }
        }
    } 

    public static void check(){
        if (stat == 1){
            // User win check
            for (int i = 0; i < movU.size(); i++){
                for (int j = 0; j < movU.size(); j++){
                    for (int k = 0; k < movU.size(); k++){
                        String a = movU.get(i);
                        String b = movU.get(j);
                        String c = movU.get(k);

                        if (a == "A" && b == "B" && c == "C"){
                            winT = TokenU;
                            winP = "U";
                        }
                        if (a == "D" && b == "E" && c == "F"){
                            winT = TokenU;
                            winP = "U";
                        }
                        if (a == "G" && b == "H" && c == "I"){
                            winT = TokenU;
                            winP = "U";
                        }

                        if (a == "A" && b == "D" && c == "G"){
                            winT = TokenU;
                            winP = "U";
                        }
                        if (a == "B" && b == "E" && c == "H"){
                            winT = TokenU;
                            winP = "U";
                        }
                        
                        if (a == "C" && b == "F" && c == "I"){
                            winT = TokenU;
                            winP = "U";
                        }

                        if (a == "A" && b == "E" && c == "I"){
                            winT = TokenU;
                            winP = "U";
                        }
                        if (a == "C" && b == "E" && c == "G"){
                            winT = TokenU;
                            winP = "U";
                        }
                    }
                }
            }

            // Comp win check
            for (int i = 0; i < movC.size(); i++){
                for (int j = 0; j < movC.size(); j++){
                    for (int k = 0; k < movC.size(); k++){
                        String a = movC.get(i);
                        String b = movC.get(j);
                        String c = movC.get(k);

                        if (a == "A" && b == "B" && c == "C"){
                            winT = TokenC;
                            winP = "C";
                        }
                        if (a == "D" && b == "E" && c == "F"){
                            winT = TokenC;
                            winP = "C";
                        }
                        if (a == "G" && b == "H" && c == "I"){
                            winT = TokenC;
                            winP = "C";
                        }

                        if (a == "A" && b == "D" && c == "G"){
                            winT = TokenC;
                            winP = "C";
                        }
                        if (a == "B" && b == "E" && c == "H"){
                            winT = TokenC;
                            winP = "C";
                        }
                        
                        if (a == "C" && b == "F" && c == "I"){
                            winT = TokenC;
                            winP = "C";
                        }

                        if (a == "A" && b == "E" && c == "I"){
                            winT = TokenC;
                            winP = "C";
                        }
                        if (a == "C" && b == "E" && c == "G"){
                            winT = TokenC;
                            winP = "C";
                        }
                    }
                }
            }

            if (winP == "C"){
                System.out.println(winT+" Wins!\nYou Lost! Don't Worry!\nTry again!\n");
                JOptionPane.showMessageDialog(root, "Game Over! Oh No! Computer Won and you lost!");
                stat = 0;
                cur = false;
                exit();
                
            } else if (winP == "U"){
                System.out.println(winT+" Wins!\nCongratulations! You won!\n");
                JOptionPane.showMessageDialog(root, "Game Over! Congratulations! You Won!");
                stat = 0;
                cur = false;
                exit();
            }
        }
    }

    public static void mob(){
        if (mov.size() == 0){
            exit();
        }
        else {
            if (stat == 1){
                Random ran = new Random();
                com = ran.nextInt(mov.size());
                ci = mov.get(com);

                movC.add(ci);
                mov.remove(com);

                System.out.println("Computer's move -> "+ci);
                System.out.println("Available moves -> "+mov+"\n");

                if (ci == "A"){
                    btn1.setBackground(Color.BLACK);
                    btn1.setText(TokenC);
                } 
                else if (ci == "B"){
                    btn2.setBackground(Color.BLACK);
                    btn2.setText(TokenC);
                } 
                else if (ci == "C"){
                    btn3.setBackground(Color.BLACK);
                    btn3.setText(TokenC);
                } 
                else if (ci == "D"){
                    btn4.setBackground(Color.BLACK);
                    btn4.setText(TokenC);
                } 
                else if (ci == "E"){
                    btn5.setBackground(Color.BLACK);
                    btn5.setText(TokenC);
                    
                } 
                else if (ci == "F"){
                    btn6.setBackground(Color.BLACK);
                    btn6.setText(TokenC);
                } 
                else if (ci == "G"){
                    btn7.setBackground(Color.BLACK);
                    btn7.setText(TokenC);
                } 
                else if (ci == "H"){
                    btn8.setBackground(Color.BLACK);
                    btn8.setText(TokenC);
                } 
                else if (ci == "I"){
                    btn9.setBackground(Color.BLACK);
                    btn9.setText(TokenC);
                }

                check();
            }
        }
    }

    public static void exit() {
        if (winP == ""){
            System.out.println("Game Over!\n");
            JOptionPane.showMessageDialog(root, "Game Over! Match resulted in Draw! Ha ha ha!");
        }
        res();
    }

    public static void res() {     
        int choice = JOptionPane.showConfirmDialog(root, "Do you want to play again?");
        if (choice == JOptionPane.YES_OPTION){
            movC.clear();
            movU.clear();
            mov.clear();

            mov.add("A");
            mov.add("B");
            mov.add("C");
            mov.add("D");
            mov.add("E");
            mov.add("F");
            mov.add("G");
            mov.add("H");
            mov.add("I");

            winT = "";
            winP = "";

            btn1.setBackground(Color.BLUE);
            btn1.setText("A");

            btn2.setBackground(Color.BLUE);
            btn2.setText("B");

            btn3.setBackground(Color.BLUE);
            btn3.setText("C");
            
            btn4.setBackground(Color.BLUE);
            btn4.setText("D");

            btn5.setBackground(Color.BLUE);
            btn5.setText("E");

            btn6.setBackground(Color.BLUE);
            btn6.setText("F");

            btn7.setBackground(Color.BLUE);
            btn7.setText("G");

            btn8.setBackground(Color.BLUE);
            btn8.setText("H");

            btn9.setBackground(Color.BLUE);
            btn9.setText("I");

            stat = 1;
            System.out.println();
            start();
        }
        else {
            fin();
        }
    }

    public static void fin() {
        JOptionPane.showMessageDialog(root, "Bye! Thanks for playing! Please play again soon!");
        root.dispose();
        System.exit(1);
    }

    public static void start(){
        System.out.println("Welcome to Tic Tac Toe!\nWe hope you enjoy the game!\nAnd get rid of stress and tension for a moment!\n");

        int choice = JOptionPane.showConfirmDialog(root, "Do you want to play as X?");
        if (choice == JOptionPane.YES_OPTION){
            TokenU = "X";
            TokenC = "O";
            JOptionPane.showMessageDialog(root, "You are playing as 'X' and Computer is 'O'!");

        } else {
            TokenU = "O";
            TokenC = "X";
            JOptionPane.showMessageDialog(root, "You are playing as 'O' and Computer is 'X'!");
        }
    }

    public static void main(String[] args) {
        mov.add("A");
        mov.add("B");
        mov.add("C");
        mov.add("D");
        mov.add("E");
        mov.add("F");
        mov.add("G");
        mov.add("H");
        mov.add("I");
        
        root = new JFrame("Tic Tac Toe Mod");
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.getContentPane().setBackground(Color.CYAN);
        root.setLocationRelativeTo(null);
        root.setLayout(null);

        root.setResizable(false);
        root.setVisible(false);
        

        title = new JLabel("Tic Tac toe", JLabel.CENTER);
        title.setBounds(17, 15, 300, 50);
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 52));
        title.setForeground(Color.BLUE);
        root.add(title);


        btn1 = new JButton("A");
        btn1.setBounds(24, 90, 86, 80);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.BLUE);
        btn1.setFont(new Font("Comic Sans MS", Font.BOLD, 21));

        btn1.setFocusable(false);
        btn1.setRolloverEnabled(false);
        root.add(btn1);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hi = "A";
                btn1.setBackground(Color.BLACK);
                if (mov.contains(hi)){
                    btn1.setText(TokenU);
                }
                press();
            }
        }); 


        btn2 = new JButton("B");
        btn2.setBounds(124, 90, 86, 80);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.BLUE);
        btn2.setFont(new Font("Comic Sans MS", Font.BOLD, 21));

        btn2.setFocusable(false);
        btn2.setRolloverEnabled(false);
        root.add(btn2);

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hi = "B";
                btn2.setBackground(Color.BLACK);
                if (mov.contains(hi)){
                    btn2.setText(TokenU);
                }
                press();
            }
        }); 


        btn3 = new JButton("C");
        btn3.setBounds(224, 90, 86, 80);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.BLUE);
        btn3.setFont(new Font("Comic Sans MS", Font.BOLD, 21));

        btn3.setFocusable(false);
        btn3.setRolloverEnabled(false);
        root.add(btn3);
        
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hi = "C";
                btn3.setBackground(Color.BLACK);
                if (mov.contains(hi)){
                    btn3.setText(TokenU);
                }
                press();
            }
        }); 


        btn4 = new JButton("D");
        btn4.setBounds(24, 185, 86, 80);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.BLUE);
        btn4.setFont(new Font("Comic Sans MS", Font.BOLD, 21));

        btn4.setFocusable(false);
        btn4.setRolloverEnabled(false);
        root.add(btn4);
        
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hi = "D";
                btn4.setBackground(Color.BLACK);
                if (mov.contains(hi)){
                    btn4.setText(TokenU);
                }
                press();
            }
        }); 


        btn5 = new JButton("E");
        btn5.setBounds(124, 185, 86, 80);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.BLUE);
        btn5.setFont(new Font("Comic Sans MS", Font.BOLD, 21));

        btn5.setFocusable(false);
        btn5.setRolloverEnabled(false);
        root.add(btn5);
        
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hi = "E";
                btn5.setBackground(Color.BLACK);
                if (mov.contains(hi)){
                    btn5.setText(TokenU);
                }
                press();
            }
        }); 


        btn6 = new JButton("F");
        btn6.setBounds(224, 185, 86, 80);
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.BLUE);
        btn6.setFont(new Font("Comic Sans MS", Font.BOLD, 21));

        btn6.setFocusable(false);
        btn6.setRolloverEnabled(false);
        root.add(btn6);
        
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hi = "F";
                btn6.setBackground(Color.BLACK);
                if (mov.contains(hi)){
                    btn6.setText(TokenU);
                }
                press();
            }
        }); 

        
        btn7 = new JButton("G");
        btn7.setBounds(24, 280, 86, 80);
        btn7.setForeground(Color.WHITE);
        btn7.setBackground(Color.BLUE);
        btn7.setFont(new Font("Comic Sans MS", Font.BOLD, 21));

        btn7.setFocusable(false);
        btn7.setRolloverEnabled(false);
        root.add(btn7);
        
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hi = "G";
                btn7.setBackground(Color.BLACK);
                if (mov.contains(hi)){
                    btn7.setText(TokenU);
                }
                press();
            }
        }); 


        btn8 = new JButton("H");
        btn8.setBounds(124, 280, 86, 80);
        btn8.setForeground(Color.WHITE);
        btn8.setBackground(Color.BLUE);
        btn8.setFont(new Font("Comic Sans MS", Font.BOLD, 21));

        btn8.setFocusable(false);
        btn8.setRolloverEnabled(false);
        root.add(btn8);
        
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hi = "H";
                btn8.setBackground(Color.BLACK);
                if (mov.contains(hi)){
                    btn8.setText(TokenU);
                }
                press();
            }
        }); 


        btn9 = new JButton("I");
        btn9.setBounds(224, 280, 86, 80);
        btn9.setForeground(Color.WHITE);
        btn9.setBackground(Color.BLUE);
        btn9.setFont(new Font("Comic Sans MS", Font.BOLD, 21));

        btn9.setFocusable(false);
        btn9.setRolloverEnabled(false);
        root.add(btn9);
        
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hi = "I";
                btn9.setBackground(Color.BLACK);
                if (mov.contains(hi)){
                    btn9.setText(TokenU);
                }
                press();
            }
        }); 


        root.setSize(350, 430);
        root.setVisible(true);
        
        start();
    }
}
