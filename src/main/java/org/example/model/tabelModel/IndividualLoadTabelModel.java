package org.example.model.tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class IndividualLoadTabelModel extends AbstractTableModel {
            private final String[] COLUMNS = {"Объём часов", "Код преподавателя", "Код семестра", "Номер студенческого", "Код вида занятия"};
    private List<IndividualLoad> individualLoad;
    
    public IndividualLoadTabelModel(ArrayList<IndividualLoad> individualLoad) {
        this.individualLoad = individualLoad;
    }

    @Override
    public int getRowCount() {
        return individualLoad.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> individualLoad.get(rowIndex).getVolume();
            case 1 -> individualLoad.get(rowIndex).getCodeOfTeacher();
            case 2 -> individualLoad.get(rowIndex).getCodeOfSemester();
            case 3 -> individualLoad.get(rowIndex).getNumberOfStudent();
            case 4 -> individualLoad.get(rowIndex).getCodeOfClass();
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
