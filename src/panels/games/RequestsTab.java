package panels.games;

import objects.Team;

import javax.swing.*;
import java.awt.*;

class RequestsTab extends JPanel {

    RequestsTab(JFrame parent, Team t) {
        setPreferredSize(parent.getSize());
        setLayout(new BorderLayout());
        JPanel pnlRequests = new JPanel(new GridLayout(0, 1, 10, 10));
        pnlRequests.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        for (int i = 0; i < 10; i++)
            pnlRequests.add(new GameRequestListItem(null));
        JScrollPane jsp = new JScrollPane(pnlRequests);
        add(jsp);
    }

}
