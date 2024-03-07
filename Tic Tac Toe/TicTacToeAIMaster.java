import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class TicTacToeAIMaster {
    static JFrame root;
    static JLabel title;
    static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    static String TokenC = "", TokenU = "";
    static String hi = "", ci = "", winT = "", winP = "";
    static int stat = 1, com = 0,  mom = 0;
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
                    System.out.println("Available Moves -> "+mov+"\n");
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
                JOptionPane.showMessageDialog(root, "Game Over! Oh No! Computer Won && you lost!");
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

    public static String Ai(){
        //AI Defensive Algorithms
        //Rows
        //ABC 
        if (movU.contains("A") && movU.contains("B") && mov.contains("C")){
            ci = "C";
        }
        else if (movU.contains("A") && movU.contains("C") && mov.contains("B")){
            ci = "B";
        }
        else if (movU.contains("B") && movU.contains("C") && mov.contains("A")){
            ci = "A";
        }

        //DEF
        else if (movU.contains("D") && movU.contains("E") && mov.contains("F")){
            ci = "F";
            System.out.println("Hi");
        }
        else if (movU.contains("D") && movU.contains("F") && mov.contains("E")){
            ci = "E";
        }
        else if (movU.contains("E") && movU.contains("F") && mov.contains("D")){
            ci = "D";
        }

        //GHI
        else if (movU.contains("G") && movU.contains("H") && mov.contains("I")){
            ci = "I";
        }
        else if (movU.contains("G") && movU.contains("I") && mov.contains("H")){
            ci = "H";
        }
        else if (movU.contains("H") && movU.contains("I") && mov.contains("G")){
            ci = "G";
        }


        //Columns
        //ADG 
        else if (movU.contains("A") && movU.contains("D") && mov.contains("G")){
            ci = "G";
        }
        else if (movU.contains("A") && movU.contains("G") && mov.contains("D")){
            ci = "D";
        }
        else if (movU.contains("D") && movU.contains("G") && mov.contains("A")){
            ci = "A";
        }

        //BEH
        else if (movU.contains("B") && movU.contains("E") && mov.contains("H")){
            ci = "H";
        }
        else if (movU.contains("B") && movU.contains("H") && mov.contains("E")){
            ci = "E";
        }
        else if (movU.contains("E") && movU.contains("H") && mov.contains("B")){
            ci = "B";
        }

        //CFI
        else if (movU.contains("C") && movU.contains("F") && mov.contains("I")){
            ci = "I";
        }
        else if (movU.contains("C") && movU.contains("I") && mov.contains("F")){
            ci = "F";
        }
        else if (movU.contains("F") && movU.contains("I") && mov.contains("C")){
            ci = "C";
        }


        //Diagonals
        //AEI 
        else if (movU.contains("A") && movU.contains("E") && mov.contains("I")){
            ci = "I";
        }
        else if (movU.contains("A") && movU.contains("I") && mov.contains("E")){
            ci = "E";
        }
        else if (movU.contains("E") && movU.contains("I") && mov.contains("A")){
            ci = "A";
        }

        //CEG
        else if (movU.contains("C") && movU.contains("E") && mov.contains("G")){
            ci = "G";
        }
        else if (movU.contains("C") && movU.contains("G") && mov.contains("E")){
            ci = "E";
        }
        else if (movU.contains("E") && movU.contains("G") && mov.contains("C")){
            ci = "C";
        }

        //AI Attacking Algorithms
        //Rows
        //ABC 
        if (movC.contains("A") && movC.contains("B") && mov.contains("C")){
            ci = "C";
        }
        else if (movC.contains("A") && movC.contains("C") && mov.contains("B")){
            ci = "B";
        }
        else if (movC.contains("B") && movC.contains("C") && mov.contains("A")){
            ci = "A";
        }

        //DEF
        else if (movC.contains("D") && movC.contains("E") && mov.contains("F")){
            ci = "F";
        }
        else if (movC.contains("D") && movC.contains("F") && mov.contains("E")){
            ci = "E";
        }
        else if (movC.contains("E") && movC.contains("F") && mov.contains("D")){
            ci = "D";
            System.out.println("GCom -> "+ci);
        }

        //GHI
        else if (movC.contains("G") && movC.contains("H") && mov.contains("I")){
            ci = "I";
        }
        else if (movC.contains("G") && movC.contains("I") && mov.contains("H")){
            ci = "H";
        }
        else if (movC.contains("H") && movC.contains("I") && mov.contains("G")){
            ci = "G";
        }


        //Columns
        //ADG 
        else if (movC.contains("A") && movC.contains("D") && mov.contains("G")){
            ci = "G";
        }
        else if (movC.contains("A") && movC.contains("G") && mov.contains("D")){
            ci = "D";
        }
        else if (movC.contains("D") && movC.contains("G") && mov.contains("A")){
            ci = "A";
        }

        //BEH
        else if (movC.contains("B") && movC.contains("E") && mov.contains("H")){
            ci = "H";
        }
        else if (movC.contains("B") && movC.contains("H") && mov.contains("E")){
            ci = "E";
        }
        else if (movC.contains("E") && movC.contains("H") && mov.contains("B")){
            ci = "B";
        }

        //CFI
        else if (movC.contains("C") && movC.contains("F") && mov.contains("I")){
            ci = "I";
        }
        else if (movC.contains("C") && movC.contains("I") && mov.contains("F")){
            ci = "F";
        }
        else if (movC.contains("F") && movC.contains("I") && mov.contains("C")){
            ci = "C";
        }


        //Diagonals
        //AEI 
        else if (movC.contains("A") && movC.contains("E") && mov.contains("I")){
            ci = "I";
        }
        else if (movC.contains("A") && movC.contains("I") && mov.contains("E")){
            ci = "E";
        }
        else if (movC.contains("E") && movC.contains("I") && mov.contains("A")){
            ci = "A";
        }

        //CEG
        else if (movC.contains("C") && movC.contains("E") && mov.contains("G")){
            ci = "G";
        }
        else if (movC.contains("C") && movC.contains("G") && mov.contains("E")){
            ci = "E";
        }
        else if (movC.contains("E") && movC.contains("G") && mov.contains("C")){
            ci = "C";
        }
        
        else if (mov.contains("E")){
            ci = "E";
        }

        else {
            //System.out.println("Bye");
            if (mov.contains("E")){
                ci = "E";
            }
            Random ran = new Random();
            com = ran.nextInt(mov.size());
            ci = mov.get(com);

            while ((!mov.contains(ci) || com % 2 == 0) && mov.size() == 8){
                com = ran.nextInt(mov.size());
                ci = mov.get(com);
            }

            while ((!mov.contains(ci) || com % 2 == 1) && mov.size() < 8){
                com = ran.nextInt(mov.size());
                ci = mov.get(com);
            }

            //Ghar bachao Algorithms which run when computer is 'X'!
            mom = ran.nextInt(mov.size());
            ci = mov.get(mom);
            int i = 0;
            while (true){
                mom = ran.nextInt(mov.size());
                ci = mov.get(mom);

                char bi = ci.charAt(0);
                com = ((int)bi)-64;

                System.out.println("Com -> "+com);
                /* System.out.println(movU.contains((char)(com + 64 + 1)));
                System.out.println(((char)(com + 1 + 64))); */

                if (com % 2 == 0 && mov.size() != 8){
                    //B, H
                    if ((com == 2 || com == 8) && !movU.contains(String.valueOf((char)(com + 64 + 1))) && !movU.contains(String.valueOf((char)(com + 64 - 1)))){
                        break;
                    }
                    
                    //D, F
                    else if((com == 4 || com == 6) && !movU.contains(String.valueOf((char)(com + 64 + 3))) && !movU.contains(String.valueOf((char)(com + 64 - 3)))){
                        break;
                    }

                    else{
                        i += 1;
                        if (i == 15){
                            break;
                        }
                    }
                }

                else if (com % 2 == 1){
                    //A, C
                    if ((com == 1 || com == 3) && !movC.contains(String.valueOf((char)(com + 64 + 3))) && !movC.contains(String.valueOf((char)(com + 64 + 6)))){
                        break;
                    }
                    
                    //C, I
                    else if ((com == 3 || com == 9) && !movC.contains(String.valueOf((char)(com + 64 - 1))) && !movC.contains(String.valueOf((char)(com + 64 - 2)))){
                        break;
                    }
                    
                    //G, I
                    else if ((com == 9 || com == 7) && !movC.contains(String.valueOf((char)(com + 64 - 3))) && !movC.contains(String.valueOf((char)(com + 64 - 6)))){
                        break;
                    }
                    
                    //A, G
                    else if ((com == 7 || com == 1) && !movC.contains(String.valueOf((char)(com + 64 + 1))) && !movC.contains(String.valueOf((char)(com + 64 + 2)))){
                        break;
                    }
                    
                    //AEI
                    else if (com == 1 && !movU.contains("E") && !movU.contains("I")){
                        break;
                    }
                    
                    //CEG
                    else if (com == 3 && !movU.contains("E") && !movU.contains("G")){
                        break;
                    }
                    
                    //GEC
                    else if (com == 7 && !movU.contains("E") && !movU.contains("C")){
                        break;
                    }
                    
                    //IEA
                    else if (com == 9 && !movU.contains("E") && !movU.contains("A")){
                        break;
                    }

                    else{
                        i += 1;
                        if (i == 15){ 
                            break;
                        }
                    }

                }
            }
            
            if (mov.contains("E")) {
                com = 5;
            }

            if (movU.contains("A") && movU.contains("F") && mov.size() == 6){
                com = 2;
            }

            if (movU.contains("A") && movU.contains("H") && mov.size() == 6){
                com = 4;
            }

            if (movU.contains("A") && movU.contains("H") && mov.size() == 6){
                com = 4;
            }

            if ((movU.contains("B") && movU.contains("F") && !movC.contains("A") && !movC.contains("I") && mov.contains("C")) || (movU.contains("B") && movU.contains("I") && !movC.contains("A") && !movC.contains("F") && mov.contains("C")) || (movU.contains("A") && movU.contains("F") && !movC.contains("B") && !movC.contains("I") && mov.contains("C"))){
                com = 3;
            }

            if ((movU.contains("F") && movU.contains("H") && !movC.contains("G") && !movC.contains("C") && mov.contains("I")) || (movU.contains("F") && movU.contains("G") && !movC.contains("H") && !movC.contains("C") && mov.contains("I")) || (movU.contains("C") && movU.contains("H") && !movC.contains("G") && !movC.contains("F") && mov.contains("I"))){
                com = 9;
            }

            if ((movU.contains("H") && movU.contains("A") && !movC.contains("I") && !movC.contains("D") && mov.contains("G")) || (movU.contains("H") && movU.contains("D") && !movC.contains("I") && !movC.contains("A") && mov.contains("G")) || (movU.contains("I") && movU.contains("D") && !movC.contains("H") && !movC.contains("A") && mov.contains("G"))){
                com = 7;
            }   

            if ((movU.contains("D") && movU.contains("B") && !movC.contains("C") && !movC.contains("G") && mov.contains("A")) || (movU.contains("D") && movU.contains("C") && !movC.contains("B") && !movC.contains("G") && mov.contains("A")) || (movU.contains("G") && movU.contains("B") && !movC.contains("C") && !movC.contains("D") && mov.contains("A"))){
                com = 1; 
            }

            if (movU.contains("A") && movU.contains("I")){
                int[] m1 = {2, 6}; 

                Random ran1 = new Random();
                com = m1[ran1.nextInt(m1.length)];  ;
            }

            if (movU.contains("C") && movU.contains("G")){
                int[] m2 = {2, 4}; 

                Random ran2 = new Random();
                com = m2[ran2.nextInt(m2.length)];  ;
            }

            ci = String.valueOf((char)(com + 64));
        }
        return ci;
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

                ci = Ai();

                movC.add(String.valueOf(ci));

                int in = mov.indexOf(ci);
                mov.remove(in);

                System.out.println("Computer's move -> "+ci);
                System.out.println("Available moves -> "+mov+"\n");

                if (ci.equals("A")){
                    btn1.setBackground(Color.BLACK);
                    btn1.setText(TokenC);
                } 
                else if (ci.equals("B")){
                    btn2.setBackground(Color.BLACK);
                    btn2.setText(TokenC);
                } 
                else if (ci.equals("C")){
                    btn3.setBackground(Color.BLACK);
                    btn3.setText(TokenC);
                } 
                else if (ci.equals("D")){
                    btn4.setBackground(Color.BLACK);
                    btn4.setText(TokenC);
                } 
                else if (ci.equals("E")){
                    btn5.setBackground(Color.BLACK);
                    btn5.setText(TokenC);
                    
                } 
                else if (ci.equals("F")){
                    btn6.setBackground(Color.BLACK);
                    btn6.setText(TokenC);
                } 
                else if (ci.equals("G")){
                    btn7.setBackground(Color.BLACK);
                    btn7.setText(TokenC);
                } 
                else if (ci.equals("H")){
                    btn8.setBackground(Color.BLACK);
                    btn8.setText(TokenC);
                } 
                else if (ci.equals("I")){
                    btn9.setBackground(Color.BLACK);
                    btn9.setText(TokenC);
                }
                else {
                    System.out.println("Bug");
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
        System.out.println("Welcome to Tic Tac Toe!\nWe hope you enjoy the game!\nAnd get rid of stress && tension for a moment!\n");

        int choice = JOptionPane.showConfirmDialog(root, "Do you want to play as X?");
        if (choice == JOptionPane.YES_OPTION){
            TokenU = "X";
            TokenC = "O";
            JOptionPane.showMessageDialog(root, "You are playing as 'X' && Computer is 'O'!");

        } else {
            TokenU = "O";
            TokenC = "X";
            JOptionPane.showMessageDialog(root, "You are playing as 'O' && Computer is 'X'!");
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
        
        root = new JFrame("Tic Tac Toe Strong AI");
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
