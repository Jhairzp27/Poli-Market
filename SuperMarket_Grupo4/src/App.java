import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String blue = "\u001B[34m", reset = "\u001B[0m", orange = "\u001B[38;5;208m";
        Short opcionMenu = 0;
        String cyan = "\033[36m";
        String yellow = "\033[33m";
        String red = "\033[31m";
        String green = "\033[32m";
        String purple = "\033[35;1m";
        String reingresoMenu = "si";
        Double montoDeConsumo = 0.0;
        Empresa nEmpresa = new Empresa("PoliMarket", "2420626", "1395478962458");
        // Modificacion del nombre de la empresa
        nEmpresa.setNombreEmpresa(
                "Poli Market");
        // Modificacion del nombre de la empresa
        nEmpresa.setNumTelefonico("4536255");
        // Modificacion del nombre de la empresa
        nEmpresa.setIdent("1795482544576");

        System.out.println(orange + "------------+ Bienvenido a: " + nEmpresa.getNombreEmpresa() + " s.a +------------" + reset);
        System.out.println("Numero telefonico: " + nEmpresa.getNumTelefonico());
        System.out.println("RUC: " + nEmpresa.getIdent());
        // QUE PROCESO DESEA REALIZAR EJ: Comprar

        // CREAR PROCESO PARA DETERMINAR QUE TIPO DE CLIENTE ES EL USUARIO
        System.out.println(green + "\n+======= TIPOS DE CLIENTE =======+" + reset);

        // Persona_Juridica - Jhordy Parra
        Persona_Juridica persona_Juridica = new Persona_Juridica("ID2004", "Comercial Shiker", "Av 8 de diciembre",
                "0984146275", "comercial@shiker.com", "1751405678001", "Cooperativa", "Lobazo Gonzalez");
       
        System.out.println(red + "\nINFORMACION DE LA PERSONA JURIDICA: \n" + reset);
        System.out.println(blue + "ID: " + reset + persona_Juridica.getId());
        System.out.println(blue + "Nombre de la Persona Juridica: " + reset + persona_Juridica.getNombre());
        System.out.println(blue + "Dirección: " + reset + persona_Juridica.getDireccion());
        System.out.println(blue + "Numero de Telefono: " + reset + persona_Juridica.getNroTelefonico());
        System.out.println(blue + "Correo: " + reset + persona_Juridica.geteMail());
        System.out.println(blue + "RUC: " + reset + persona_Juridica.getRuc());
        System.out.println(blue + "Tipo de Persona Juridica: " + reset + persona_Juridica.getTipoPersonaJuridica());
        System.out.println(blue + "Representante Legal: " + reset + persona_Juridica.getRepresentanteLegal() + "\n");

        Persona_Natural personaNatural = new Persona_Natural("ID2003", "Carmen", "Zambrano", "Avenida central 321",
                "0978763456", "carmen_sd@gmail.com", "17346718792", "12/31/2003", "Ecuatoriana");

        // PersonaNatural - Isaac Proaño 
        System.out.println(red + "\nINFORMACION DE LA PERSONA NATURAL: \n" + reset);
        System.out.println(blue + "ID: " + reset + personaNatural.getId());
        System.out.println(blue + "Nombre: " + reset + personaNatural.getNombre());
        System.out.println(blue + "Apellido: " + reset + personaNatural.getApellido());
        System.out.println(blue + "Direccion: " + reset + personaNatural.getDireccion());
        System.out.println(blue + "Numero de Telefono: " + reset + personaNatural.getNroTelefonico());
        System.out.println(blue + "Correo: " + reset + personaNatural.geteMail());
        System.out.println(blue + "Cedula: " + reset + personaNatural.getCi());
        System.out.println(blue + "Fecha de Nacimiento: " + reset + personaNatural.getfechaNacimiento());
        System.out.println(blue + "Nacionalidad: " + reset + personaNatural.getNacionalidad());
        
        System.out.println(" ");
        // Producto - Christian Pisco
        Producto producto1 = new Producto(1, "P001", "Leche Descremada 1L", 1.5f, 2.0f);
        Producto producto2 = new Producto(2, "P002", "Arroz Integral 1kg", 1.8f, 3.5f);
        Producto producto3 = new Producto(3, "P003", "Manzanas (kg)", 2.0f, 4.0f);

        // Mostrar información de productos
        System.out.println(green + "-- PRODUCTOS --" + reset);

        System.out.println("Producto 1:");
        System.out.println(blue + "ID: " + reset + producto1.getIdProducto());
        System.out.println(blue + "Código: " + reset + producto1.getCodigoProducto());
        System.out.println(blue + "Nombre: " + reset + producto1.getNombreProducto());
        System.out.println(blue + "Precio de compra: " + reset + "$" + producto1.getPrecioCompra());
        System.out.println(blue + "Precio de venta al público: " + reset + "$" + producto1.getPrecioVentaAlPublico());

        System.out.println("\nProducto 2:");
        System.out.println(blue + "ID: " + reset + producto2.getIdProducto());
        System.out.println(blue + "Código: " + reset + producto2.getCodigoProducto());
        System.out.println(blue + "Nombre: " + reset + producto2.getNombreProducto());
        System.out.println(blue + "Precio de compra: " + reset + "$" + producto2.getPrecioCompra());
        System.out.println(blue + "Precio de venta al público: " + reset + "$" + producto2.getPrecioVentaAlPublico());

        System.out.println("\nProducto 3:");
        System.out.println(blue + "ID: " + reset + producto3.getIdProducto());
        System.out.println(blue + "Código: " + reset + producto3.getCodigoProducto());
        System.out.println(blue + "Nombre: " + reset + producto3.getNombreProducto());
        System.out.println(blue + "Precio de compra: " + reset + "$" + producto3.getPrecioCompra());
        System.out.println(blue + "Precio de venta al público: " + reset + "$" + producto3.getPrecioVentaAlPublico());
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
