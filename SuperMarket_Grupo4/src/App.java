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


        Persona_Natural persona = new Persona_Natural("ID2003", "Carmen","Zambrano", "Avenida central 321", "0978763456", "carmen_sd@gmail.com", "1734671879", "01/01/2003", "Ecuatoriana");
        persona.setNombre("Isaac");

        System.out.println("INFORMACION DEL CLIENTE: ");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Direccion: " + cliente1.getDireccion());
        System.out.println("Nombre2: " + persona.getNombre());

        // Producto - Christian Pisco 
        Producto producto1 = new Producto(1, "P001", "Leche Descremada 1L", 1.5f, 2.0f);
        Producto producto2 = new Producto(2, "P002", "Arroz Integral 1kg", 1.8f, 3.5f);
        Producto producto3 = new Producto(3, "P003", "Manzanas (kg)", 2.0f, 4.0f);

        // Mostrar información de productos
        System.out.println("-- PRODUCTOS --");

        System.out.println("Producto 1:");
        System.out.println("ID: " + producto1.getIdProducto());
        System.out.println("Código: " + producto1.getCodigoProducto());
        System.out.println("Nombre: " + producto1.getNombreProducto());
        System.out.println("Precio de compra: $" + producto1.getPrecioCompra());
        System.out.println("Precio de venta al público: $" + producto1.getPrecioVentaAlPublico());

        System.out.println("\nProducto 2:");
        System.out.println("ID: " + producto2.getIdProducto());
        System.out.println("Código: " + producto2.getCodigoProducto());
        System.out.println("Nombre: " + producto2.getNombreProducto());
        System.out.println("Precio de compra: $" + producto2.getPrecioCompra());
        System.out.println("Precio de venta al público: $" + producto2.getPrecioVentaAlPublico());

        System.out.println("\nProducto 3:");
        System.out.println("ID: " + producto3.getIdProducto());
        System.out.println("Código: " + producto3.getCodigoProducto());
        System.out.println("Nombre: " + producto3.getNombreProducto());
        System.out.println("Precio de compra: $" + producto3.getPrecioCompra());
        System.out.println("Precio de venta al público: $" + producto3.getPrecioVentaAlPublico());
    }
}
