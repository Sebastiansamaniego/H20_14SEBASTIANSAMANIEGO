package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Detalle;
import modelo.Cliente;
import modelo.Venta;



public class DetalleImpl extends Conexion {
    
    public Detalle obtenerdatos ( int IDCL, int IDVENT) throws Exception{
   
        Detalle d = null;
        
        
        String sqlcliente = 
               "select IDCL, NOMCL FROM CLIENTE  Where IDCL  = " + IDCL;
        
        String sqlventa = 
                "select IDVENT, CANTVENT,  FROM VENTA Where IDVENT ="+ IDVENT;
               
         try {
             PreparedStatement p1 = this.conectar().prepareStatement(sqlcliente);
             PreparedStatement p2 = this.conectar().prepareStatement(sqlventa);
             
             ResultSet rs1 = p1.executeQuery();
             
             ResultSet rs2 = p2.executeQuery();
            
             
        while ( rs1.next() && rs2.next() ) {
            d = new Detalle();
            
            Cliente cli = new Cliente();
            Venta ven = new Venta();
            
            
            d.setIDCL(rs1.getInt("IDCL"));
            cli.setNOMCL(rs1.getString("NOMCL"));
            d.setCliente(cli);
            d.setIDVENT(rs2.getInt("IDVENT"));
            ven.setCANTVENT(rs2.getInt("CANTVENT"));
            d.setVenta(ven);
              
        }
                
                rs1.close();
                p1.close();
                
                rs2.close();
                p2.close();
                
        } catch (Exception e) {
           System.out.println("Error " + e.getMessage());
        }finally {
            this.desconectar();
         }
         return d;
    }
}