package modelo;


public class Cliente {
    private int IDCL;
    private String NOMCL;
    private String APECL;
    private String DNICL;
    private String DIRCL;
    private String TELCL;
    private int IDUBIG;
    
        public Cliente(int IDCL, String NOMCL, String APECL, String DNICL, String DIRCL, String TELCL, int IDUBIG) {
        this.IDCL = IDCL;
        this.NOMCL = NOMCL;
        this.APECL = APECL;
        this.DNICL = DNICL;
        this.DIRCL = DIRCL;
        this.TELCL = TELCL;
        this.IDUBIG = IDUBIG;
    }
  
   public Cliente() {
    }
   
    public int getIDCL() {
        return IDCL;
    }

    public void setIDCL(int IDCL) {
        this.IDCL = IDCL;
    }

    public String getNOMCL() {
        return NOMCL;
    }

    public void setNOMCL(String NOMCL) {
        this.NOMCL = NOMCL;
    }

    public String getAPECL() {
        return APECL;
    }

    public void setAPECL(String APECL) {
        this.APECL = APECL;
    }
    public String getDNICL() {
        return DNICL;
    }

    public void setDNICL(String DNI) {
        this.DNICL = DNICL;
    }

    public String getDIRCL() {
        return DIRCL;
    }

    public void setDIRCL(String DIRCL) {
        this.DIRCL = DIRCL;
    }

    public String getTELCL() {
        return TELCL;
    }

    public void setTELCL(String TELCL) {
        this.TELCL = TELCL;
    }

    public int getIDUBIG() {
        return IDUBIG;
    }

    public void setIDUBIG(int IDUBIG) {
        this.IDUBIG = IDUBIG;
    }
}
