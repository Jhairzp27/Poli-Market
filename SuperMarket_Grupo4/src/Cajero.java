/* Copyright (C) 2023, ruth rueda
 * CodeCrew, ruth.rueda@epn.edu.ec
 * Versión 1.0
 */
 
public class Cajero {
    private int idCajero;
    private String nombre;
    private String apellido;
    private String turnoDeTrabajo;
    private int numeroDeCaja;
    private int ventasRealizadas;
    private boolean estadoDeCaja;

    public Empresa e;

    public int getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTurnoDeTrabajo() {
        return turnoDeTrabajo;
    }

    public void setTurnoDeTrabajo(String turnoDeTrabajo) {
        this.turnoDeTrabajo = turnoDeTrabajo;
    }

    public int getNumeroDeCaja() {
        return numeroDeCaja;
    }

    public void setNumeroDeCaja(int numeroDeCaja) {
        this.numeroDeCaja = numeroDeCaja;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public boolean isEstadoDeCaja() {
        return estadoDeCaja;
    }

    public void setEstadoDeCaja(boolean estadoDeCaja) {
        this.estadoDeCaja = estadoDeCaja;
    }
}
