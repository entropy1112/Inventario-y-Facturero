/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entropy.proyectos.inventario.Dao;

import entropy.proyectos.inventario.Entidades.Producto;
import entropy.proyectos.inventario.excepciones.BaseDatosException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Sebastian
 */
public class ProductoDao {
    
    private static ProductoDao instancia;
    
    public static ProductoDao getInstance(){
        if(instancia == null){
            instancia = new ProductoDao();
        }
        return instancia;
    }
    
    public final EntityManagerFactory emf;
    
    public ProductoDao(){
        emf = Persistence.createEntityManagerFactory("Inventario");
    }
    
    public void añadirProducto(Producto producto) throws BaseDatosException{
        
        var em = emf.createEntityManager();
        EntityTransaction et = null;
        
        try {
            et = em.getTransaction();
            et.begin();
            
            em.persist(producto);
            
            et.commit();
            
        } catch (Exception e) {
            if(et != null){
                et.rollback();
            }
            throw new BaseDatosException(e.getMessage());
        } finally {
            em.close();
        }
    }
    
    public void modificarProducto(Producto producto) throws BaseDatosException{
        
        var em = emf.createEntityManager();
        EntityTransaction et = null;
        
        try {
            et = em.getTransaction();
            et.begin();
            
            em.merge(producto);
            
            et.commit();
            
        } catch (Exception e) {
            if(et != null){
                et.rollback();
            }
            throw new BaseDatosException(e.getMessage());
        } finally {
            em.close();
        }
       
    }
    
    public void eliminarProducto(Producto producto) throws BaseDatosException{
        
        var em = emf.createEntityManager();
        EntityTransaction et = null;
        
        try {
            et = em.getTransaction();
            et.begin();
            
            em.remove(producto);
            
            et.commit();
            
        } catch (Exception e) {
            if(et != null){
                et.rollback();
            }
            throw new BaseDatosException(e.getMessage());
        } finally {
            em.close();
        }
       
    }
    
    public List<Producto> cargarProductos() throws BaseDatosException {
        
        List<Producto> productos = new ArrayList<>();
        var em = emf.createEntityManager();
        
        try {
            productos = em.createQuery("SELECT e FROM Producto e",Producto.class).getResultList();
            
            
            return productos;
        } catch (Exception e) {
            throw new BaseDatosException(e.getMessage());
        }
    }
    
}
