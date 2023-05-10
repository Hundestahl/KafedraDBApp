package org.example.model.directory;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PositionTableModel extends AbstractTableModel {
    private final String[] COLUMNS = {"Название должности", "Код должности"};
    private List<Position> position;

    public PositionTableModel(List<Position> position) {
        this.position = position;
    }

    @Override
    public int getRowCount() {
        return position.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> position.get(rowIndex).getNameOfPosition();
            case 1 -> position.get(rowIndex).getCodeOfPosition();
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
