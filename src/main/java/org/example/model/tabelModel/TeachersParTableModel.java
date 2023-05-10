package org.example.model.tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TeachersParTableModel extends AbstractTableModel {
    private final String[] COLUMNS = {"ФИО", "Название должности", "Вид занятия", "Номер семестра", "Объём часов"};
    private List<TeachersPar> teachersPar;
    
    public TeachersParTableModel(ArrayList<TeachersPar> teachersPar) {
        this.teachersPar = teachersPar;
    }

    @Override
    public int getRowCount() {
        return teachersPar.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> teachersPar.get(rowIndex).getFIOOfTeachers();
            case 1 -> teachersPar.get(rowIndex).getNameOfPosition();
            case 2 -> teachersPar.get(rowIndex).getTypeOfClass();
            case 3 -> teachersPar.get(rowIndex).getCodeOfSemester();
            case 4 -> teachersPar.get(rowIndex).getVolume();
            default -> "-";
        };
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNS[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (getValueAt(0, columnIndex) != null) {
            return getValueAt(0, columnIndex).getClass();
        } else {
            return Object.class;
        }
    }
}
