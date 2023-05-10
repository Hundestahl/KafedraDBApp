package org.example.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginForm extends JFrame{
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton enterButton;
    private JButton resetButton;
    private JPanel rootPanel;

    public LoginForm() {
        super("Вход в систему");
        setLocation(400, 300);

        JMenuBar menuBar = new JMenuBar();
//        menuBar.add(new MainMenu.createSpravkaMenu());
//        menuBar.add(MainMenu.createOperMenu());
//        setJMenuBar(menuBar);

        setContentPane(rootPanel);

        setVisible(true);
        setSize(700, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//    enterButton.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            try{
//                String instanceName = "localhost:1433";
//                String databaseName = "Lr2Kafedra";
//                String userName = "loginOne";
//                String pass = "passOne";
//                String connectionUrl = "jdbc:sqlserver://%1$s;databaseName=%2$s;user=%3$s;password=%4$s;encrypt=true;trustServerCertificate=true";
//                String connectionString = String.format(connectionUrl, instanceName, databaseName, userName, pass);
////                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
////                String connectionString="jdbc:sqlserver://localhost:1433;databaseName=Lr2Kafedra;user=loginOne;password=passOne;encrypt=true;trustServerCertificate=true";
//                Connection connection = DriverManager.getConnection(connectionString);
//                String sqlCommand = "Select loginField, passwordField from [Users] where loginField = ? and passwordField = ?";
//                PreparedStatement pst = connection.prepareStatement(sqlCommand);
//                pst.setString(1, loginField.getText());
//                pst.setString(2, passwordField.getText());
//                ResultSet rs = pst.executeQuery();
//                if(rs.next()){
//                    JOptionPane.showMessageDialog(null, "Успешный вход!");
//                    System.out.print(rs.getString("loginField") + "\t");
//                    System.out.print(" ");
//                    System.out.print(rs.getString("passwordField") + "\t");
//                    System.out.print(" ");
//                    MainMenu field = new MainMenu();
//                    field.setVisible(true);
//                    setVisible(false);
//                }
//                else{
//                    JOptionPane.showMessageDialog(null, "Введённые данные неверны");
////                    loginField.setText("");
////                    passwordField.setText("");
//                }
//                connection.close();
//            }
//            catch(Exception e){
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
//    });
//
//    resetButton.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            loginField.setText("");
//            passwordField.setText("");
//        }
//    });

//        MainMenu field = new MainMenu();
//        field.setVisible(true);
//        setVisible(false);

}
}
