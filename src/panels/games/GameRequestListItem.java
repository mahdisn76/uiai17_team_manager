package panels.games;

import objects.Game_Request;

import javax.swing.*;
import java.awt.*;

class GameRequestListItem extends JPanel {

    GameRequestListItem(Game_Request game) {
        setLayout(new BorderLayout());
        JPanel pnlTexts = new JPanel(new GridLayout(2, 1, 5, 5));
        JLabel lblRequester = new JLabel("Sender = ");
        JLabel lblOpponent = new JLabel("Opponent = ");
        pnlTexts.add(lblRequester);
        pnlTexts.add(lblOpponent);
        add(pnlTexts, BorderLayout.CENTER);
        JPanel pnlButtons = new JPanel(new GridLayout(2, 1));
        JButton btnAccept = new JButton("Accept");
        JButton btnReject = new JButton("Reject");
        pnlButtons.add(btnAccept);
        pnlButtons.add(btnReject);
        add(pnlButtons, BorderLayout.EAST);
    }

}
