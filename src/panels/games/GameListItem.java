package panels.games;

import objects.Game;

import javax.swing.*;
import java.awt.*;

public class GameListItem extends JPanel {

    GameListItem(Game g) {
        setLayout(new BorderLayout());
        JPanel pnlTeamNames = new JPanel(new GridLayout(2, 1,5,5));
        pnlTeamNames.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        pnlTeamNames.setBackground(Color.GREEN);
        setBackground(Color.GREEN);
        JLabel lblTeam1 = new JLabel("Team1");
        JLabel lblTeam2 = new JLabel("Team2");
        JButton btnViewGame = new JButton("View");
        pnlTeamNames.add(lblTeam1);
        pnlTeamNames.add(lblTeam2);
        add(pnlTeamNames, BorderLayout.CENTER);
        add(btnViewGame, BorderLayout.EAST);
    }

}
