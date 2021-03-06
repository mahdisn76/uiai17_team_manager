package panels.requests;

import objects.GameRequest;
import objects.Team;
import panels.requests.GameRequestListItem;

import javax.swing.*;
import java.awt.*;

class ReceivedRequestsTab extends JPanel {

    ReceivedRequestsTab(JFrame parent, Team t) {
        setPreferredSize(parent.getSize());
        setLayout(new BorderLayout());
        JPanel pnlRequests = new JPanel(new GridLayout(0, 1, 10, 10));
        pnlRequests.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        for (GameRequest req : t.getReceivedRequests())
            pnlRequests.add(new GameRequestListItem(t, req));

        JScrollPane jsp = new JScrollPane(pnlRequests);
        add(jsp);
    }

}
