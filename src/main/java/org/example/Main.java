package org.example;

import org.example.forms.MainForm;

public class Main {
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainForm field = new MainForm();
                field.setLocation(400, 200);
                field.setVisible(true);
            }
        });
    }
}