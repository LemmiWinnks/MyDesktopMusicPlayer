package com.fileExplorer;

import com.playMusic.PlayMusic;

import javax.swing.*;
import javax.accessibility.Accessible;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileExplorer extends JComponent implements Accessible {
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("wav", "wav");
    private JFileChooser file = new JFileChooser();

    public FileExplorer() {
        file.setFileFilter(filter);
    }

    public String getFile() {
        int validateFile = file.showOpenDialog(this);
        if (validateFile == JFileChooser.APPROVE_OPTION) {
            return file.getSelectedFile().getAbsolutePath();
        }
        return "";
    }
}