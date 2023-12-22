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
        StringBuilder idValido = new StringBuilder();
    int longitudMaxima = 6; // Longitud máxima permitida para el ID

    // Verificar y ajustar el ID
    if (id.startsWith("ID")) {
        idValido.append("ID"); // Agregar las letras "ID" al principio del ID válido
        // Iterar sobre los caracteres después de "ID" para validar los números
        for (int i = 2; i < id.length(); i++) {
            char c = id.charAt(i);
            // Verificar si el carácter es un dígito y si la longitud no excede el límite
            if (Character.isDigit(c) && idValido.length() < longitudMaxima) {
                idValido.append(c); // Agregar dígitos válidos al StringBuilder
            }
        }
    }

    this.id = idValido.toString();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        StringBuilder nombreValido = new StringBuilder();
        int longitudMaxima = 20; // Máximo de caracteres permitidos para el nombre

        // Validar y ajustar el nombre
        for (char c : nombre.toCharArray()) {
        // Verificar si el carácter es una letra y si la longitud no excede el límite
        if (Character.isLetter(c) && nombreValido.length() < longitudMaxima) {
            nombreValido.append(c); // Agregar letras válidas al StringBuilder
        }
     }

        this.nombre = nombreValido.toString();
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        StringBuilder direccionValida = new StringBuilder();
        int longitudMaxima = 40; // Longitud máxima permitida para la dirección

        // Filtrar y ajustar la dirección
        for (char c : direccion.toCharArray()) {
        // Validar caracteres permitidos y longitud máxima
        if ((Character.isLetterOrDigit(c) || c == ' ' || c == '#' || c == '/' || c == ',' || c == '.') && direccionValida.length() < longitudMaxima) {
            direccionValida.append(c); // Agregar caracteres válidos al StringBuilder
        }
     }

        this.direccion = direccionValida.toString();
    }
    public String getNroTelefonico() {
        return nroTelefonico;
    }
    public void setNroTelefonico(String nroTelefonico) {
        StringBuilder nroValido = new StringBuilder();
        int longitudMaxima = 10; // Máximo de caracteres permitidos para el número telefónico
    
        // Filtrar y ajustar el número telefónico
        for (char c : nroTelefonico.toCharArray()) {
            // Validar caracteres permitidos y longitud máxima
            if (Character.isDigit(c) && nroValido.length() < longitudMaxima) {
                nroValido.append(c); // Agregar dígitos válidos al StringBuilder
            }
        }
    
        this.nroTelefonico = nroValido.toString();
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        StringBuilder eMailValido = new StringBuilder();
        int longitudMaxima = 50; // Longitud máxima permitida para el correo electrónico
    
        // Filtrar y ajustar el correo electrónico
        for (char c : eMail.toCharArray()) {
            // Validar caracteres permitidos y longitud máxima
            if ((Character.isLetterOrDigit(c) || c == '.' || c == '-' || c == '@') && eMailValido.length() < longitudMaxima) {
                eMailValido.append(c); // Agregar caracteres válidos al StringBuilder
            }
        }
    
        this.eMail = eMailValido.toString();
    }
    public void comprar(){

    }
    public void pagar(){

    }
}
