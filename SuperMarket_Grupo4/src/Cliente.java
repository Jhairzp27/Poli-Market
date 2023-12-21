public class Cliente {
    private String id;
    private String nombre;
    private String direccion;
    private String nroTelefonico;
    private String eMail;          

    public Cliente(){};

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        // Filtrar caracteres no permitidos y ajustar longitud
        StringBuilder nombreValido = new StringBuilder();
        for (char c : nombre.toCharArray()) {
            if (Character.isLetter(c)) {
                nombreValido.append(c);
            }
        }

        // Limitar la longitud a, por ejemplo, 20 caracteres
        if (nombreValido.length() > 20) {
            nombreValido.setLength(20);
            
        }

        this.nombre = nombreValido.toString();
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNroTelefonico() {
        return nroTelefonico;
    }
    public void setNroTelefonico(String nroTelefonico) {
        this.nroTelefonico = nroTelefonico;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public void comprar(){

    }
    public void pagar(){

    }
}
