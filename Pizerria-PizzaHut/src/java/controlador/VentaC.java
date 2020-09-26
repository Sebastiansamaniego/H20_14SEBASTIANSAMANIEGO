package controlador;

import dao.VentaImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import modelo.Venta;

@Named(value = "ventaC")
@SessionScoped
public class VentaC implements  Serializable{
    private Venta Venta;
    private List<Venta> lstVenta;
    private VentaImpl dao;
    
    public VentaC() {
    Venta = new Venta();
    lstVenta = new ArrayList<>();
    dao = new VentaImpl();
    }
    
 public void agregar(){
     try {
       Venta v = dao.obtenerdatos(Venta.getIDPRO());
         System.out.println("Obtener datos" + v);
         
       v.setCANTVENT(Venta.getCANTVENT());
       v.setNOMPRO(v.getProducto().getNOMPRO());
       
      lstVenta.add(v);
       
     } catch (Exception e) {
         System.out.println("Error en agregar" + e.getMessage());
     }
 }
 public void listar(){
     try {
       
     } catch (Exception e) {
         System.out.println("Error en listar" + e.getMessage());
     }
 }

 public void eliminar(Venta v){
     try {
         lstVenta.remove(v);
     } catch (Exception e) {
         System.out.println("Error en eliminar" + e.getMessage());
     }
 }

 
 
    public Venta getVenta() {
        return Venta;
    }

    public void setVenta(Venta Venta) {
        this.Venta = Venta;
    }

    public List<Venta> getLstVenta() {
        return lstVenta;
    }

    public void setLstVenta(List<Venta> lstVenta) {
        this.lstVenta = lstVenta;
    }

    public VentaImpl getDao() {
        return dao;
    }

    public void setDao(VentaImpl dao) {
        this.dao = dao;
    }
    
}


