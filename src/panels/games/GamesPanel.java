package panels.games;

import objects.Team;

import javax.swing.*;

public class GamesPanel extends JTabbedPane {

    public GamesPanel(JFrame parent, Team team) {
        add("Request game", new RequestGameTab(team.getSelected_code()));
        add("Requests", new RequestsTab(parent, team));
        add("Games played", new GamesTab(parent));
    }

}
