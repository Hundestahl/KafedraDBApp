package org.example.model.directory;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TypeOfClassTableModel extends AbstractTableModel {
    private final String[] COLUMNS = {"Вид занятий", "Код вида занятия"};
    private List<TypeOfClass> typeOfClass;

    public TypeOfClassTableModel(List<TypeOfClass> typeOfClass) {
        this.typeOfClass = typeOfClass;
    }

    @Override
    public int getRowCount() {
        return typeOfClass.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> typeOfClass.get(rowIndex).getTypeOfClass();
            case 1 -> typeOfClass.get(rowIndex).getCodeOfClass();
            default -> "-";
        };
    }

        @Override
        public String getColumnName ( int column){
            return COLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass ( int columnIndex){
            if (getValueAt(0, columnIndex) != null) {
                return getValueAt(0, columnIndex).getClass();
            } else {
                return Object.class;
            }
        }

}
