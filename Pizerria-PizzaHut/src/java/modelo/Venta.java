package modelo;


public class Venta {
    private int IDVENT;
    private int CANTVENT;
    private int IDPRO;
    private Producto producto = new Producto ();
    
    
    public Venta(int IDVENT, int CANTVENT, int IDPRO, Producto producto) {
        this.IDVENT = IDVENT;
        this.CANTVENT = CANTVENT;
        this.IDPRO = IDPRO;
        this.producto = producto;
    }

    public Venta() {
    }
  
 

    public int getIDVENT() {
        return IDVENT;
    }

    public void setIDVENT(int IDVENT) {
        this.IDVENT = IDVENT;
    }

    public int getCANTVENT() {
        return CANTVENT;
    }

    public void setCANTVENT(int CANTVENT) {
        this.CANTVENT = CANTVENT;
    }

    public int getIDPRO() {
        return IDPRO;
    }

    public void setIDPRO(int IDPRO) {
        this.IDPRO = IDPRO;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setNOMPRO(String nompro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
