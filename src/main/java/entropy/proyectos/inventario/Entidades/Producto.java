/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entropy.proyectos.inventario.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Sebastian
 */

@Entity
@Table(name = "PRODUCTOS")
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "REFERENCIA", unique = true)
    private Long referencia;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;
    
    @Column(name = "UNIDAD")
    private Integer precioUnidad;
    
    @Column(name = "DOCENA")
    private Integer precioDocena ;
    
    @Column(name = "MAYOR")
    private Integer precioMayor;
    
    @Column(name = "S")
    private Integer existenciaS;
    
    @Column(name = "M")
    private Integer existenciaM;
        
    @Column(name = "L")
    private Integer existenciaL;
            
    @Column(name = "XL")
    private Integer existenciaXL;
    
    @Column(name = "TOTAL")
    private Integer existenciaTotal;
                

    public Producto() {
    }

    public Producto(Long ref) {
        this.referencia = ref;
    }

    public Producto(Long referencia, String descripcion, Integer precioUnidad, 
                    Integer precioDocena, Integer precioMayor, 
                    Integer existenciaS, Integer existenciaM, 
                    Integer existenciaL, Integer existenciaXL, 
                    Integer existenciatotal) {
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.precioUnidad = precioUnidad;
        this.precioDocena = precioDocena;
        this.precioMayor = precioMayor;
        this.existenciaS = existenciaS;
        this.existenciaM = existenciaM;
        this.existenciaL = existenciaL;
        this.existenciaXL = existenciaXL;
        this.existenciaTotal = existenciatotal;
    }
    
    


    public Long getRef() {
        return referencia;
    }

    public void setRef(Long ref) {
        this.referencia = ref;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Integer precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Integer getPrecioDocena() {
        return precioDocena;
    }

    public void setPrecioDocena(Integer precioDocena) {
        this.precioDocena = precioDocena;
    }

    public Integer getPrecioMayor() {
        return precioMayor;
    }

    public void setPrecioMayor(Integer precioMayor) {
        this.precioMayor = precioMayor;
    }

    public Integer getExistenciaS() {
        return existenciaS;
    }

    public void setExistenciaS(Integer existenciaS) {
        this.existenciaS = existenciaS;
    }

    public Integer getExistenciaM() {
        return existenciaM;
    }

    public void setExistenciaM(Integer existenciaM) {
        this.existenciaM = existenciaM;
    }

    public Integer getExistenciaL() {
        return existenciaL;
    }

    public void setExistenciaL(Integer existenciaL) {
        this.existenciaL = existenciaL;
    }

    public Integer getExistenciaXL() {
        return existenciaXL;
    }

    public void setExistenciaXL(Integer existenciaXL) {
        this.existenciaXL = existenciaXL;
    }

    public Integer getExistenciaTotal() {
        return existenciaTotal;
    }

    public void setExistenciaTotal(Integer existenciatotal) {
        this.existenciaTotal = existenciatotal;
    }
    
    
    
}
