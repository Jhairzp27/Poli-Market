
/**
 * Copyright (C) 2023, Sebastian Sarasti y Sebastian Ramos
 * (CodeCrew) sebastian.ramos@epn.edu.ec sebastian.sarasti01@epn.edu.ec
 * Version 1.0
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class TarjetaDeCredito {
    private String nombreApellido;
    private String numeroTarjeta;
    private String codigoSeguridad;
    private String tipoTarjeta;
    private String claveOriginal;

    private double cupo;
    private double sueldo;

    private String red;
    private String purple;
    private String yellow;
    private String cyan;
    private String reset;
    private String green;
    // private int mesCaducidad, anoCaducidad;
    private List<String> estadoDeCuenta = new ArrayList<>();

    // Constructor
    public TarjetaDeCredito(String nombreApellido, String tipoTarjeta, String claveOriginal, double cupo,
            double sueldo) {
        this.nombreApellido = nombreApellido;
        numeroTarjeta = "" + (1000 + (int) (Math.random() * 9000)) + " " + (1000 + (int) (Math.random() * 9000)) + " "
                + (1000 + (int) (Math.random() * 9000))
                + " " + (1000 + (int) (Math.random() * 9000));
        codigoSeguridad = "" + (100 + (int) (Math.random() * 900));
        this.tipoTarjeta = tipoTarjeta;
        this.cupo = cupo;
        this.sueldo = sueldo;
        this.claveOriginal = encriptarMD5(claveOriginal);
        red = "\033[31m";
        purple = "\033[35;1m";
        yellow = "\033[33m";
        cyan = "\033[36m";
        reset = "\u001B[0m";
        green = "\033[32m";
    }

    public String getClaveOriginal() {
        return claveOriginal;
    }

    public void setClaveOriginal(String claveOriginal) {
        this.claveOriginal = claveOriginal;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public double getCupo() {
        return cupo;
    }

    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setClave(String claveIngresada, String claveNueva) {
        if (getClave(claveIngresada) == true) {
            setClaveOriginal(encriptarMD5(claveNueva));
            System.out.println((green + "Clave reestablecida" + reset));
        } else {
            System.out.println(red + "Clave erronea" + reset);
        }
    }

    public boolean getClave(String claveIngresada) {
        String claveIngresadaEncriptada = encriptarMD5(claveIngresada);
        return claveIngresadaEncriptada.equals(claveOriginal) ? true : false;
    }

    public void mostrarTarjetaEnVentana() {
        JFrame frame = new JFrame("Información de la Tarjeta");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cambiado a DISPOSE_ON_CLOSE
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        JLabel bancoLabel = new JLabel("<html>Banco<br>Guayaquil</html>");
        JLabel tipoTarjetaLabel = new JLabel("Tarjeta de " + tipoTarjeta);
        JLabel numeroTarjetaLabel = new JLabel("Número de Tarjeta: " + numeroTarjeta);
        JLabel fechaExpLabel = new JLabel("Fecha de Expiración: 02/26");
        JLabel nombreUsuarioLabel = new JLabel("Nombre: " + nombreApellido);

        // Establecer el color personalizado para el texto de las etiquetas
        Color miColor = new Color(137, 21, 158);
        bancoLabel.setForeground(miColor);
        tipoTarjetaLabel.setForeground(miColor);
        numeroTarjetaLabel.setForeground(miColor);
        fechaExpLabel.setForeground(miColor);
        nombreUsuarioLabel.setForeground(miColor);

        panel.add(bancoLabel);
        panel.add(tipoTarjetaLabel);
        panel.add(numeroTarjetaLabel);
        panel.add(fechaExpLabel);
        panel.add(nombreUsuarioLabel);

        frame.add(panel);
        frame.setVisible(true);
    }

    public void mostrarTarjetaPorDetras() {
        JFrame frame = new JFrame("Información de la Tarjeta - Detrás");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cambiado a DISPOSE_ON_CLOSE
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel textoBanco = new JLabel("Esta tarjeta es propiedad de Banco Guayaquil S.A");
        JLabel barraArriba = new JLabel("_________________________________________________");
        JLabel barraAbajo = new JLabel("_______________________________________________");
        JLabel codigoDeSeguridad = new JLabel("Código de Seguridad: " + codigoSeguridad); // Mostrar el código de
                                                                                          // seguridad
        JLabel textoInformacion = new JLabel(
                "<html>El uso de esta tarjeta está sujeto a los términos del contrato suscrito con Banco Guayaquil.<html>");

        // Establecer el color personalizado para el texto de las etiquetas
        Color miColor = new Color(137, 21, 158);
        textoBanco.setForeground(miColor);
        codigoDeSeguridad.setForeground(miColor);
        textoInformacion.setForeground(miColor);

        panel.add(textoBanco);
        panel.add(barraArriba);
        panel.add(barraAbajo);
        panel.add(codigoDeSeguridad);
        panel.add(textoInformacion);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("Nombre Apellido", "Crédito", "1234", 5000, 2000);
        tarjeta.mostrarTarjetaEnVentana();
    }

    public void mostrarMenu() {
        System.out.println(cyan + "....................MENU...................." + reset);
        System.out.println(purple + "Digite unicamente el número de la opcion que desea: ");
        System.out.println("1. Cambiar contraseña");
        System.out.println("2. Hacer un retiro");
        System.out.println("3. Pagar Cuenta");
        System.out.println("4. Pagar tarjeta");
        System.out.println("5. Bloquear Tarjeta");
        System.out.println("6. Estado de cuenta");
        System.out.println("7. Consulta de saldo");
        System.out.println("8. Mostrar tarjeta" );
        System.out.println("9. Comprar producto"+ reset);
    }

    public String encriptarMD5(String textoAEncriptar) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytesHash = md.digest(textoAEncriptar.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bytesHash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public void mostrarCupoParaRetiro() {
        System.out.println(yellow + "2. Hacer un retiro" + reset);
        System.out.println("Tu cupo actual es de : $" + getCupo());
        System.out.println("Ingrese el valor que desea retirar: ");
    }

    public void retirarDinero(double montoARetirar) {
        if (montoARetirar < getCupo()) {
            System.out.println((green + "Retiro exitoso" + reset));
            estadoDeCuenta.add("Retiro de: $" + montoARetirar);
            setCupo(getCupo() - montoARetirar);
            System.out.println("Saldo actual: $" + getCupo());
        } else {
            System.out.println(red + "No dispone de ese cupo" + reset + " dispone de: $" + getCupo());
        }
    }

    public void pagarCuenta(double montoPago) {
        if (montoPago < cupo) {
            estadoDeCuenta.add("Pago de : $" + montoPago);
            System.out.println((green + "Pago exitoso" + reset));
            setCupo(getCupo() - montoPago);
            System.out.println("Saldo actual: $" + getCupo());
        } else {
            System.out.println(red + "No dispone de ese cupo" + reset + " dispone de: $" + getCupo());
        }
    }

    public void mostrarEstadoDeCuenta() {
        System.out.println(purple + "Historial de Movimientos:" + reset);
        for (int i = 0; i < estadoDeCuenta.size(); i++) {
            System.out.println("#" + (i + 1) + ": " + estadoDeCuenta.get(i));
        }
    }

    public void mostrarSaldo() {
        System.out.println("Su saldo actual es de:" + green + " $" + getCupo() + reset);
        System.out.println("Su efectivo (sueldo disponible) es de: " + green + "$" + getSueldo() + reset);
    }

    public void pagarTarjeta(double montoPagoTarjeta) {
        if (montoPagoTarjeta < getSueldo()) {
            estadoDeCuenta.add("Abono de: $" + montoPagoTarjeta);
            setCupo(getCupo() + montoPagoTarjeta);
            setSueldo(getSueldo() - montoPagoTarjeta);
            System.out.println("Abono exitoso, efectivo actual: $" + green + getSueldo() + reset);
        } else {
            System.out.println(red + "No dispone de ese efectivo" + reset + " dispone de: $" + getSueldo());
        }
    }

    public void bloquearTarjeta() {
        System.out.println(red + "....................Tarjeta bloqueada con éxito...................." + reset);
        setNombreApellido("******* ********");
        setNumeroTarjeta("**** **** **** ****");
        setTipoTarjeta("******");
        setCodigoSeguridad("***");
        mostrarTarjetaEnVentana();
        mostrarTarjetaPorDetras();
    }
}