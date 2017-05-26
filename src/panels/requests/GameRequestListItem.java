package panels.requests;

import consts.GameRequestStatus;
import objects.GameRequest;
import objects.Team;

import javax.swing.*;
import java.awt.*;

class GameRequestListItem extends JPanel {

    GameRequestListItem(Team myTeam, GameRequest req) {
        setLayout(new BorderLayout());

        JPanel pnlTexts = new JPanel(new GridLayout(2, 1, 5, 5));
        JLabel lblReqName = new JLabel("Sender = " + req.getSenderTeam());
        JLabel lblOpponent = new JLabel("Receiver = " + req.getSenderTeam());
        pnlTexts.add(lblReqName);
        pnlTexts.add(lblOpponent);
        add(pnlTexts, BorderLayout.CENTER);

        JPanel pnlRight = new JPanel(new GridLayout(0, 1));
        if (req.getStatus() == GameRequestStatus.PENDING && myTeam.getName().equals(req.getRecieverTeam())) {
            JButton btnAccept = new JButton("Accept");
            JButton btnReject = new JButton("Reject");
            pnlRight.add(btnAccept);
            pnlRight.add(btnReject);
        } else if (req.getStatus() == GameRequestStatus.PENDING) {
            JLabel lblStatus = new JLabel("Waiting for opponent");
            JLabel lblView = new JLabel("View in games tab");
            pnlRight.add(lblStatus);
            pnlRight.add(lblView);
        } else if (req.getStatus() == GameRequestStatus.ACCEPTED) {
            JLabel lblStatus = new JLabel("ACCEPTED!");
            JLabel lblView = new JLabel("View in games tab");
            pnlRight.add(lblStatus);
            pnlRight.add(lblView);
        } else if (req.getStatus() == GameRequestStatus.REJECTED) {
            JLabel lblStatus = new JLabel("REJECTED!");
            JLabel lblView = new JLabel("View in games tab");
            pnlRight.add(lblStatus);
            pnlRight.add(lblView);
        }
        add(pnlRight, BorderLayout.EAST);
    }

}
