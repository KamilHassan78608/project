import java.awt.*;

import javax.swing.*;

public class Remove_User extends JFrame {
    static JLabel headlogin, section1, footLabel, id1, name1, password1;
    static JTextArea id1Area, name1Area;
    static JPasswordField password1Area;
    static JComboBox<String> comboBox1;
    static JButton loginButton;
    static JMenuBar menuBar;
    static JMenu backJMenu, adminJMenu, doctorJMenu, patientJMenu, helpJMenu;

    Remove_User() {

        this.setTitle("Remove User");
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

        section1 = new JLabel();
        section1.setLayout(new GridBagLayout());
        section1.setOpaque(true);
        section1.setBackground(new Color(72, 58, 160));
        section1.setForeground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        gbc.gridx = 1;
        gbc.gridy = 0;
        comboBox1 = new JComboBox<>(new String[] { "Doctor", "Patient" });
        comboBox1.setPreferredSize(new Dimension(200, 50));
        section1.add(comboBox1, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        id1 = new JLabel("User ID:");
        id1.setFont(new Font("Arial", Font.BOLD, 24));
        section1.add(id1, gbc);
        gbc.gridx = 1;
        id1Area = new JTextArea();
        id1Area.setPreferredSize(new Dimension(200, 30));
        id1Area.setMaximumSize(new Dimension(200, Short.MAX_VALUE));
        id1Area.setMinimumSize(new Dimension(200, 30));
        id1Area.setFont(new Font("Arial", Font.BOLD, 24));

        section1.add(id1Area, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        name1 = new JLabel("Name: ");
        name1.setFont(new Font("Arial", Font.BOLD, 24));
        section1.add(name1, gbc);
        gbc.gridx = 1;
        name1Area = new JTextArea();
        name1Area.setPreferredSize(new Dimension(200, 30));
        name1Area.setMaximumSize(new Dimension(200, Short.MAX_VALUE));
        name1Area.setMinimumSize(new Dimension(200, 30));
        name1Area.setColumns(4);
        name1Area.setFont(new Font("Arial", Font.BOLD, 24));
        section1.add(name1Area, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        password1 = new JLabel("Password: ");
        password1.setFont(new Font("Arial", Font.BOLD, 24));
        section1.add(password1, gbc);
        gbc.gridx = 1;
        password1Area = new JPasswordField();
        password1Area.setPreferredSize(new Dimension(200, 30));
        password1Area.setMaximumSize(new Dimension(200, Short.MAX_VALUE));
        password1Area.setMinimumSize(new Dimension(200, 30));
        password1Area.setFont(new Font("Arial", Font.BOLD, 24));
        section1.add(password1Area, gbc);

        gbc.gridx = 1;
        gbc.gridy++;
        loginButton = new JButton("Delete");
        loginButton.setFont(new Font("impact", Font.BOLD, 20));
        loginButton.setPreferredSize(new Dimension(120, 40));
        section1.add(loginButton, gbc);


        footLabel = new JLabel("Click on the Delete button to Delete User");
        footLabel.setOpaque(true);
        footLabel.setBackground(new Color(14, 33, 72));
        footLabel.setForeground(new Color(227, 208, 149));
        footLabel.setFont(new Font("Arial", Font.BOLD, 18));
        footLabel.setHorizontalAlignment(SwingConstants.CENTER);

        this.add(menuBar, BorderLayout.NORTH);
        this.add(section1, BorderLayout.CENTER);
        this.add(footLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
