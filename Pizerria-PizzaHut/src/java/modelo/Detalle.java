
package modelo;


public class Detalle {

   private int IDVENDET;
    private int IDVENT;
    private int FECVENDET;
    private int PRECVENDET;
    private int IDCL;
    private int IDEMP;
    private Venta venta = new Venta();
    private Cliente cliente = new Cliente();
    
    
    public Detalle(int IDVENDET, int IDVENT, int FECVENDET, int PRECVENDET, int IDCL, int IDEMP, Venta venta , Cliente cliente) {
        this.IDVENDET = IDVENDET;
        this.IDVENT = IDVENT;
        this.FECVENDET = FECVENDET;
        this.PRECVENDET = PRECVENDET;
        this.IDCL = IDCL;
        this.IDEMP = IDEMP;
        this.venta = venta;
        this.cliente = cliente;
    }

     public Detalle() {
    }

    public int getIDVENDET() {
        return IDVENDET;
    }

    public void setIDVENDET(int IDVENDET) {
        this.IDVENDET = IDVENDET;
    }

    public int getIDVENT() {
        return IDVENT;
    }

    public void setIDVENT(int IDVENT) {
        this.IDVENT = IDVENT;
    }

    public int getFECVENDET() {
        return FECVENDET;
    }

    public void setFECVENDET(int FECVENDET) {
        this.FECVENDET = FECVENDET;
    }

    public int getPRECVENDET() {
        return PRECVENDET;
    }

    public void setPRECVENDET(int PRECVENDET) {
        this.PRECVENDET = PRECVENDET;
    }

    public int getIDCL() {
        return IDCL;
    }

    public void setIDCL(int IDCL) {
        this.IDCL = IDCL;
    }

    public int getIDEMP() {
        return IDEMP;
    }

    public void setIDEMP(int IDEMP) {
        this.IDEMP = IDEMP;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNOMCL(String nomcl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCANTVENT(int cantvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIDPRO(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setProducto(Producto pro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
   