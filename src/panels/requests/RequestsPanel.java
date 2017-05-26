package panels.requests;

import objects.Team;

import javax.swing.*;

public class RequestsPanel extends JTabbedPane {

    public RequestsPanel(JFrame parent, Team team) {
        add("Request game", new RequestGameTab(team));
        add("Sent", new SentRequestsTab(parent, team));
        add("Received", new ReceivedRequestsTab(parent, team));
    }

}
