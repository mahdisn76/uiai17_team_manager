package frames;

import consts.LoginInfo;
import panels.LoginPanel;

import javax.swing.*;

public class LoginWindow extends JFrame {

    public LoginWindow(String username, String password) {
        setTitle("UIAI2017 TeamManager");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel pnlLogin = new LoginPanel(this, username, password);
        add(pnlLogin);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        LoginInfo.username = username;
        LoginInfo.password = password;
    }

}
