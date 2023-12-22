public class Persona_Juridica extends Cliente{
    private String ruc;
    private String tipoPersonaJuridica;
    private String representanteLegal;
    
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

    public Persona_Juridica(String id, String nombre, String direccion, String nroTelefono, String eMail, 
                            String ruc, String tipoPersonaJuridica, String representanteLegal){
        super();
        setId           (id);
        setNombre       (nombre);
        setDireccion    (direccion);
        setNroTelefonico(nroTelefono);
        seteMail        (eMail);
        this.ruc =       ruc;
        this.tipoPersonaJuridica = tipoPersonaJuridica;
        this.representanteLegal =  representanteLegal;
    }
}
