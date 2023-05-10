package org.example.model.directory;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class SpecialityTableModel extends AbstractTableModel {
    private final String[] COLUMNS = {"Название специальности", "Код специальности"};
    private List<Speciality> speciality;
    public SpecialityTableModel(ArrayList<Speciality> speciality) {
        this.speciality = speciality;
    }

    @Override
    public int getRowCount() {
        return speciality.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> speciality.get(rowIndex).getNameOfSpeciality();
            case 1 -> speciality.get(rowIndex).getCodeOfSpeciality();
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
