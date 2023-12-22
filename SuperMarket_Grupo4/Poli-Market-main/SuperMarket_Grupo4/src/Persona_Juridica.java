/**
 * Copyright (C) 2023, Jhordy Parra
 * (CodeCrew) jhordy.parra@epn.edu.ec
 * Version 1.0
 */
public class Persona_Juridica extends Cliente{
    private String ruc;
    private String tipoPersonaJuridica;
    private String representanteLegal;
    
    public String getRepresentanteLegal() {
        if (!this.representanteLegal.matches(".*\\d.*")) {
            return this.representanteLegal;
        } else {
            System.out.println("\u001B[31mError: Representante Legal no válido.\u001B[0m");
            return "";
        }
    }
    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }
    public String getTipoPersonaJuridica() {
        if (!this.tipoPersonaJuridica.matches(".*\\d.*")) {
            return this.tipoPersonaJuridica;
        } else {
            System.out.println("\u001B[31mError: TipoPersonaJuridica no válido.\u001B[0m");
            return "";
        }
    }
    public void setTipoPersonaJuridica(String tipoPersonaJuridica) {
        this.tipoPersonaJuridica = tipoPersonaJuridica;
    }
    public String getRuc() {
        if (this.ruc.matches("^[0-9]{13}$")) {
            return this.ruc;
        } else {
            System.out.println("\u001B[31mError: El RUC no es valido\u001B[0m");
            return "";
        }
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public String getNroTelefonico() {
        if (super.getNroTelefonico().matches("\\d{10}") && !super.getNroTelefonico().matches(".*\\D.*") && !super.getNroTelefonico().startsWith("-")) {
            return super.getNroTelefonico();
        } else {
            System.out.println("\u001B[31mError: Numero de Telefono no valido.\u001B[0m");
            return "";
        }
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
