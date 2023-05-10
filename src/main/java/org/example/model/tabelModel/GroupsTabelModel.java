package org.example.model.tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class GroupsTabelModel extends AbstractTableModel{
    private final String[] COLUMNS = {"Вид обучения", "Номер группы", "Количество студентов", "Код специальности"};
    private List<Groups> groups;
    
    public GroupsTabelModel(ArrayList<Groups> groups) {
        this.groups = groups;
    }

    @Override
    public int getRowCount() {
        return groups.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> groups.get(rowIndex).getTypeOfEducation();
            case 1 -> groups.get(rowIndex).getNumberOfGroup();
            case 2 -> groups.get(rowIndex).getQuantityOfStudents();
            case 3 -> groups.get(rowIndex).getCodeOfSpeciality();
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
