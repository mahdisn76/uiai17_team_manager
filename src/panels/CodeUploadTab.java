package panels;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

class CodeUploadTab extends JPanel {

    private File selectedZip;

    CodeUploadTab(JFrame parent) {
        setLayout(new GridLayout(0, 1, 5, 5));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel lblHelp = new JLabel("Select a zip file containing the client files.");
        JComboBox<String> cbxLanguages = new JComboBox<>();
        cbxLanguages.addItem("C++");
        cbxLanguages.addItem("Java");
        cbxLanguages.addItem("Python");
        JButton btnSelect = new JButton("Select");
        JButton btnUpload = new JButton("Compile & Upload");
        JTextField txtPath = new JTextField(
                selectedZip == null ? "No file selected" : selectedZip.getPath()
        );
        txtPath.setEditable(false);
        add(lblHelp);
        add(txtPath);
        add(btnSelect);
        add(cbxLanguages);
        add(btnUpload);

        btnSelect.addActionListener((ActionEvent e) -> {
            String defaultPath = (selectedZip == null ? getClass().getResource("").getPath() : selectedZip.getPath());
            JFileChooser jfc = new JFileChooser(defaultPath);
            jfc.setFileFilter(new FileNameExtensionFilter("Zip files", "zip"));
            if (jfc.showOpenDialog(this) != JFileChooser.CANCEL_OPTION) {
                selectedZip = jfc.getSelectedFile();
                txtPath.setText(selectedZip.getPath());
            }
        });

        btnUpload.addActionListener((ActionEvent e) -> {
            if (selectedZip == null)
                JOptionPane.showMessageDialog(this,
                        "Please select a file to submit"
                        , "No file selected", JOptionPane.ERROR_MESSAGE);
            else {
                JLabel lblStatus = new JLabel("Compiling");
                JProgressBar progressBar = new JProgressBar();
                progressBar.setIndeterminate(true);
                add(lblStatus);
                add(progressBar);
                parent.pack();
                btnSelect.setEnabled(false);
                btnUpload.setEnabled(false);
                cbxLanguages.setEnabled(false);
            }
        });

    }

}
