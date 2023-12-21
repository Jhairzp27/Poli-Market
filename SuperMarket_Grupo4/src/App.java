public class App {
    public static void main(String[] args) throws Exception {
        


















        Empresa nEmpresa = new Empresa("PoliMarket", "2420626", 547662);
        // Modificacion del nombre de la empresa
        nEmpresa.setNombreEmpresa("Poli Market");
        // Modificacion del nombre de la empresa
        nEmpresa.setNumTelefonico("453625457");
        // Modificacion del nombre de la empresa
        nEmpresa.setIdent(547892);


        System.out.println("Bienvenido a: " + nEmpresa.getNombreEmpresa() + " s.a");
        System.out.println("Numero telefonico: " + nEmpresa.getNumTelefonico());
        System.out.println("Identificador: " + nEmpresa.getIdent());
        // QUE PROCESO DESEA REALIZAR EJ: Comprar

        // CREAR PROCESO PARA DETERMINAR QUE TIPO DE CLIENTE ES EL USUARIO

    }
}
