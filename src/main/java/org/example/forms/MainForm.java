package org.example.forms;

import org.example.model.tabelModel.*;
import org.example.model.directory.*;
import org.example.forms.InsertStudentForm;
import org.example.ConnectionMSQLS;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import org.example.KafedraReport;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spravkaPanel = new javax.swing.JPanel();
        insertStudentBtn = new javax.swing.JButton();
        updateStudentBtn = new javax.swing.JButton();
        deleteStudentBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSpravka = new javax.swing.JTable();
        deleteGroupBtn = new javax.swing.JButton();
        refreshStudentBtn = new javax.swing.JButton();
        queryGroupPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numberGrComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGroup = new javax.swing.JTable();
        reportPanel = new javax.swing.JPanel();
        reportLabel = new javax.swing.JLabel();
        reportBtn = new javax.swing.JButton();
        queryTeacherPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTeachers = new javax.swing.JTable();
        teachersLabel = new javax.swing.JLabel();
        teachComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        teachParamBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemDis = new javax.swing.JMenuItem();
        itemPos = new javax.swing.JMenuItem();
        itemSp = new javax.swing.JMenuItem();
        itemClas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemStud = new javax.swing.JMenuItem();
        itemPrep = new javax.swing.JMenuItem();
        itemGroup = new javax.swing.JMenuItem();
        itemGrNag = new javax.swing.JMenuItem();
        itemIndNag = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemGroupPar = new javax.swing.JMenuItem();
        ItemTeachPar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemOtch1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insertStudentBtn.setText("Добавить студента");
        insertStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertStudentBtnActionPerformed(evt);
            }
        });

        updateStudentBtn.setText("Сохранить изменения у студента");
        updateStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentBtnActionPerformed(evt);
            }
        });

        deleteStudentBtn.setText(" Удалить студента");
        deleteStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentBtnActionPerformed(evt);
            }
        });

        tableSpravka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tableSpravka);

        deleteGroupBtn.setText("Удалить группу");
        deleteGroupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGroupBtnActionPerformed(evt);
            }
        });

        refreshStudentBtn.setText("Обновить таблицу");
        refreshStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshStudentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout spravkaPanelLayout = new javax.swing.GroupLayout(spravkaPanel);
        spravkaPanel.setLayout(spravkaPanelLayout);
        spravkaPanelLayout.setHorizontalGroup(
            spravkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spravkaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(spravkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteGroupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        spravkaPanelLayout.setVerticalGroup(
            spravkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spravkaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(spravkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(spravkaPanelLayout.createSequentialGroup()
                        .addComponent(insertStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteGroupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Выберите номер группы");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Информация о группе");

        numberGrComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                numberGrComboBoxItemStateChanged(evt);
            }
        });

        tableGroup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableGroup);

        javax.swing.GroupLayout queryGroupPanelLayout = new javax.swing.GroupLayout(queryGroupPanel);
        queryGroupPanel.setLayout(queryGroupPanelLayout);
        queryGroupPanelLayout.setHorizontalGroup(
            queryGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queryGroupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(queryGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queryGroupPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(queryGroupPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(queryGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberGrComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        queryGroupPanelLayout.setVerticalGroup(
            queryGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queryGroupPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(queryGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queryGroupPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberGrComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(297, Short.MAX_VALUE))
        );

        reportLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportLabel.setText("Отчёт о нагрузке на кафедре");

        reportBtn.setText("Создать");
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(548, Short.MAX_VALUE))
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(reportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Информация о преподавателе");

        tableTeachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableTeachers);

        teachersLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teachersLabel.setText("Выберите преподавателя");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Выберите вид занятия");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ГЭК", "Дипломник", "КСРС", "Курсовой проект", "Лабораторная работа", "Лекция", "Практическое занятие" }));

        teachParamBtn.setText("Показать");
        teachParamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachParamBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout queryTeacherPanelLayout = new javax.swing.GroupLayout(queryTeacherPanel);
        queryTeacherPanel.setLayout(queryTeacherPanelLayout);
        queryTeacherPanelLayout.setHorizontalGroup(
            queryTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queryTeacherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(queryTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queryTeacherPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(queryTeacherPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(queryTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teachersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teachComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teachParamBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typeComboBox, 0, 193, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        queryTeacherPanelLayout.setVerticalGroup(
            queryTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queryTeacherPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(queryTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queryTeacherPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(queryTeacherPanelLayout.createSequentialGroup()
                        .addComponent(teachersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(teachComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teachParamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );

        jMenu1.setText("Справочные данные");

        itemDis.setText("Дисциплины");
        itemDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDisActionPerformed(evt);
            }
        });
        jMenu1.add(itemDis);

        itemPos.setText("Должности");
        itemPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPosActionPerformed(evt);
            }
        });
        jMenu1.add(itemPos);

        itemSp.setText("Специальности");
        itemSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSpActionPerformed(evt);
            }
        });
        jMenu1.add(itemSp);

        itemClas.setText("Виды занятий");
        itemClas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClasActionPerformed(evt);
            }
        });
        jMenu1.add(itemClas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Оперативные данные");

        itemStud.setText("Студенты");
        itemStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemStudActionPerformed(evt);
            }
        });
        jMenu2.add(itemStud);

        itemPrep.setText("Преподаватели");
        itemPrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPrepActionPerformed(evt);
            }
        });
        jMenu2.add(itemPrep);

        itemGroup.setText("Группы");
        itemGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGroupActionPerformed(evt);
            }
        });
        jMenu2.add(itemGroup);

        itemGrNag.setText("Групповая нагрузка");
        itemGrNag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGrNagActionPerformed(evt);
            }
        });
        jMenu2.add(itemGrNag);

        itemIndNag.setText("Индивидуальная нагрузка");
        itemIndNag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIndNagActionPerformed(evt);
            }
        });
        jMenu2.add(itemIndNag);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Запросы");

        itemGroupPar.setText("Информация о группе");
        itemGroupPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGroupParActionPerformed(evt);
            }
        });
        jMenu3.add(itemGroupPar);

        ItemTeachPar.setText("Информация о преподавателе");
        ItemTeachPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTeachParActionPerformed(evt);
            }
        });
        jMenu3.add(ItemTeachPar);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Отчёты");

        itemOtch1.setText("Отчёт 1");
        itemOtch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOtch1ActionPerformed(evt);
            }
        });
        jMenu4.add(itemOtch1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spravkaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(queryGroupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(queryTeacherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spravkaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(queryGroupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(queryTeacherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertStudentBtnActionPerformed
        InsertStudentForm insertField =  new InsertStudentForm();
        insertField.setLocation(600, 300);
        insertField.setVisible(true);
        insertField.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_insertStudentBtnActionPerformed

    private void itemDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDisActionPerformed
                reportPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                spravkaPanel.setVisible(true);
        try {
                showDiscipline();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }
    }//GEN-LAST:event_itemDisActionPerformed

    private void itemPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPosActionPerformed
                reportPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                spravkaPanel.setVisible(true);
        try {
                showPosition();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }
    }//GEN-LAST:event_itemPosActionPerformed

    private void itemSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSpActionPerformed
                reportPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                spravkaPanel.setVisible(true);
        try {
                showSpeciality();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }
    }//GEN-LAST:event_itemSpActionPerformed

    private void itemClasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClasActionPerformed
                reportPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                spravkaPanel.setVisible(true);
        try {
                showTypeOfClass();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }
    }//GEN-LAST:event_itemClasActionPerformed

    private void itemStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemStudActionPerformed
                reportPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                spravkaPanel.setVisible(true);
        try {
                showStudents();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }

    }//GEN-LAST:event_itemStudActionPerformed

    private void itemPrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPrepActionPerformed
                reportPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                spravkaPanel.setVisible(true);
        try {
                showTeachers();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }                
    }//GEN-LAST:event_itemPrepActionPerformed

    private void itemGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGroupActionPerformed
                reportPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                spravkaPanel.setVisible(true);
        try {
                showGroups();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }                
    }//GEN-LAST:event_itemGroupActionPerformed

    private void itemGrNagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGrNagActionPerformed
                reportPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                spravkaPanel.setVisible(true);
        try {
                showGroupLoad();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }                
    }//GEN-LAST:event_itemGrNagActionPerformed

    private void itemIndNagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIndNagActionPerformed
                reportPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                spravkaPanel.setVisible(true);
        try {
                showIndividualLoad();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }                
    }//GEN-LAST:event_itemIndNagActionPerformed

    private void itemGroupParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGroupParActionPerformed
                spravkaPanel.setVisible(false);
                reportPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                queryGroupPanel.setVisible(true);
            try {
                showGroups();
                numbersGroupParameter();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }   
    }//GEN-LAST:event_itemGroupParActionPerformed

    private void itemOtch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOtch1ActionPerformed
                spravkaPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(false);
                reportPanel.setVisible(true);
    }//GEN-LAST:event_itemOtch1ActionPerformed

    private void deleteStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentBtnActionPerformed
       try {
           Connection connection = ConnectionMSQLS.connectToDb();
            int row = tableSpravka.getSelectedRow();
            String value = (tableSpravka.getModel().getValueAt(row, 0).toString());
            String sqlCommand = "DELETE FROM [Студент] WHERE [Номер_студенческого] = " + value;
            PreparedStatement pst = connection.prepareStatement(sqlCommand);
            pst.executeUpdate();
            showStudents();
            JOptionPane.showMessageDialog(null, "Удаление успешно!");
       }
       catch(Exception e) {
           JOptionPane.showMessageDialog(null,"Выберите студента для удаления!");
       }
    }//GEN-LAST:event_deleteStudentBtnActionPerformed

    private void updateStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentBtnActionPerformed
       try {
            int row = tableSpravka.getSelectedRow();
            String numberOfSt = (tableSpravka.getModel().getValueAt(row, 0).toString());
            String FIOSt = (tableSpravka.getModel().getValueAt(row, 1).toString());
            String numberOfGr = (tableSpravka.getModel().getValueAt(row, 2).toString());

            String sqlCommand = "UPDATE [Студент] SET [ФИО]=?, [Номер_группы]=? WHERE [Номер_студенческого]= ?";
            Connection connection = ConnectionMSQLS.connectToDb();
            PreparedStatement pst = connection.prepareStatement(sqlCommand);
            pst.setString(1, FIOSt);
            pst.setString(2, numberOfGr);
            pst.setString(3, numberOfSt);
            pst.executeUpdate();
            showStudents();
            JOptionPane.showMessageDialog(null, "Изменение успешно!");
       }
        catch(SQLException sqle) {
           JOptionPane.showMessageDialog(null,"Такой группы не существует");
       }
       catch(Exception e) {
           JOptionPane.showMessageDialog(null,"Выберите студента!");
       }
    }//GEN-LAST:event_updateStudentBtnActionPerformed

    private void deleteGroupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGroupBtnActionPerformed
        try {
            Connection connection = ConnectionMSQLS.connectToDb();
            Statement stmt = connection.createStatement();
            int row = tableSpravka.getSelectedRow();
            String value = (tableSpravka.getModel().getValueAt(row, 1).toString());
            System.out.println(value);
            String sqlCommand = "DELETE FROM [Группа] WHERE [Номер_группы] = " + value;
            PreparedStatement pst = connection.prepareStatement(sqlCommand);
            pst.executeUpdate();
            showGroups();
            JOptionPane.showMessageDialog(null, "Удаление успешно!");
       }
       catch(SQLException sqle) {
           JOptionPane.showMessageDialog(null,"Группа не может быть удалена, пока в ней студенты и у них есть занятия");
       }
       catch(Exception e) {
           JOptionPane.showMessageDialog(null,"Выберите группу для удаления!");
       }
    }//GEN-LAST:event_deleteGroupBtnActionPerformed

    private void refreshStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshStudentBtnActionPerformed
        try {
            showStudents();
       }
        catch(ClassNotFoundException e) {
       }
    }//GEN-LAST:event_refreshStudentBtnActionPerformed

    private void numberGrComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_numberGrComboBoxItemStateChanged
        try {
            showGroupsParameter();
            } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }
    }//GEN-LAST:event_numberGrComboBoxItemStateChanged

    private void ItemTeachParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTeachParActionPerformed
                spravkaPanel.setVisible(false);
                reportPanel.setVisible(false);
                queryGroupPanel.setVisible(false);
                queryTeacherPanel.setVisible(true);
            try {
                _FIOTeacherParameter();
                showTeachersParameter();
                } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        } 
    }//GEN-LAST:event_ItemTeachParActionPerformed

    private void teachParamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachParamBtnActionPerformed
        try {
            showTeachersParameter();
        } catch (ClassNotFoundException cnfex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, cnfex);
        }
    }//GEN-LAST:event_teachParamBtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        try {
            KafedraReport.createReport();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reportBtnActionPerformed


    
    
    public static ArrayList<Discipline> disciplineList() throws ClassNotFoundException {
        ArrayList<Discipline> disciplineList = new ArrayList<>();
        try {
            Connection connection = ConnectionMSQLS.connectToDb(); 
            Statement stmt = connection.createStatement();
            String sqlCommand = "SELECT * FROM [Дисциплина]";
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                Discipline discipline = new Discipline(executeQuery.getString("Название_дисциплины"), executeQuery.getInt("Код_дисциплины"));
                disciplineList.add(discipline);
            }
            executeQuery.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return disciplineList;
    }
    
    public void showDiscipline() throws ClassNotFoundException {
        ArrayList<Discipline> list = disciplineList();
        DisciplineTableModel disciplineTableModel = new DisciplineTableModel(list);
        tableSpravka.setModel(disciplineTableModel);
        tableSpravka.setAutoCreateRowSorter(true);
        }
    
    
    public static ArrayList<Position> positionList() throws ClassNotFoundException {
        ArrayList<Position> positionList = new ArrayList<>();
        try {
            Connection connection = ConnectionMSQLS.connectToDb(); 
            String sqlCommand = "SELECT * FROM [Должность]";
            Statement stmt = connection.createStatement();
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                Position position = new Position(executeQuery.getString("Название_должности"), executeQuery.getInt("Код_должности"));
                positionList.add(position);
            }
            executeQuery.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return positionList;
    }
    
    public void showPosition() throws ClassNotFoundException {
        ArrayList<Position> list = positionList();
        PositionTableModel positionTableModel = new PositionTableModel(list);
        tableSpravka.setModel(positionTableModel);
        tableSpravka.setAutoCreateRowSorter(true);
    }
    
    
    public static ArrayList<Speciality> specialityList() throws ClassNotFoundException {
        ArrayList<Speciality> specialityList = new ArrayList<>();
        try {
            Connection connection = ConnectionMSQLS.connectToDb(); 
            String sqlCommand = "SELECT * FROM [Специальность]";
            Statement stmt = connection.createStatement();
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                Speciality speciality = new Speciality(executeQuery.getString("Название_специальности"), executeQuery.getInt("Код_специальности"));
                specialityList.add(speciality);
            }
            executeQuery.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return specialityList;
    }
    
    public void showSpeciality() throws ClassNotFoundException {
        ArrayList<Speciality> list = specialityList();
        SpecialityTableModel specialityTableModel = new SpecialityTableModel(list);
        tableSpravka.setModel(specialityTableModel);
        tableSpravka.setAutoCreateRowSorter(true);
    }
    
    
    public static ArrayList<TypeOfClass> typeOfClassList() throws ClassNotFoundException {
        ArrayList<TypeOfClass> typeOfClassList = new ArrayList<>();
        try {
            Connection connection = ConnectionMSQLS.connectToDb(); 
            String sqlCommand = "SELECT * FROM [Вид_занятий]";
            Statement stmt = connection.createStatement();
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                TypeOfClass typeOfClass = new TypeOfClass(executeQuery.getString("Вид_занятий"), executeQuery.getInt("Код_вида_занятия"));
                typeOfClassList.add(typeOfClass);
            }
            executeQuery.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return typeOfClassList;
    }
           
    public void showTypeOfClass() throws ClassNotFoundException {
        ArrayList<TypeOfClass> list = typeOfClassList();
        TypeOfClassTableModel typeOfClassTableModel = new TypeOfClassTableModel(list);
        tableSpravka.setModel(typeOfClassTableModel);
        tableSpravka.setAutoCreateRowSorter(true);
    }
        
        
    public static ArrayList<Students> studentsList() throws ClassNotFoundException {
        ArrayList<Students> studentsList = new ArrayList<>();
        try {
            Connection connection = ConnectionMSQLS.connectToDb(); 
            String sqlCommand = "SELECT * FROM [Студент]";
            Statement stmt = connection.createStatement();
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                Students students = new Students(executeQuery.getInt("Номер_студенческого"), executeQuery.getString("ФИО"), executeQuery.getInt("Номер_группы"));
                studentsList.add(students);
            }
            executeQuery.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return studentsList;
    }
           
    public void showStudents() throws ClassNotFoundException {
        ArrayList<Students> list = studentsList();
        StudentsTabelModel studentsTabelModel = new StudentsTabelModel(list);
        tableSpravka.setModel(studentsTabelModel);
        tableSpravka.setAutoCreateRowSorter(true);
    }    
    
    
    public static ArrayList<Teachers> teachersList() throws ClassNotFoundException {
        ArrayList<Teachers> teachersList = new ArrayList<>();
        try {
            Connection connection = ConnectionMSQLS.connectToDb(); 
            String sqlCommand = "SELECT * FROM [Преподаватель]";
            Statement stmt = connection.createStatement();
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                Teachers teachers = new Teachers(executeQuery.getString("ФИО"), executeQuery.getInt("Код_должности"), executeQuery.getInt("Код_преподавателя"));
                teachersList.add(teachers);
            }
            executeQuery.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teachersList;
    }
           
    public void showTeachers() throws ClassNotFoundException {
        ArrayList<Teachers> list = teachersList();
        TeachersTabelModel teachersTabelModel = new TeachersTabelModel(list);
        tableSpravka.setModel(teachersTabelModel);
        tableSpravka.setAutoCreateRowSorter(true);
    }        
    
    
    public static ArrayList<Groups> groupsList() throws ClassNotFoundException {
        ArrayList<Groups> groupsList = new ArrayList<>();
        try {
            Connection connection = ConnectionMSQLS.connectToDb(); 
            String sqlCommand = "SELECT * FROM [Группа]";
            Statement stmt = connection.createStatement();
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                Groups groups = new Groups(executeQuery.getString("Вид_обучения"), executeQuery.getInt("Номер_группы"), executeQuery.getInt("Количество_студентов"), executeQuery.getInt("Код_специальности"));
                groupsList.add(groups);
            }
            executeQuery.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return groupsList;
    }
           
    public void showGroups() throws ClassNotFoundException {
        ArrayList<Groups> list = groupsList();
        GroupsTabelModel groupsTabelModel = new GroupsTabelModel(list);
        tableSpravka.setModel(groupsTabelModel);
        tableSpravka.setAutoCreateRowSorter(true);
    }        
    
    
    public static ArrayList<GroupLoad> groupLoadList() throws ClassNotFoundException {
        ArrayList<GroupLoad> groupLoadList = new ArrayList<>();
        try {
            Connection connection = ConnectionMSQLS.connectToDb(); 
            String sqlCommand = "  SELECT dbo.Нагрузка_преподавателя_групповая.Объём_часов, dbo.Нагрузка_преподавателя_групповая.Номер_группы, dbo.Преподаватель.ФИО, "
                    + "dbo.Дисциплина.Название_дисциплины, dbo.Семестр.Код_семестра, dbo.Вид_занятий.Вид_занятий\n" +
    "FROM dbo.Преподаватель INNER JOIN Нагрузка_преподавателя_групповая ON dbo.Нагрузка_преподавателя_групповая.Код_преподавателя = dbo.Преподаватель.Код_преподавателя\n" +
    "					   INNER JOIN dbo.Вид_занятий ON dbo.Нагрузка_преподавателя_групповая.Код_вида_занятия = dbo.Вид_занятий.Код_вида_занятия\n" +
    "					   INNER JOIN dbo.Дисциплина ON dbo.Дисциплина.Код_дисциплины = dbo.Нагрузка_преподавателя_групповая.Код_дисциплины\n" +
    "					   INNER JOIN dbo.Семестр ON dbo.Семестр.Код_семестра = dbo.Нагрузка_преподавателя_групповая.Код_семестра";
            Statement stmt = connection.createStatement();
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                GroupLoad groupLoad = new GroupLoad(executeQuery.getInt("Объём_часов"), executeQuery.getInt("Номер_группы"),
                        executeQuery.getString("ФИО"), executeQuery.getString("Название_дисциплины"),
                        executeQuery.getInt("Код_семестра"), executeQuery.getString("Вид_занятий"));
                groupLoadList.add(groupLoad);
            }
            executeQuery.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return groupLoadList;
    }
           
    public void showGroupLoad() throws ClassNotFoundException {
        ArrayList<GroupLoad> list = groupLoadList();
        GroupLoadTabelModel groupLoadTabelModel = new GroupLoadTabelModel(list);
        tableSpravka.setModel(groupLoadTabelModel);
        tableSpravka.setAutoCreateRowSorter(true);
    }      
    
    
    public static ArrayList<IndividualLoad> individualLoadList() throws ClassNotFoundException {
        ArrayList<IndividualLoad> individualLoadList = new ArrayList<>();
        try {
            Connection connection = ConnectionMSQLS.connectToDb(); 
            String sqlCommand = "SELECT * FROM [Нагрузка_преподавателя_индивидуальная]";
            Statement stmt = connection.createStatement();
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                IndividualLoad individualLoad = new IndividualLoad(executeQuery.getInt("Объём_часов"), executeQuery.getInt("Код_преподавателя"), executeQuery.getInt("Код_семестра"), executeQuery.getInt("Номер_студенческого"), executeQuery.getInt("Код_вида_занятия"));
                individualLoadList.add(individualLoad);
            }
            executeQuery.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return individualLoadList;
    }
           
    public void showIndividualLoad() throws ClassNotFoundException {
        ArrayList<IndividualLoad> list = individualLoadList();
        IndividualLoadTabelModel individualLoadTabelModel = new IndividualLoadTabelModel(list);
        tableSpravka.setModel(individualLoadTabelModel);
        tableSpravka.setAutoCreateRowSorter(true);
    }        
    
    
    
    public ArrayList<Groups> groupsListParameter() throws ClassNotFoundException {
        ArrayList<Groups> groupsList = new ArrayList<>();
        try {
            String value = String.valueOf(numberGrComboBox.getSelectedItem());
            Connection connection = ConnectionMSQLS.connectToDb();
            String sqlCommand = "SELECT * FROM [Группа] WHERE [Номер_группы] = " + value;
            Statement stmt = connection.createStatement();
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                Groups groups = new Groups(executeQuery.getString("Вид_обучения"), executeQuery.getInt("Номер_группы"), executeQuery.getInt("Количество_студентов"), executeQuery.getInt("Код_специальности"));
                groupsList.add(groups);
            }
            stmt.close();
            showGroups();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return groupsList;
    }
           
    public void showGroupsParameter() throws ClassNotFoundException {
        ArrayList<Groups> list = groupsListParameter();
        GroupsTabelModel groupsTabelModel = new GroupsTabelModel(list);
        tableGroup.setModel(groupsTabelModel);
        tableGroup.setAutoCreateRowSorter(true);
    } 

    public void numbersGroupParameter() throws ClassNotFoundException {
    try {
        String sqlCommand = "SELECT * FROM [Группа]";
        Connection connection = ConnectionMSQLS.connectToDb();
        Statement stmt = connection.createStatement();
        ResultSet executeQuery = stmt.executeQuery(sqlCommand);
        while (executeQuery.next()) {
            numberGrComboBox.addItem((String)(executeQuery.getString("Номер_группы")));
        }
        executeQuery.close();
        stmt.close();
        connection.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    

    public ArrayList<TeachersPar> teachersListParameter() throws ClassNotFoundException {
        ArrayList<TeachersPar> teachersList = new ArrayList<>();
        try {
            String value = String.valueOf(teachComboBox.getSelectedItem());
            String value2 = String.valueOf(typeComboBox.getSelectedItem());          
            Connection connection = ConnectionMSQLS.connectToDb();
            String sqlCommand = "SELECT dbo.Преподаватель.ФИО, dbo.Должность.Название_должности, dbo.Вид_занятий.Вид_занятий, dbo.Семестр.Код_семестра, SUM(dbo.Нагрузка_преподавателя_групповая.Объём_часов) AS 'Объём_часов'\n" +
"FROM dbo.Преподаватель INNER JOIN dbo.Должность ON dbo.Преподаватель.Код_должности = dbo.Должность.Код_должности\n" +
"				       INNER JOIN Нагрузка_преподавателя_групповая ON dbo.Нагрузка_преподавателя_групповая.Код_преподавателя = dbo.Преподаватель.Код_преподавателя\n" +
"					   INNER JOIN dbo.Вид_занятий ON dbo.Нагрузка_преподавателя_групповая.Код_вида_занятия = dbo.Вид_занятий.Код_вида_занятия\n" +
"					   INNER JOIN dbo.Группа ON dbo.Группа.Номер_группы = dbo.Нагрузка_преподавателя_групповая.Номер_группы\n" +
"					   INNER JOIN dbo.Семестр ON dbo.Семестр.Код_семестра = dbo.Нагрузка_преподавателя_групповая.Код_семестра\n" +
"WHERE dbo.Преподаватель.ФИО = '" + value + "' AND dbo.Вид_занятий.Вид_занятий = '" + value2 + "'\n" +
"GROUP BY dbo.Преподаватель.ФИО, dbo.Должность.Название_должности, dbo.Вид_занятий.Вид_занятий, dbo.Семестр.Код_семестра\n" +
"ORDER BY dbo.Преподаватель.ФИО";
            Statement stmt = connection.createStatement();
            ResultSet executeQuery = stmt.executeQuery(sqlCommand);
            while (executeQuery.next()) {
                TeachersPar teachersPar = new TeachersPar(executeQuery.getString("ФИО"), executeQuery.getString("Название_должности"), executeQuery.getString("Вид_занятий"), executeQuery.getInt("Код_семестра"), executeQuery.getInt("Объём_часов"));
                teachersList.add(teachersPar);
            }
            stmt.close();
            showGroups();
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(teachersList.isEmpty()) {
            TeachersPar teachersPar = new TeachersPar("Пусто", " ", " ", 0, 0);
            teachersList.add(teachersPar);
        }
        return teachersList;
    }
           
    public void showTeachersParameter() throws ClassNotFoundException {
        ArrayList<TeachersPar> teachersList = teachersListParameter();
        TeachersParTableModel teachersParTableModel = new TeachersParTableModel(teachersList);
        tableTeachers.setModel(teachersParTableModel);
        tableTeachers.setAutoCreateRowSorter(true);
    } 

    public void _FIOTeacherParameter() throws ClassNotFoundException {
    try {
        String sqlCommand = "SELECT Преподаватель.ФИО FROM [Преподаватель]";
        Connection connection = ConnectionMSQLS.connectToDb();
        Statement stmt = connection.createStatement();
        ResultSet executeQuery = stmt.executeQuery(sqlCommand);
        while (executeQuery.next()) {
            teachComboBox.addItem((String)(executeQuery.getString("ФИО")));
        }
        executeQuery.close();
        stmt.close();
        connection.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
    }
}    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemTeachPar;
    private javax.swing.JButton deleteGroupBtn;
    private javax.swing.JButton deleteStudentBtn;
    private javax.swing.JButton insertStudentBtn;
    private javax.swing.JMenuItem itemClas;
    private javax.swing.JMenuItem itemDis;
    private javax.swing.JMenuItem itemGrNag;
    private javax.swing.JMenuItem itemGroup;
    private javax.swing.JMenuItem itemGroupPar;
    private javax.swing.JMenuItem itemIndNag;
    private javax.swing.JMenuItem itemOtch1;
    private javax.swing.JMenuItem itemPos;
    private javax.swing.JMenuItem itemPrep;
    private javax.swing.JMenuItem itemSp;
    private javax.swing.JMenuItem itemStud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> numberGrComboBox;
    private javax.swing.JPanel queryGroupPanel;
    private javax.swing.JPanel queryTeacherPanel;
    private javax.swing.JButton refreshStudentBtn;
    private javax.swing.JButton reportBtn;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JPanel spravkaPanel;
    private javax.swing.JTable tableGroup;
    private javax.swing.JTable tableSpravka;
    private javax.swing.JTable tableTeachers;
    private javax.swing.JComboBox<String> teachComboBox;
    private javax.swing.JButton teachParamBtn;
    private javax.swing.JLabel teachersLabel;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JButton updateStudentBtn;
    // End of variables declaration//GEN-END:variables
}
