
package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMColor implements TableModel{
    
    private List<ColorIngresado> listaDeColores;

    public TMColor(List<ColorIngresado> listaDeColores) {
        this.listaDeColores = listaDeColores;
    }

    @Override
    public int getRowCount() {
         return listaDeColores.size();
    }

    @Override
    public int getColumnCount() {
       return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "ID";
            case 1:
                return "Color hexa";
            default:
                return null;
                
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
            switch (columnIndex){
                case 0:
                    return Integer.class;
                case 1:
                    return String.class;
                default:
                    return null;
            }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         ColorIngresado c= listaDeColores.get(rowIndex);
         
         switch(columnIndex){
             case 0:
                 return c.getId();
             case 1:
                 return c.getColor_hexa();      
             default:
                 return null;
         }

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                //No se necesita
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
                //No se necesita
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
                //No se necesita
        }
    
}
