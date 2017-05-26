package panels.codes;

import objects.Code;
import objects.Team;

import javax.swing.*;
import java.awt.*;

class SubmitHistoryTab extends JPanel {

    SubmitHistoryTab(JFrame parent, Team team) {
        setLayout(new BorderLayout());
        JPanel pnlList = new JPanel(new GridLayout(0, 1));

        for (Code c : team.getCodes())
            add(new SubmittedCodeListItem(c));

        JScrollPane jspList = new JScrollPane(pnlList);
        jspList.setPreferredSize(parent.getSize());

        add(jspList, BorderLayout.CENTER);
        parent.setLocationRelativeTo(null);
    }

}
