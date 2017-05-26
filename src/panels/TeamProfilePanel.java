package panels;

import objects.Team;

import javax.swing.*;
import java.awt.*;

public class TeamProfilePanel extends JPanel {

    public TeamProfilePanel(Team team) {
        setLayout(new GridLayout(0, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lblTeamName = new JLabel("Team name: " + team.getName());

        JLabel lblTeamMember1 = new JLabel("Member 1: "
                + (team.getMembers().size() > 0 ? team.getMembers().get(0) : "-----"));

        JLabel lblTeamMember2 = new JLabel("Member 2: "
                + (team.getMembers().size() > 1 ? team.getMembers().get(1) : "-----"));

        JLabel lblSubmits = new JLabel("Number of submits: " + team.getCodes().size());

        JLabel lblPendingRequests = new JLabel("Pending requests: " + team.getPendingCount());
        if (team.getPendingCount() > 0)
            lblPendingRequests.setBackground(Color.GREEN);

        add(lblTeamName);
        add(lblTeamMember1);
        add(lblTeamMember2);
        add(lblSubmits);
        add(lblPendingRequests);
    }

}
