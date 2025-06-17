import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Admin_open extends JFrame {
    
    static JLabel welcome_1 , main_1 , footer_1;
    static JButton AddUser , RemoveUser, UpdateUser, records;
    static JMenuBar menuBar;
    static JMenu backJMenu, adminJMenu, doctorJMenu, patientJMenu, helpJMenu;

    Admin_open(){
        this.setTitle("Login Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.setLayout(new BorderLayout());
        this.setResizable(false);

        menuBar = new JMenuBar();
        menuBar.setOpaque(true);
        menuBar.setBackground(Color.BLACK);
        menuBar.setForeground(Color.BLUE);

        backJMenu = new JMenu("< Back");
        adminJMenu = new JMenu("Admin");
        doctorJMenu = new JMenu("Doctor");
        patientJMenu = new JMenu("Patient");
        helpJMenu = new JMenu("Help");
        helpJMenu.setBackground(Color.BLACK);

        menuBar.add(backJMenu);
        menuBar.add(adminJMenu);
        menuBar.add(doctorJMenu);
        menuBar.add(patientJMenu);
        menuBar.add(helpJMenu);

        main_1 = new JLabel();
        main_1.setPreferredSize(new Dimension(400, 350));
        main_1.setOpaque(true);
        main_1.setBackground(new Color(72, 58, 160));
        main_1.setForeground(Color.WHITE);

        AddUser = new JButton("Add User");
        AddUser.setBounds(120, 70, 150, 40);
        AddUser.setFont(new Font("Arial", Font.BOLD, 20));
        AddUser.setForeground(new Color(14, 33, 72));
        AddUser.addActionListener(e -> new Add_user());

        RemoveUser = new JButton("Remove User");
        RemoveUser.setBounds(120, 140, 150, 40);
        RemoveUser.setFont(new Font("Arial", Font.BOLD, 20));
        RemoveUser.setForeground(new Color(14, 33, 72));
        RemoveUser.addActionListener(e -> new Remove_User());

        UpdateUser = new JButton("Update User");
        UpdateUser.setBounds(120, 210, 150, 40);
        UpdateUser.setFont(new Font("Arial", Font.BOLD, 20));
        UpdateUser.setForeground(new Color(14, 33, 72));
        // UpdateUser.addActionListener(e -> new updateuser());

        records = new JButton("Records");
        records.setBounds(140, 250, 120, 40);
        records.setFont(new Font("Arial", Font.BOLD, 20));
        records.setForeground(new Color(14, 33, 72));
        records.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new records();
            }
            
        });

        main_1.add(AddUser);
        main_1.add(RemoveUser);
        main_1.add(UpdateUser);
        main_1.add(records);
                
        footer_1 = new JLabel("Click on the one of the button to continue.....");
        footer_1.setOpaque(true);
        footer_1.setBackground(new Color(14, 33, 72));
        footer_1.setForeground(new Color(227, 208, 149));
        footer_1.setFont(new Font("Arial", Font.BOLD, 18));
        footer_1.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.add(menuBar, BorderLayout.NORTH);
        this.add(main_1, BorderLayout.CENTER);
        this.add(footer_1, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
