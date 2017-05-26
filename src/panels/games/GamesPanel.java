package panels.games;

import objects.Game;
import objects.Team;

import javax.swing.*;
import java.awt.*;

public class GamesPanel extends JPanel {

    public GamesPanel(JFrame parent, Team t) {
        setLayout(new BorderLayout());
        setPreferredSize(parent.getSize());

        JPanel pnlGames = new JPanel(new GridLayout(0, 1, 5, 5));

        for (Game g : t.getGames())
            pnlGames.add(new GameListItem(t, g));

        JScrollPane jsp = new JScrollPane(pnlGames);
        add(jsp);
    }

}
