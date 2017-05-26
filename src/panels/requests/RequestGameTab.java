package panels.requests;

import objects.Code;
import objects.Team;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class RequestGameTab extends JPanel {

    RequestGameTab(Team myTeam) {
        setLayout(new BorderLayout(5, 5));
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        Code c = myTeam.getSelectedCode();
        JPanel pnlTexts = new JPanel(new GridLayout(0, 1));
        JLabel lblCodeStatus = new JLabel("Your code:");
        JLabel lblCodeName = new JLabel(c != null ? c.toString() : "No code selected");
        JLabel lblCodeLang = new JLabel(c != null ? c.toString() : "No code selected");
        pnlTexts.add(lblCodeStatus);
        pnlTexts.add(lblCodeName);
        pnlTexts.add(lblCodeLang);
        add(pnlTexts, BorderLayout.NORTH);

        JLabel lblStatus = new JLabel("Getting available teams from server...");
        add(lblStatus);
        String[] teamNames = getTeams();
        remove(lblStatus);
        JList<String> teams = new JList<>(teamNames);
        if (c == null)
            teams.setEnabled(false);
        teams.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        teams.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2)
                    requestGame(teams.getSelectedValue());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        add(teams, BorderLayout.CENTER);

        JButton btnRequest = new JButton("Send Request");
        if (c == null)
            btnRequest.setEnabled(false);
        btnRequest.addActionListener((ActionEvent e) -> {
            requestGame(teams.getSelectedValue());
        });
        add(btnRequest, BorderLayout.SOUTH);
    }

    private void requestGame(String opp) {
        // TODO: 2017-05-24 Requesting games
        System.out.println(opp);
    }

    private String[] getTeams() {
        // TODO: 2017-05-24 Get teams list from server
        String[] names = new String[10];
        for (int i = 0; i < 10; i++)
            names[i] = "Team" + (i + 1);
        return names;
    }

}
