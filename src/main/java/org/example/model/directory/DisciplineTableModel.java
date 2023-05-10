package org.example.model.directory;

import org.example.model.directory.Discipline;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class DisciplineTableModel extends AbstractTableModel {
    private final String[] COLUMNS = {"Название_дисциплины", "Код_дисциплины"};
    private List<Discipline> disciplines;

    public DisciplineTableModel(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public int getRowCount() {
        return disciplines.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> disciplines.get(rowIndex).getNameOfDiscipline();
            case 1 -> disciplines.get(rowIndex).getCodeOfDiscipline();
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
