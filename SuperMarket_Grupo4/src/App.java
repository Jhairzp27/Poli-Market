public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
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

    }
}
