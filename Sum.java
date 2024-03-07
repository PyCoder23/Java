import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.*;

public class Sum{

    static JLabel lab;
    static JLabel title;
    static JLabel out;
    static JButton btn;
    static JTextField ent;
    public static void main(String[] args) {
        JFrame root = new JFrame("Digit Sum!");
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.getContentPane().setBackground(Color.CYAN);

        root.setLocationRelativeTo(null);
        root.setLayout(null);
        root.setVisible(false);
        root.setResizable(false);
                

        title = new JLabel("Digit Sum!", JLabel.CENTER);
        title.setBounds(129, 5, 126, 40);
        title.setForeground(Color.BLUE);
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
        root.add(title);
        
        lab = new JLabel("Please enter number!", JLabel.CENTER);
        lab.setBounds(107, 40, 170, 40);
        lab.setForeground(Color.BLUE);
        lab.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        root.add(lab);

        ent = new JTextField(10);
        ent.setBounds(107, 87, 170, 25);
        ent.setForeground(Color.BLUE);
        ent.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        root.add(ent);
        
        btn = new JButton("Submit");
        btn.setBounds(144, 130, 96, 40);
        btn.setBackground(Color.BLUE);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                root.setSize(400, 260);
                String n = ent.getText();
                boolean run = true;

                if (n.length() >= 100000000){
                    run = false;
                } 
                else {
                    for (int i = 0; i < n.length(); i++){
                        if (!Character.isDigit(n.charAt(i))){
                            run = false;
                            JOptionPane.showMessageDialog(root, "Invalid Input! Please enter an integar value!");
                        } 
                    }
                }

                if (!run) {
                    out.setText("Invalid Input!");
                } else {
                    //System.out.println("No error");
                } 

                if (run){
                    //Long num = Long.parseLong(n);
                    BigInteger numB = new BigInteger(n);
                    //BigInteger ten = new BigInteger("10");
                    //int power = 1000000;

                    long sum1 = 0;
                    BigInteger Super1;

                    BigInteger k = new BigInteger("2");
                    BigInteger l = new BigInteger("1");
                    BigInteger Super;
                    BigInteger Super2 = numB.add(l);
                    
                    Super1 = numB.multiply(Super2);
                    Super = Super1.divide(k);

                    //System.out.println(Super1);
                    //System.out.println(Super2);

                    System.out.println("Super Sum of "+numB+" is "+Super);
                    out.setText("Super Sum of "+numB+" is "+Super);
                } 
            }
         });   

        root.add(btn);

        out = new JLabel("", JLabel.CENTER);
        out.setBounds(3, 170, 380, 40);
        out.setBackground(Color.CYAN);
        out.setForeground(Color.BLUE);
        out.setFont(new Font("Comic Sans MS", Font.BOLD, 16));

        root.setSize(400, 240);
        root.add(out);
        root.setVisible(true);
    }
}
