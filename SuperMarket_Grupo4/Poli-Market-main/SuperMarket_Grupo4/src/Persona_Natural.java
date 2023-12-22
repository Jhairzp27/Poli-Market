public class Persona_Natural extends Cliente {
    private String apellido;
    private String ci;
    private String fechaNacimiento;
    private String nacionalidad;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        StringBuilder apellidoValido = new StringBuilder();
        int longitudMaxima = 20; // Máximo de caracteres permitidos para el apellido

        // Validar y ajustar el apellido
        for (char c : apellido.toCharArray()) {
        // Verificar si el carácter es una letra y si la longitud no excede el límite
        if (Character.isLetter(c) && apellidoValido.length() < longitudMaxima) {
            apellidoValido.append(c); // Agregar letras válidas al StringBuilder
        }
     }

        this.apellido = apellidoValido.toString();
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        StringBuilder cedulaValida = new StringBuilder();
        int longitudMaxima = 10; // Longitud máxima permitida para la cédula
    
        // Validar y ajustar la cédula
        for (char c : ci.toCharArray()) {
            // Verificar si el carácter es un dígito y si la longitud no excede el límite
            if (Character.isDigit(c) && cedulaValida.length() < longitudMaxima) {
                cedulaValida.append(c); // Agregar dígitos válidos al StringBuilder
            }
        }
            this.ci = cedulaValida.toString();
        
    }

    public String getfechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(String fechaNacimiento) {
        StringBuilder fechaValida = new StringBuilder();
    int longitudEsperada = 8; // Longitud esperada para la fecha de nacimiento (DDMMAAAA)

    // Validar y ajustar la fecha de nacimiento
    for (char c : fechaNacimiento.toCharArray()) {
        // Verificar si el carácter es un dígito y si la longitud es la esperada
        if (Character.isDigit(c) && fechaValida.length() < longitudEsperada) {
            fechaValida.append(c); // Agregar dígitos válidos al StringBuilder
        }
    }

    // Verificar que la longitud sea la esperada
    if (fechaValida.length() == longitudEsperada) {
        // Obtener el día, mes y año desde la cadena
        int dia = Integer.parseInt(fechaValida.substring(0, 2));
        int mes = Integer.parseInt(fechaValida.substring(2, 4));
        int anio = Integer.parseInt(fechaValida.substring(4));

        // Validar día (hasta 31), mes (hasta 12) y año (menor a 2023)
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && anio < 2023) {
            // Reconstruir la fecha en el formato deseado: DDMMAAAA
            String fechaFormateada = String.format("%02d%02d%04d", dia, mes, anio);
            this.fechaNacimiento = fechaFormateada;
        }
    }
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        StringBuilder nacionalidadValida = new StringBuilder();
        int longitudMaxima = 20; // Longitud máxima permitida para la nacionalidad
    
        // Validar y ajustar la nacionalidad
        for (char c : nacionalidad.toCharArray()) {
            // Verificar si el carácter es una letra y si la longitud no excede el límite
            if (Character.isLetter(c) && nacionalidadValida.length() < longitudMaxima) {
                nacionalidadValida.append(c); // Agregar letras válidas al StringBuilder
            }
        }
    
        this.nacionalidad = nacionalidadValida.toString();
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
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;

    }
}