/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entropy.proyectos.inventario.IGU;

import entropy.proyectos.inventario.Entidades.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastian
 */
public class LibretaTableModel extends DefaultTableModel {

    private final String[] columnas = {"Ref", "Descripcion", "$ Unidad", "$ Docena",
                                       "$ Por mayor", "S", "M", "L", "XL", "Total"};
    private List<Producto> datos;

    public LibretaTableModel(List<Producto> datos) {
        this.datos = datos;
        super.setColumnIdentifiers(columnas);
    }

    public void setDatos(List<Producto> datos) {
        this.datos = datos;
        actualizarDatos();
    }

    public void actualizarDatos() {
        fireTableDataChanged();
    }

    public Producto getDato(int row) {
        return datos.get(row);
    }

    @Override
    public int getRowCount() {
        return datos == null ? 0 : datos.size();
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Producto producto = datos.get(row);
        switch (column) {
            case 0: // Referencia
                return producto.getRef();
            case 1: // Descripcion
                return producto.getDescripcion();
            case 2: // $ unidad
                return producto.getPrecioUnidad();
            case 3: // $ Docena
                return producto.getPrecioDocena();
            case 4: // $ Por mayor
                return producto.getPrecioMayor();
            case 5: // S
                return producto.getExistenciaS();
            case 6: // M
                return producto.getExistenciaM();
            case 7: // L
                return producto.getExistenciaL();
            case 8: // XL
                return producto.getExistenciaXL();
            case 9: // Total 
                return producto.getExistenciaTotal();
            
        }
        return super.getValueAt(row, column);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    @Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 0: // Referencia
            case 1: // Descripcion
                return String.class;
            case 2: // Unidad
            case 3: // Docena
            case 4: // Por mayor
            case 5: // S
            case 6: // M
            case 7: // L
            case 8: // XL
            case 9: // Total
                return Integer[].class;

        }
        return super.getColumnClass(column);
    }
    
    

}
