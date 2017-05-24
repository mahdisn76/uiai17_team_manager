package panels;

import javax.swing.*;
import java.awt.*;

public class TeamProfilePanel extends JPanel {

    public TeamProfilePanel() {
        setLayout(new GridLayout(3, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel lblTeamName = new JLabel("Team name:");
        JLabel lblTeamMember1 = new JLabel("Member 1:");
        JLabel lblTeamMember2 = new JLabel("Member 2:");

        add(lblTeamName);
        add(lblTeamMember1);
        add(lblTeamMember2);
    }

}
