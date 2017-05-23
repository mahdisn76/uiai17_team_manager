package frames;

import panels.CodeUpload;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TeamManagement extends JFrame {

    private JPanel pnlButtons;

    public TeamManagement() {
        setLayout(new BorderLayout());
        pnlButtons = createButtons();
        add(pnlButtons, BorderLayout.NORTH);
        add(new CodeUpload(), BorderLayout.CENTER);
        setTitle("UIAI2017 Team Management");
        pack();
        setVisible(true);
    }

    private JPanel createButtons() {
        JPanel pnlButtons = new JPanel();
        JButton btnTeamProfile = new JButton("Profile");
        JButton btnSubmitCode = new JButton("Submit code");
        JButton btnGames = new JButton("Games");
        JButton btnSignOut = new JButton("Sign out");
        pnlButtons.add(btnTeamProfile);
        pnlButtons.add(btnSubmitCode);
        pnlButtons.add(btnGames);
        pnlButtons.add(btnSignOut);

        JPanel pnlCodeUpload = new CodeUpload();

        btnSubmitCode.addActionListener((ActionEvent e) -> {
            setPanel(pnlCodeUpload);
        });

        return pnlButtons;
    }

    private void setPanel(JPanel pnl) {
        getContentPane().removeAll();
        add(pnlButtons, BorderLayout.NORTH);
        add(pnl, BorderLayout.CENTER);
        validate();
    }

}
