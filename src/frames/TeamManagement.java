package frames;

import objects.Team;
import consts.LoginInfo;
import panels.codes.CodeSubmitPanel;
import panels.games.GamesPanel;
import panels.TeamProfilePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TeamManagement extends JFrame {

    private JPanel pnlButtons, pnlTeamProfile;
    private JTabbedPane tbpCodeSubmit, tbpGames;
    private Team team;

    public TeamManagement(Team team) {
        this.team = team;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createButtons();
        pnlTeamProfile = new TeamProfilePanel(team);
        tbpCodeSubmit = new CodeSubmitPanel(this, team);
        tbpGames = new GamesPanel(this, team);
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
            setPanel(tbpGames);
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
