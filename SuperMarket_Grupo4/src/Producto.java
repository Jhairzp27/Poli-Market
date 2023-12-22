/**
 * Copyright (C) 2023, Christian Pisco
 * (CodeCrew) christian.pisco@epn.edu.ec
 * Version 1.0
 */

public class Producto {
    private int idProducto;
    private String codigoProducto;
    private String nombreProducto;
    private float precioCompra;
    private float precioVentaAlPublico;

    public Producto(int idProducto, String codigoProducto, String nombreProducto, float precioCompra, float precioVentaAlPublico) {
        this.idProducto = idProducto;
        this.setCodigoProducto(codigoProducto);
        this.setNombreProducto(nombreProducto);
        this.setPrecioCompra(precioCompra);
        this.setPrecioVentaAlPublico(precioVentaAlPublico);
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        if (codigoProducto != null && !codigoProducto.isEmpty())
            this.codigoProducto = codigoProducto;
        else
            System.out.println("Error: Código de producto no válido");
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        if (nombreProducto != null && !nombreProducto.isEmpty())
            this.nombreProducto = nombreProducto;
        else
            System.out.println("Error: Nombre de producto no válido");
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        if (precioCompra >= 0)
            this.precioCompra = precioCompra;
        else
            System.out.println("Error: Precio de compra no válido");
    }

    public float getPrecioVentaAlPublico() {
        return precioVentaAlPublico;
    }

    public void setPrecioVentaAlPublico(float precioVentaAlPublico) {
        if (precioVentaAlPublico >= 0)
            this.precioVentaAlPublico = precioVentaAlPublico;
        else
            System.out.println("Error: Precio de venta al público no válido");
    }
}
