package panels;

import javax.swing.*;

public class CodeUpload extends JPanel {

    public CodeUpload() {
        JLabel lblHelp = new JLabel("Select a zip file containing the client files.");
        JComboBox<String> cbxLanguages = new JComboBox<>();
        cbxLanguages.addItem("C++");
        cbxLanguages.addItem("Java");
        cbxLanguages.addItem("Python");
        JButton btnSelect = new JButton("Select");
        JButton btnUpload = new JButton("Upload");
        JTextField txtPath = new JTextField();
        add(lblHelp);
        add(cbxLanguages);
        add(btnSelect);
        add(btnUpload);
        add(txtPath);
    }

}
