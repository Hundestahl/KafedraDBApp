package org.example.model.tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class StudentsTabelModel extends AbstractTableModel{
        private final String[] COLUMNS = {"Номер студенческого", "ФИО", "Номер группы"};
    private List<Students> students;
    
    public StudentsTabelModel(ArrayList<Students> students) {
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> students.get(rowIndex).getNumberOfStudent();
            case 1 -> students.get(rowIndex).getFIOOfStudent();
            case 2 -> students.get(rowIndex).getNumberOfGroup();
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
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return true;
    }
    
    @Override
   public void setValueAt(Object aValue, int rowIndex, int columnIndex)
   {
       Students row = students.get(rowIndex);
//       if(0 == columnIndex) {
//           row.setNumberOfStudent((Integer) aValue);
//       }
       if(1 == columnIndex) {
           row.setFIO((String) aValue);
       }
       else if(2 == columnIndex) {
           row.setNumberOfGroup((Integer) aValue);
       }
   }
   
}
