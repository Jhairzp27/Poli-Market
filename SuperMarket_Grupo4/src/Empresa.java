/**
 * @author: Jhair Zambrano
 */
        // QUE PROCESO DESEA REALIZAR EJ: Comprar

        // CREAR PROCESO PARA DETERMINAR QUE TIPO DE CLIENTE ES EL USUARIO
public class Empresa {

    private String nombreEmpresa;
    private String numTelefonico;
    private String ident;

    String red = "\033[31m", reset = "\u001B[0m";

    
    public Empresa(String nombreEmpresa, String numTelefonico, String ident){
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
        if (numTelefonico.length() == 7 ) {
            this.numTelefonico = numTelefonico;
        }else if (numTelefonico.length() < 7) {
            System.out.println(red + "Numero de telefono invalido, recuerde que debe tener 7 digitos. \n Se la asignara un numero telefonico por defecto" + reset);
        } else if(numTelefonico.length() > 7){
            System.out.println(red + "El numero de telefono que usted ingreso fue recortado ha los primeros 7" + reset);
            this.numTelefonico = numTelefonico.substring(0, 7);
        }
    }
    
    

    //IDENTIFICADOR DE EMPRESA
    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        char tercerDigito = ident.charAt(2);
        if (ident.length() == 13 &  Character.toString(tercerDigito).equals("9")) {
            this.ident = ident;
        } else if(ident.length() > 13 & Character.toString(tercerDigito).equals("9")){
            System.out.println(red + "El RUC ingresado ha sido recortado a los primeros 13 terminos" + reset);
            this.ident = ident.substring(0, 13);
        }else if(ident.length() < 13 & Character.toString(tercerDigito).equals("9")){
            System.out.println(red + "El RUC ingresado es menor a la cantidad minima de 13 caracteres, se le asiganara un RUC por defecto"+reset);
        }else{
            System.out.println(red+"RUC invalido, recuerde que el tercer digito debe ser un 9 por la SCVSS, se le asignara un RUC por defecto"+ reset);
        }
    }




}
