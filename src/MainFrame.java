import frames.LoginWindow;

import javax.swing.*;

public class MainFrame {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        new LoginWindow("", "");
    }

}
