package com.tcd.cs7is1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class UserInterfaceModel extends JFrame {
    public UserInterfaceModel() throws HeadlessException {
        super();
        //Initialize obj of Query class
        //Take Questions
        buildApplicationWindow();
    }

    private void buildApplicationWindow() {
        int windowWidth = 800;
        int windowHeight = 600;
        int margin = 20;

        this.setTitle("Ontology Based Java Application : group F");
        this.getContentPane().setLayout(null);
        this.setBounds(100, 100, windowWidth, windowHeight);
        this.setResizable(false);

        String[] questions = new String[0];
        final JList questionList;
        questionList = new JList(questions);
        questionList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        questionList.setVisibleRowCount(0);
        questionList.setSelectedIndex(0);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(questionList);
        scrollPane.setBounds(margin, margin, windowWidth - margin * 4 - 100, 200);

        JButton executeButton = new JButton();
        executeButton.setText("Get Result");
        executeButton.setBounds(670, 100, 100, 50);

        final JTextArea resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        JScrollPane resultPane = new JScrollPane();
        resultPane.setViewportView(resultTextArea);
        resultPane.setBounds(margin, 200 + margin * 2, windowWidth - margin * 2, windowHeight - 200 - margin * 4);

        executeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                resultTextArea.setText("Hello!! This is result Place");
            }
        });


        this.add(scrollPane);
        this.add(executeButton);
        this.add(resultPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(false);
    }

    public void lunchApplication() {
        this.setVisible(true);
    }
}
