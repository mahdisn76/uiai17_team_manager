package panels;

import Objects.Team;

import javax.swing.*;

public class GamesPanel extends JTabbedPane {

    public GamesPanel(Team team) {
        add("Request game", new RequestGameTab(team.getSelected_code()));
    }

}
