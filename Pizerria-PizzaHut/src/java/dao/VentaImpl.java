package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Venta;
import modelo.Producto;


public class VentaImpl extends Conexion {
    
    public Venta obtenerdatos ( int IDPRO ) throws Exception{
   
        Venta v = null;
        
        
        String sqlproducto = 
               "select IDPRO, NOMPRO FROM PRODUCTO  Where IDPRO  = " + IDPRO;
        
       
               
         try {
             PreparedStatement p1 = this.conectar().prepareStatement(sqlproducto);
            
             ResultSet rs1 = p1.executeQuery();
             
            
            
             
        while ( rs1.next()) {
            v = new Venta();
            
            Producto pro = new Producto();
     
            v.setIDPRO(rs1.getInt("IDPRO"));
            pro.setNOMPRO(rs1.getString("NOMPRO"));
            v.setProducto(pro);
           
              
        }
                
                rs1.close();
                p1.close();
                
                
        } catch (Exception e) {
           System.out.println("Error " + e.getMessage());
        }finally {
            this.desconectar();
         }
         return v;
    }
}