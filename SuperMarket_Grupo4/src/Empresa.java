/**
 * @author: Jhair Zambrano
 */
        // QUE PROCESO DESEA REALIZAR EJ: Comprar

        // CREAR PROCESO PARA DETERMINAR QUE TIPO DE CLIENTE ES EL USUARIO
public class Empresa {

    private String nombreEmpresa;
    private String numTelefonico;
    private int ident;

    String red = "\033[31m", reset = "\u001B[0m";

    
    public Empresa(String nombreEmpresa, String numTelefonico, int ident){
        this.nombreEmpresa = nombreEmpresa;
        this.numTelefonico = numTelefonico;
        this.ident = ident;
    }
    
    //NOMBRE DE LA EMPRESA
    public String getNombreEmpresa() {

        return nombreEmpresa.toUpperCase();
    }

    public void setNombreEmpresa(String nombreEmpresa) {

        if (nombreEmpresa.length() <= 13) {
            this.nombreEmpresa = nombreEmpresa.toUpperCase();
        } else {
            System.out.println(red + "Su nombre se ha recortado a los primeros 13 caracteres permitidos por la SCVS" + reset);
            this.nombreEmpresa = nombreEmpresa.substring(0, 12).toUpperCase();
        }
    }
    
    //NUMERO TELEFONICO
    public String getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(String numTelefonico) {
        if (numTelefonico.length() <= 8) {
            this.numTelefonico = numTelefonico;
        } else {
            System.out.println(red + "El numero de telefono que usted ingreso fue recortado ha los primeros 7" + reset);
            this.numTelefonico = numTelefonico.substring(0, 7);
        }
    }

    //IDENTIFICADOR DE EMPRESA
    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }




}
