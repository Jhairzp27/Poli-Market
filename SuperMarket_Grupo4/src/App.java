public class App {
    public static void main(String[] args) throws Exception {
        
        String blue = "\u001B[34m", reset = "\u001B[0m";

        Empresa nEmpresa = new Empresa("PoliMarket", "2420626", 547662);
        // Modificacion del nombre de la empresa
        nEmpresa.setNombreEmpresa("Poli Market");
        // Modificacion del nombre de la empresa
        nEmpresa.setNumTelefonico("453625457");
        // Modificacion del nombre de la empresa
        nEmpresa.setIdent(547892);


        System.out.println("Bienvenido a: " + blue + nEmpresa.getNombreEmpresa() + " s.a" + reset);
        System.out.println("Numero telefonico: " + nEmpresa.getNumTelefonico() );
        System.out.println("Identificador: " + nEmpresa.getIdent());
        // QUE PROCESO DESEA REALIZAR EJ: Comprar

        // CREAR PROCESO PARA DETERMINAR QUE TIPO DE CLIENTE ES EL USUARIO
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Ju@ansssssssssssssssssssss");
        cliente1.setDireccion("Calle principal 441");
        cliente1.setNroTelefonico("0978984334");

        Persona_Juridica persona_Juridica = new Persona_Juridica("ID2004", "Comercial Shiker", "Av 8 de diciembre", "0984146275", "comercial@shiker.com", "1751405678001", "Cooperativa", "Lobazo Gonzalez");
        System.out.println("\nINFORMACION DE LA PERSONA JURIDICA: \n");
        System.out.println("ID: " + persona_Juridica.getId());
        System.out.println("Nombre: " + persona_Juridica.getNombre());
        System.out.println("Dirección: " + persona_Juridica.getDireccion());
        System.out.println("Numero de Telefono" + persona_Juridica.getNroTelefonico());
        System.out.println("Correo: " + persona_Juridica.geteMail());
        System.out.println("RUC: " + persona_Juridica.getRuc());
        System.out.println("Tipo de Persona Juridica: " + persona_Juridica.getTipoPersonaJuridica());
        System.out.println("Representante Legal: " + persona_Juridica.getRepresentanteLegal() + "\n");

        Persona_Natural persona = new Persona_Natural("ID2003", "Carmen","Zambrano", "Avenida central 321", "0978763456", "carmen_sd@gmail.com", "1734671879", "01/01/2003", "Ecuatoriana");
        persona.setNombre("Isaac");

        System.out.println("INFORMACION DEL CLIENTE: ");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Direccion: " + cliente1.getDireccion());
        System.out.println("Nombre2: " + persona.getNombre());

    }
}
