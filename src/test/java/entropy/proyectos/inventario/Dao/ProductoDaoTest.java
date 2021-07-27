/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entropy.proyectos.inventario.Dao;

import entropy.proyectos.inventario.Entidades.Producto;
import entropy.proyectos.inventario.excepciones.BaseDatosException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sebastian
 */
public class ProductoDaoTest {
    
    public ProductoDaoTest() {
    }

    @Test
    public void añadirProductos() throws BaseDatosException {
        
        ProductoDao pd = ProductoDao.getInstance();
        
        Producto producto = new Producto(Long.valueOf("01"), 
                                        "Body con copa de varilla", 
                                        35000, 23000, 20000, 1, 1, 1, 1, 4);
        
        pd.añadirProducto(producto);

    }
    
}
