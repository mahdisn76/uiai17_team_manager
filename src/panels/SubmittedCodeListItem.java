package panels;

import Objects.Code;

import javax.swing.*;
import java.awt.*;

class SubmittedCodeListItem extends JPanel {

    SubmittedCodeListItem(Code c) {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        JLabel lblName = new JLabel(c.toString());
        JPanel pnlButtons = new JPanel(new GridLayout(2, 1));
        JButton btnSetFinal = new JButton("Set as final");
        JButton btnDownload = new JButton("Download code");
        pnlButtons.add(btnSetFinal);
        pnlButtons.add(btnDownload);
        add(lblName, BorderLayout.CENTER);
        add(pnlButtons, BorderLayout.EAST);
    }

}
