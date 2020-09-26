
package modelo;


public class Producto {
    private int IDPRO;
    private String NOMPRO;
    private String TIPPRO;
    private double PREPRO;
    
    
    public Producto(int IDPRO, String NOMPRO, String TIPPRO, double PREPRO) {
        this.IDPRO = IDPRO;
        this.NOMPRO = NOMPRO;
        this.TIPPRO = TIPPRO;
        this.PREPRO = PREPRO;
    }

    public Producto() {
    }
    

    public int getIDPRO() {
        return IDPRO;
    }

    public void setIDPRO(int IDPRO) {
        this.IDPRO = IDPRO;
    }

    public String getNOMPRO() {
        return NOMPRO;
    }

    public void setNOMPRO(String NOMPRO) {
        this.NOMPRO = NOMPRO;
    }

    public String getTIPPRO() {
        return TIPPRO;
    }

    public void setTIPPRO(String TIPPRO) {
        this.TIPPRO = TIPPRO;
    }

    public double getPREPRO() {
        return PREPRO;
    }

    public void setPREPRO(double PREPRO) {
        this.PREPRO = PREPRO;
    }
}
