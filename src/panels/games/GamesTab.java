package panels.games;

import javax.swing.*;
import java.awt.*;

class GamesTab extends JPanel {

    GamesTab(JFrame parent) {
        setPreferredSize(parent.getSize());
        setLayout(new BorderLayout());
        JPanel pnlGames = new JPanel(new GridLayout(0, 1, 5, 5));
        for (int i = 0; i < 10; i++)
            pnlGames.add(new GameListItem(null));
        JScrollPane jsp = new JScrollPane(pnlGames);
        add(jsp);
    }

}
