package panels;

import Objects.Team;
import consts.LoginInfo;
import frames.TeamManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;

public class LoginPanel extends JPanel {

    private JTextField txtTeamName;
    private JPasswordField txtPassword;

    public LoginPanel(JFrame parent, String username, String password) {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JPanel pnlLogin = new JPanel(new GridLayout(3, 1, 10, 10));
        JPanel pnlTeamName = new JPanel(new BorderLayout(10, 10));
        JPanel pnlPassword = new JPanel(new BorderLayout(10, 10));
        JPanel pnlButtons = new JPanel(new GridLayout(1, 2, 10, 10));
        JLabel lblTeamName = new JLabel("Team name:");
        JLabel lblPassword = new JLabel("   Password:");
        JButton btnLogin = new JButton("Sign in");
        JButton btnSignUp = new JButton("Sign up");
        txtTeamName = new JTextField(username, 10);
        txtTeamName.setHorizontalAlignment(JTextField.CENTER);
        txtTeamName.requestFocus();
        txtPassword = new JPasswordField(password, 10);
        txtPassword.setHorizontalAlignment(JTextField.CENTER);
        txtPassword.setEchoChar('*');
        pnlTeamName.add(lblTeamName, BorderLayout.WEST);
        pnlTeamName.add(txtTeamName, BorderLayout.CENTER);
        pnlPassword.add(lblPassword, BorderLayout.WEST);
        pnlPassword.add(txtPassword, BorderLayout.CENTER);
        pnlButtons.add(btnLogin);
        pnlButtons.add(btnSignUp);
        pnlLogin.add(pnlTeamName);
        pnlLogin.add(pnlPassword);
        pnlLogin.add(pnlButtons);
        parent.getRootPane().setDefaultButton(btnLogin);
        add(pnlLogin);

        btnLogin.addActionListener((ActionEvent e) -> {
            // TODO: 2017-05-24 Write login
            LoginInfo.username = txtTeamName.getText();
            LoginInfo.password = new String(txtPassword.getPassword());

            new TeamManagement(new Team());
            parent.setVisible(false);
        });

        btnSignUp.addActionListener((ActionEvent e) -> {
            Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    URL website = new URL("http://uiai2017.ir/");
                    desktop.browse(website.toURI());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

    }

}
