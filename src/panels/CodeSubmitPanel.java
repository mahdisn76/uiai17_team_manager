package panels;

import javax.swing.*;

public class CodeSubmitPanel extends JTabbedPane {

    public CodeSubmitPanel(JFrame parent) {
        add("Upload", new CodeUploadTab(parent));
        add("Submit History", new SubmitHistoryTab());
    }

}
