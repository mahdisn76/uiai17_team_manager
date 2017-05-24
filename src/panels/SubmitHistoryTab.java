package panels;

import Objects.Code;
import Objects.Team;

import javax.swing.*;
import java.awt.*;

class SubmitHistoryTab extends JPanel {

    SubmitHistoryTab(JFrame parent, Team team) {
        setLayout(new BorderLayout());
        JPanel pnlList = new JPanel(new GridLayout(0, 1));

        for (int i=0;i<10;i++)
            pnlList.add(new SubmittedCodeListItem(new Code()));

        JScrollPane jspList = new JScrollPane(pnlList);
        jspList.setPreferredSize(parent.getSize());

        add(jspList, BorderLayout.CENTER);
        parent.setLocationRelativeTo(null);
    }

}
