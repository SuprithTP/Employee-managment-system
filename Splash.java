
package employee.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
    
    Splash() {
        
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(70, 10, 1200, 50);
        heading.setFont(new Font("serif", Font.BOLD, 60));
        heading.setForeground(Color.LIGHT_GRAY);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/employee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,8, 1200, 700);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE");
        clickhere.setBounds(450, 520, 300, 70);
        clickhere.setBackground(Color.GRAY);
        clickhere.setForeground(Color.BLACK);
        clickhere.setFont(new Font("serif", Font.PLAIN, 30));
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        
        setSize(1200, 650);
        setLocation(200, 50);
        setVisible(true);
        
        while(true) {
            clickhere.setVisible(false);
            try {
                Thread.sleep(300);
            } catch (Exception e){
                
            }
            
            clickhere.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}