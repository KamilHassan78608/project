import java.awt.*;
import javax.swing.*;

public class doctorlogin extends JFrame{

    static JLabel headlogin, main, footer;
    static JButton view, changepass;
    static JMenuBar menuBar;
    static JMenu backJMenu, adminJMenu, doctorJMenu, patientJMenu, helpJMenu;

    doctorlogin(){

        this.setTitle("Doctor Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

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

        main = new JLabel();
        main.setPreferredSize(new Dimension(400, 350));
        main.setOpaque(true);
        main.setBackground(new Color(72, 58, 160));
        main.setForeground(Color.WHITE);

        view = new JButton("View");
        view.setBounds(100, 113, 200, 40);
        view.setFont(new Font("Arial", Font.BOLD, 20));
        view.setForeground(new Color(14, 33, 72));

        changepass = new JButton("Change Password");
        changepass.setBounds(100, 226, 200, 40);
        changepass.setFont(new Font("Arial", Font.BOLD, 20));
        changepass.setForeground(new Color(14, 33, 72));

        main.add(view);
        main.add(changepass);

        footer = new JLabel("Click on the one of the button to continue");
        footer.setOpaque(true);
        footer.setBackground(new Color(14, 33, 72));
        footer.setForeground(new Color(227, 208, 149));
        footer.setFont(new Font("Arial", Font.BOLD, 18));
        footer.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.add(menuBar, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);
        this.add(footer, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
