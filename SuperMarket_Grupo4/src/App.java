import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String blue = "\u001B[34m", reset = "\u001B[0m";
        Short opcionMenu = 0;
        String cyan = "\033[36m";
        String yellow = "\033[33m";
        String red = "\033[31m";
        String green = "\033[32m";
        String purple = "\033[35;1m";
        String reingresoMenu = "si";
        Double montoDeConsumo = 0.0;
        Empresa nEmpresa = new Empresa("PoliMarket", "2420626", 547662);
        // Modificacion del nombre de la empresa
        nEmpresa.setNombreEmpresa(
                "Poli Market lleve lleve todo a mejor precio, no como en el tuti que le cobran las fundas");
        // Modificacion del nombre de la empresa
        nEmpresa.setNumTelefonico("45362545714859673250");
        // Modificacion del nombre de la empresa
        nEmpresa.setIdent(547892);

        System.out.println("Bienvenido a: " + blue + nEmpresa.getNombreEmpresa() + " s.a" + reset);
        System.out.println("Numero telefonico: " + nEmpresa.getNumTelefonico());
        System.out.println("Identificador: " + nEmpresa.getIdent());
        // QUE PROCESO DESEA REALIZAR EJ: Comprar

        // CREAR PROCESO PARA DETERMINAR QUE TIPO DE CLIENTE ES EL USUARIO
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Ju@ansssssssssssssssssssss");
        cliente1.setDireccion("Calle principal 441");
        cliente1.setNroTelefonico("0978984334");

        Persona_Juridica persona_Juridica = new Persona_Juridica("ID2004", "Comercial Shiker", "Av 8 de diciembre",
                "0984146275", "comercial@shiker.com", "1751405678001", "Cooperativa", "Lobazo Gonzalez");
        System.out.println("\nINFORMACION DE LA PERSONA JURIDICA: \n");
        System.out.println("ID: " + persona_Juridica.getId());
        System.out.println("Nombre: " + persona_Juridica.getNombre());
        System.out.println("Dirección: " + persona_Juridica.getDireccion());
        System.out.println("Numero de Telefono" + persona_Juridica.getNroTelefonico());
        System.out.println("Correo: " + persona_Juridica.geteMail());
        System.out.println("RUC: " + persona_Juridica.getRuc());
        System.out.println("Tipo de Persona Juridica: " + persona_Juridica.getTipoPersonaJuridica());
        System.out.println("Representante Legal: " + persona_Juridica.getRepresentanteLegal() + "\n");

        Persona_Natural persona = new Persona_Natural("ID2003", "Carmen", "Zambrano", "Avenida central 321",
                "0978763456", "carmen_sd@gmail.com", "1734671879", "01/01/2003", "Ecuatoriana");
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
        // Tarjeta

        System.out.println(purple + "....................Bienvenido...................." + reset);
        System.out.println(cyan + "Defina la clave de su tarjeta : " + reset);
        String claveOriginal = sc.nextLine();
        esperarTeclaYLimpiarConsola(sc);
        TarjetaDeCredito oTarjetaDeCredito = new TarjetaDeCredito("Pepito Perez", "master", claveOriginal,
                750, 1000);
        do {
            try {

                do {
                    oTarjetaDeCredito.mostrarMenu();
                    opcionMenu = Short.parseShort(sc.nextLine());
                } while (opcionMenu < 1 || opcionMenu > 8);
            } catch (NumberFormatException e) {
                System.out.println(red + "Ingrese únicamente la opción numérica" + reset);
            }
            switch (opcionMenu) {
                case 1:
                    System.out.println(yellow + "1. Cambiar contraseña" + reset);
                    System.out.println("Ingrese su contrasena actual: ");
                    String claveIngresada = sc.nextLine();
                    System.out.println("Ingrese su nueva contrasena: ");
                    String claveNueva = sc.nextLine();
                    oTarjetaDeCredito.setClave(claveIngresada, claveNueva);
                    break;
                case 2:
                    oTarjetaDeCredito.mostrarCupoParaRetiro();
                    double dineroARetirar = Double.parseDouble(sc.nextLine());
                    oTarjetaDeCredito.retirarDinero(dineroARetirar);
                    break;
                case 3:
                    System.out.println(yellow + "3. Pagar Cuenta" + reset);
                    System.out.println(purple
                            + "Escriba el nombre del servicio que desea pagar: luz, agua, telefono, internet" + reset);
                    String nombreServicio = sc.nextLine();
                    oTarjetaDeCredito.pagarCuenta(montoDeConsumo);
                    break;
                case 4:
                    System.out.println(yellow + "4. Pagar tarjeta" + reset);
                    System.out.println(purple + "Ingrese el monto a pagar: " + reset);
                    double montoPagoTarjeta = Double.parseDouble(sc.nextLine());
                    oTarjetaDeCredito.pagarTarjeta(montoPagoTarjeta);
                    break;
                case 5:
                    System.out.println(yellow + "5. Bloquear Tarjeta" + reset);
                    System.out.println(purple + "Ingrese su clave" + reset);
                    claveIngresada = sc.nextLine();
                    if (oTarjetaDeCredito.getClave(claveIngresada) == true) {
                        oTarjetaDeCredito.bloquearTarjeta();
                    } else {
                        System.out.println(red + "Clave erronea" + reset);
                    }
                    break;
                case 6:
                    System.out.println(yellow + "6. Estado de cuenta" + reset);
                    oTarjetaDeCredito.mostrarEstadoDeCuenta();
                    break;
                case 7:
                    System.out.println(yellow + "7. Consulta de saldos" + reset);
                    oTarjetaDeCredito.mostrarSaldo();
                    break;
                case 8:
                    System.out.println(yellow + "8. Mostrar tarjeta" + reset);
                    System.out.println("Ingrese su clave");
                    claveIngresada = sc.nextLine();
                    if (oTarjetaDeCredito.getClave(claveIngresada) == true) {
                        System.out.println(
                                green + "....................Tarjeta creada con éxito...................." + reset);
                        oTarjetaDeCredito.mostrarTarjetaEnVentana();
                        oTarjetaDeCredito.mostrarTarjetaPorDetras();
                    } else {
                        System.out.println(red + "Clave erronea" + reset);
                    }

                    break;

            }
            System.out.println(purple + "Desea regresar al menu?" + reset);
            reingresoMenu = sc.nextLine();
            esperarTeclaYLimpiarConsola(sc);
        } while (reingresoMenu.toLowerCase().charAt(0) == 's');
        System.out.println(cyan + "--------------------- Gracias por Usar este sistema ---------------------" + reset);
        sc.close();
    }

    public static String seleccionarTipoTarjeta(String tipoTarjeta) {

        return ((tipoTarjeta.toLowerCase().charAt(0) == 'm') ? (tipoTarjeta = "mastercard") : (tipoTarjeta = "VISA"));
    }

    public static void esperarTeclaYLimpiarConsola(Scanner sc) {
        System.out.println("Presiona Enter para continuar...");
        sc.nextLine();
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Error al limpiar la consola: ");
        }
    }
}
