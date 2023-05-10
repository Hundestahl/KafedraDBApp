package org.example.model.tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class GroupLoadTabelModel extends AbstractTableModel {
            private final String[] COLUMNS = {"Объём часов", "Номер группы", "Преподаватель", "Дисциплина", "Номер семестра", "Вид занятия"};
    private List<GroupLoad> groupLoad;
    
    public GroupLoadTabelModel(ArrayList<GroupLoad> groupLoad) {
        this.groupLoad = groupLoad;
    }

    @Override
    public int getRowCount() {
        return groupLoad.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> groupLoad.get(rowIndex).getVolume();
            case 1 -> groupLoad.get(rowIndex).getNumberOfGroup();
            case 2 -> groupLoad.get(rowIndex).getFIOOfTeacher();
            case 3 -> groupLoad.get(rowIndex).getNameOfDiscipline();
            case 4 -> groupLoad.get(rowIndex).getCodeOfSemester();
            case 5 -> groupLoad.get(rowIndex).getTypeOfClass();
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

