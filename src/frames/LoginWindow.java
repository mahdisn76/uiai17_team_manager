package frames;

import panels.LoginPanel;

import javax.swing.*;

public class LoginWindow extends JFrame {

    public LoginWindow() {
        setTitle("UIAI2017 TeamManager");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel pnlLogin = new LoginPanel();
        add(pnlLogin);
        pack();
        setResizable(false);
        setVisible(true);
    }

}
