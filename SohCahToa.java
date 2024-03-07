import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class SohCahToa{

    static JLabel lab;
    static JLabel title;
    static JLabel out;
    static JButton btn;
    static JTextField ent;

    public static void main(String[] args) {
        JFrame root = new JFrame("Soh Cah Toa!");
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.getContentPane().setBackground(Color.CYAN);

        root.setLocationRelativeTo(null);
        root.setLayout(null);
        root.setVisible(false);
        root.setResizable(false);
                

        title = new JLabel("Sin Cos Tan!", JLabel.CENTER);
        title.setBounds(129, 5, 126, 40);
        title.setForeground(Color.BLUE);
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
        root.add(title);
        
        lab = new JLabel("Please enter angle!", JLabel.CENTER);
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
                    if (!(Character.isDigit(n.charAt(i)) | n.charAt(i) == '.')){
                        run = false;
                    }
                }

                if (!run) {
                    System.out.println("Invalid Input!");
                    out.setText("Invalid Input!");
                    JOptionPane.showMessageDialog(root, "Invalid Input! Please enter a numerical value!");
                } else if (Float.parseFloat(n)>90){
                    System.out.println("Invalid Input!");
                    out.setText("Invalid Input!");
                    JOptionPane.showMessageDialog(root, "Invalid Input! Please enter an numerical value < 90!");
                } 

                if (run){
                    double an1 = Float.parseFloat(n);
                    double sin = 0, cos = 0, tan = 0, rad = 0;
                    
                    if (an1 != 90) {
                        rad = Math.toRadians(an1);

                        sin = Math.sin(rad);
                        cos = Math.cos(rad);
                        tan = Math.tan(rad);
                        
                        DecimalFormat df = new DecimalFormat("#.###");

                        out.setText("Sin -> "+df.format(sin)+"! Cos -> "+df.format(cos)+"! Tan -> "+df.format(tan)+"!");    
                        System.out.println("Angle -> "+an1+"!\nSin -> "+sin+"!\nCos -> "+cos+"!\nTan -> "+tan+"!\n");   
                    }   
                    else {
                        out.setText("Sin -> 1! Cos -> 0! Tan -> Inf!");    
                        System.out.println("Angle -> 90!\nSin -> 1!\nCos -> 0!\nTan -> Infinity!\n");  
                    }
                }
            }
        }
    );   

        root.add(btn);

        out = new JLabel("", JLabel.CENTER);
        out.setBounds(15, 170, 356, 40);
        out.setBackground(Color.CYAN);
        out.setForeground(Color.BLUE);
        out.setFont(new Font("Comic Sans MS", Font.BOLD, 16));

        root.setSize(400, 240);
        root.add(out);
        root.setVisible(true);
    }
}