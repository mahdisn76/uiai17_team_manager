package panels;

import Objects.Team;

import javax.swing.*;
import java.awt.*;

public class TeamProfilePanel extends JPanel {

    public TeamProfilePanel(Team team) {
        setLayout(new GridLayout(3, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel lblTeamName = new JLabel("Team name: " + team.getTeam_Name());
        JLabel lblTeamMember1 = new JLabel("Member 1: "
                + (team.getMember_names().size() > 0 ? team.getMember_names().get(0) : "-----"));
        JLabel lblTeamMember2 = new JLabel("Member 2: "
                + (team.getMember_names().size() > 1 ? team.getMember_names().get(1) : "-----"));

        add(lblTeamName);
        add(lblTeamMember1);
        add(lblTeamMember2);
    }

}
