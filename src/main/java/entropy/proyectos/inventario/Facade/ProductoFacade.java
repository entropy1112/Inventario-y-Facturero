/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entropy.proyectos.inventario.Facade;

import entropy.proyectos.inventario.Dao.ProductoDao;
import entropy.proyectos.inventario.Entidades.Producto;
import entropy.proyectos.inventario.excepciones.BaseDatosException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class ProductoFacade {
    
    public ProductoDao pd;
    
    public ProductoFacade (){
        pd = ProductoDao.getInstance();
    }
    
    public void crearProducto(Producto producto)throws BaseDatosException{
        try {
            pd.añadirProducto(producto);
        } catch (BaseDatosException e) {
            throw new BaseDatosException(e.getMessage());
        }
    }
    
    public void eliminarProducto(Producto producto)throws BaseDatosException{
        try {
            pd.eliminarProducto(producto);
        } catch (BaseDatosException e) {
            throw new BaseDatosException(e.getMessage());
        }
    }
    
    public void modificarProducto(Producto producto)throws BaseDatosException{
        try {
            pd.modificarProducto(producto);
        } catch (BaseDatosException e) {
            throw new BaseDatosException(e.getMessage());
        }
    }
    
    public List<Producto> cargarProductos() throws BaseDatosException {
        try {
            List<Producto> datos = new ArrayList<>();
            datos = pd.cargarProductos();
            return datos;
        } catch (BaseDatosException e) {
            throw new BaseDatosException(e.getMessage());
        }
    }
    
}
