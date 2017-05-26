package panels.games;

import objects.Game;
import objects.Team;

import javax.swing.*;
import java.awt.*;

class GameListItem extends JPanel {

    GameListItem(Team t, Game g) {
        setLayout(new BorderLayout());
        JPanel pnlTeamNames = new JPanel(new GridLayout(2, 1, 5, 5));
        pnlTeamNames.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlTeamNames.setBackground(t.getName().equals(g.getWinnerName()) ? Color.GREEN : Color.RED);
        JLabel lblTeam1 = new JLabel(g.getTeam1Name());
        JLabel lblTeam2 = new JLabel(g.getTeam2Name());
        JButton btnViewGame = new JButton("View");
        pnlTeamNames.add(lblTeam1);
        pnlTeamNames.add(lblTeam2);
        add(pnlTeamNames, BorderLayout.CENTER);
        add(btnViewGame, BorderLayout.EAST);
    }

}
