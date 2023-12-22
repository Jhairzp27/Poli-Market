public class Persona_Juridica extends Cliente{
    private String ruc;
    private String tipoPersonaJuridica;
    private String representanteLegal;
    private String sitioWeb;

    public String getSitioWeb() {
        return sitioWeb;
    }
    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
    public String getRepresentanteLegal() {
        return representanteLegal;
    }
    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }
    public String getTipoPersonaJuridica() {
        return tipoPersonaJuridica;
    }
    public void setTipoPersonaJuridica(String tipoPersonaJuridica) {
        this.tipoPersonaJuridica = tipoPersonaJuridica;
    }
    public String getRuc() {
        return ruc;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Persona_Juridica(String id, String nombreEmpresa, String direccion, String nroTelefono, String eMail, 
                            String ruc, String tipoPersonaJuridica, String representanteLegal, String sitioWeb){
        super();
        setId           (id);
        setNombre       (nombreEmpresa);
        setDireccion    (direccion);
        setNroTelefonico(nroTelefono);
        seteMail        (eMail);
        this.ruc                 = ruc;
        this.tipoPersonaJuridica = tipoPersonaJuridica;
        this.representanteLegal  = representanteLegal;
        this.sitioWeb            = sitioWeb;
    }
}
