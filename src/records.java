import javax.swing.*;

import java.awt.*;

public class records extends JFrame {

    static JLabel welcome2, section2, footer2;
    static JMenuBar menuBar;
    static JMenu backJMenu, adminJMenu, doctorJMenu, patientJMenu, helpJMenu;

    records(){
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

        section2 = new JLabel();
        section2.setOpaque(true);
        section2.setBackground(new Color(72, 58, 160));
        section2.setForeground(Color.WHITE);



        footer2 = new JLabel("Click on the one of the button to continue");
        footer2.setOpaque(true);
        footer2.setBackground(new Color(14, 33, 72));
        footer2.setForeground(new Color(227, 208, 149));
        footer2.setFont(new Font("Arial", Font.BOLD, 18));
        footer2.setHorizontalAlignment(SwingConstants.CENTER);

        this.add(menuBar, BorderLayout.NORTH);
        this.add(section2, BorderLayout.CENTER);
        this.add(footer2, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
