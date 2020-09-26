package modelo;

public class Empleado {
    private int IDEMP;
    private String NOMEMP;
    private String APEEMP;
    private String DNIEMP;
    private String TELEMP;
    private String DIREMP;
    private String SUCUREMP;
    
   public Empleado(int IDEMP, String NOMEMP, String APEEMP, String DNIEMP, String TELEMP, String DIREMP, String SUCUREMP) {
        this.IDEMP = IDEMP;
        this.NOMEMP = NOMEMP;
        this.APEEMP = APEEMP;
        this.DNIEMP = DNIEMP;
        this.TELEMP = TELEMP;
        this.DIREMP = DIREMP;
        this.SUCUREMP = SUCUREMP;
    }
   
    public int getIDEMP() {
        return IDEMP;
    }

    public void setIDEMP(int IDEMP) {
        this.IDEMP = IDEMP;
    }

    public String getNOMEMP() {
        return NOMEMP;
    }

    public void setNOMEMP(String NOMEMP) {
        this.NOMEMP = NOMEMP;
    }

    public String getAPEEMP() {
        return APEEMP;
    }

    public void setAPEEMP(String APEEMP) {
        this.APEEMP = APEEMP;
    }

    public String getDNIEMP() {
        return DNIEMP;
    }

    public void setDNIEMP(String DNIEMP) {
        this.DNIEMP = DNIEMP;
    }

    public String getTELEMP() {
        return TELEMP;
    }

    public void setTELEMP(String TELEMP) {
        this.TELEMP = TELEMP;
    }

    public String getDIREMP() {
        return DIREMP;
    }

    public void setDIREMP(String DIREMP) {
        this.DIREMP = DIREMP;
    }

    public String getSUCUREMP() {
        return SUCUREMP;
    }

    public void setSUCUREMP(String SUCUREMP) {
        this.SUCUREMP = SUCUREMP;
    }
    
}
