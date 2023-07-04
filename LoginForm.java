package com.mycompany.loginform;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoginForm implements ActionListener {

    static JFrame jt = new JFrame("Login App");// Creating a frame with a title
    static JPanel panel = new JPanel();
    static JButton btn = new JButton("Login");
    static JLabel nameLabel = new JLabel("Enter Username:");
    static JLabel passwordLabel = new JLabel("Enter Password:");
    static JLabel unsuccessfull = new JLabel();
    static JLabel successfull = new JLabel();
    static JLabel lbl = new JLabel();
    static JTextField name = new JTextField();
    static JTextField pass = new JPasswordField();
    
 public void navigate() {
    JFrame nextFrame = new JFrame("ZenLounge");
    JPanel nextPanel = new JPanel();
    nextFrame.setContentPane(nextPanel);
    nextFrame.setSize(400, 300);

    JLabel welcomeLabel = new JLabel("Welcome to the ZenLounge!");
    welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 18));
    nextPanel.add(welcomeLabel);

    nextFrame.setVisible(true);
    jt.dispose();
    }


    public static void main(String[] args) {

        jt.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //terminate frame on close
        jt.setSize(400, 300); //setting size
        jt.setLayout(null); //terminating default flow layout
        jt.setVisible(true); // to display frame

        btn.setBounds(250, 200, 95, 30);

        jt.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    String user = name.getText();
                    String password = pass.getText();

                    if (user.equals("Shalia") && password.equals("Shalia")) {

//                        JOptionPane.showMessageDialog(null, "Successful Login");
                    LoginForm loginForm = new LoginForm();
                    loginForm.navigate();                     


                    } else {

                    JOptionPane.showMessageDialog(jt ,"Login Unsuccessful", "Incorrect" , JOptionPane.WARNING_MESSAGE );
                    lbl.setText("Enter correct credentials");

                    }

                }

            }
        });
        
        
        

        nameLabel.setBounds(20, 40, 150, 60);
        nameLabel.setFont((new Font("Arial", Font.PLAIN, 18)));
        jt.add(nameLabel);

        passwordLabel.setBounds(20, 80, 150, 60);
        passwordLabel.setFont((new Font("Arial", Font.PLAIN, 18)));
        jt.add(passwordLabel);

        lbl.setBounds(20, 120, 200, 60);
        lbl.setFont((new Font("Arial", Font.PLAIN, 14)));
        jt.add(lbl);

        name.setBounds(170, 60, 150, 30);
        jt.add(name);

        pass.setBounds(170, 100, 150, 30);
        jt.add(pass);

        successfull.setBounds(10, 140, 300, 25);
        jt.add(successfull);

        unsuccessfull.setBounds(10, 140, 300, 25);
        jt.add(unsuccessfull);
        panel.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //doesn't clear message if retry
    }

}
