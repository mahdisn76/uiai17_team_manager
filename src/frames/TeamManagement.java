package frames;

import consts.LoginInfo;
import panels.CodeSubmitPanel;
import panels.GamesPanel;
import panels.TeamProfilePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TeamManagement extends JFrame {

    private JPanel pnlButtons, pnlTeamProfile, pnlGames;
    private JTabbedPane tbpCodeSubmit;

    public TeamManagement() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createButtons();
        pnlTeamProfile = new TeamProfilePanel();
        tbpCodeSubmit = new CodeSubmitPanel(this);
        pnlGames = new GamesPanel();
        setPanel(pnlTeamProfile);


        setTitle("UIAI2017 Team Management");
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createButtons() {
        JPanel pnlButtons = new JPanel();
        JButton btnTeamProfile = new JButton("Profile");
        JButton btnSubmitCode = new JButton("Submit code");
        JButton btnGames = new JButton("Games");
        JButton btnSignOut = new JButton("Sign out");
        pnlButtons.add(btnTeamProfile);
        pnlButtons.add(btnSubmitCode);
        pnlButtons.add(btnGames);
        pnlButtons.add(btnSignOut);

        btnSubmitCode.addActionListener((ActionEvent e) -> {
            setPanel(tbpCodeSubmit);
        });

        btnTeamProfile.addActionListener((ActionEvent e) -> {
            setPanel(pnlTeamProfile);
        });

        btnGames.addActionListener((ActionEvent e) -> {
            setPanel(pnlGames);
        });

        btnSignOut.addActionListener((ActionEvent e) -> {
            new LoginWindow(LoginInfo.username, LoginInfo.password);
            dispose();
        });

        this.pnlButtons = pnlButtons;
    }

    private void setPanel(Component pnl) {
        getContentPane().removeAll();
        add(pnlButtons, BorderLayout.NORTH);
        add(pnl, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        validate();
    }

}
