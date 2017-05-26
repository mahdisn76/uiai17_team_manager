package frames;

import consts.LoginInfo;
import objects.Team;
import panels.TeamProfilePanel;
import panels.codes.CodeSubmitPanel;
import panels.games.GamesPanel;
import panels.requests.RequestsPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TeamManagement extends JFrame {

    private JPanel pnlButtons, pnlTeamProfile, pnlGames;
    private JTabbedPane pnlCodeSubmit, pnlRequests;
    private Team team;

    public TeamManagement(Team team) {
        this.team = team;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createButtons();
        pnlTeamProfile = new TeamProfilePanel(team);
        pack();
        setPanel(pnlTeamProfile);
        pnlCodeSubmit = new CodeSubmitPanel(this, team);
        pnlGames = new GamesPanel(this, team);
        pnlRequests = new RequestsPanel(this, team);

        setTitle("UIAI2017 Team Management");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void createButtons() {
        JPanel pnlButtons = new JPanel();
        JButton btnTeamProfile = new JButton("Profile");
        JButton btnSubmitCode = new JButton("Submit code");
        JButton btnRequests = new JButton("Requests");
        JButton btnGames = new JButton("Games");
        JButton btnSignOut = new JButton("Sign out");
        pnlButtons.add(btnTeamProfile);
        pnlButtons.add(btnSubmitCode);
        pnlButtons.add(btnRequests);
        pnlButtons.add(btnGames);
        pnlButtons.add(btnSignOut);

        btnSubmitCode.addActionListener((ActionEvent e) -> {
            setPanel(pnlCodeSubmit);
        });

        btnTeamProfile.addActionListener((ActionEvent e) -> {
            setPanel(pnlTeamProfile);
        });

        btnRequests.addActionListener((ActionEvent e) -> {
            setPanel(pnlRequests);
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
