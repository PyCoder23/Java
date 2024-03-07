import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MySwing{

    static JLabel lab;
    static JLabel title;
    static JLabel out;
    static JButton btn;
    static JTextField ent;
    public static void main(String[] args) {
        JFrame root = new JFrame("Even or Odd!");
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.getContentPane().setBackground(Color.CYAN);

        root.setLocationRelativeTo(null);
        root.setLayout(null);
        root.setVisible(false);
        root.setResizable(false);
                

        title = new JLabel("Even or Odd!", JLabel.CENTER);
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

                for (int i = 0; i < n.length(); i++){
                    if (!Character.isDigit(n.charAt(i))){
                        run = false;
                    }
                }

                if (!run) {
                    out.setText("Invalid Input!");
                    JOptionPane.showMessageDialog(root, "Invalid Input! Please enter an integar value!");
                } else {
                    //System.out.println("No error");
                } 

                if (run){
                    int num = Integer.parseInt(n);
                    String evo = "Odd";
                    if (num % 2 == 0){
                        evo = "Even";
                    }
                    out.setText(n + " is "+evo);                 
                } 
            }
         });   

        root.add(btn);

        out = new JLabel("", JLabel.CENTER);
        out.setBounds(135, 170, 116, 40);
        out.setBackground(Color.CYAN);
        out.setForeground(Color.BLUE);
        out.setFont(new Font("Comic Sans MS", Font.BOLD, 16));

        root.setSize(400, 240);
        root.add(out);
        root.setVisible(true);
    }
}
