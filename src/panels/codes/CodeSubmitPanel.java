package panels.codes;

import objects.Team;

import javax.swing.*;

public class CodeSubmitPanel extends JTabbedPane {

    public CodeSubmitPanel(JFrame parent, Team team) {
        add("Upload", new CodeUploadTab(parent));
        add("Submit History", new SubmitHistoryTab(parent, team));
    }

}
