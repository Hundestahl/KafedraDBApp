package org.example.model.tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TeachersTabelModel extends AbstractTableModel {
            private final String[] COLUMNS = {"ФИО", "Код должности", "Код преподавателя"};
    private List<Teachers> teachers;
    
    public TeachersTabelModel(ArrayList<Teachers> teachers) {
        this.teachers = teachers;
    }

    @Override
    public int getRowCount() {
        return teachers.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> teachers.get(rowIndex).getFIOOfTeachers();
            case 1 -> teachers.get(rowIndex).getCodeOfPosition();
            case 2 -> teachers.get(rowIndex).getCodeOfTeachers();
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
