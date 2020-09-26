package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;


public class ClienteImpl extends Conexion implements ICrud<Cliente>{
 
    @Override
    public void registrar(Cliente modelo) throws Exception {
        try {
            String sql = "INSERT INTO CLIENTE (NOMCL,APECL,DNICL,DIRCL,TELCL) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMCL());
            ps.setString(2, modelo.getAPECL());
            ps.setString(3, modelo.getDNICL());
            ps.setString(4, modelo.getDIRCL());
            ps.setString(5, modelo.getTELCL());            
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
           System.out.println("error registrar dao: " + e.getMessage());
        } finally {
            this.desconectar();
        }

    }

    @Override
    public void editar(Cliente modelo) throws Exception {
        try {
            String sql = "UPDATE CLIENTE SET NOMCL=?, APECL=? , DNICL =?, DIRCL=?, TELCL=? WHERE IDCL=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMCL());
            ps.setString(2, modelo.getAPECL());
            ps.setString(3, modelo.getDNICL());
            ps.setString(4, modelo.getDIRCL());
            ps.setString(5, modelo.getTELCL());            
            ps.setInt(6,modelo.getIDCL());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void eliminar(Cliente modelo) throws Exception {
        try {
              String sql = "DELETE CLIENTE WHERE IDCL=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDCL());
            ps.executeUpdate();
            ps.clearParameters();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
    }

    @Override
    public List<Cliente> listar() throws Exception {
        List<Cliente> listaCliente = null;
        try {
            String sql = "SELECT * FROM listaCliente";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            listaCliente = new ArrayList<>();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIDCL(rs.getInt("IDCL"));
                c.setNOMCL(rs.getString("NOMPER"));
                c.setAPECL(rs.getString("APEPER"));
                c.setDNICL(rs.getString("APEMATPER"));
                c.setDIRCL(rs.getString("TIPPER"));
                c.setTELCL(rs.getString("DNIPER"));
                c.setIDUBIG(rs.getInt("TELPER"));
              ;
                listaCliente.add(c);
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
        return listaCliente;
    }

    @Override
    public List<Cliente> listar(Cliente modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente obtenerModelo(Cliente modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void crearTablas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
   
    

