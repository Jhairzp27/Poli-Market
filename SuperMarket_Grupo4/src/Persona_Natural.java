public class Persona_Natural extends Cliente {
    private String apellido;
    private String ci;
    private String fechaNaciomiento;
    private String nacionalidad;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getFechaNaciomiento() {
        return fechaNaciomiento;
    }

    public void setFechaNaciomiento(String fechaNaciomiento) {
        this.fechaNaciomiento = fechaNaciomiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Constructor Persona_Natural
    public Persona_Natural(String id, String nombre, String apellido, String direccion, String nroTelefonico, String eMail,
                          String ci, String fechaNacimiento, String nacionalidad) {

        super();
        setId(id);
        setNombre(nombre);
        setDireccion(direccion);
        setNroTelefonico(nroTelefonico);
        seteMail(eMail);
         
        this.apellido = apellido;
        this.ci = ci;
        this.fechaNaciomiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;

    }
}