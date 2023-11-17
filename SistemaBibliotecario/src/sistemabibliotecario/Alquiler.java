/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

/**
 *
 * @author edwar
 */
public class Alquiler {
    private String fecha = "";
    private String divisa = "";
    private float precio = 0;

    public Alquiler(String fecha, String divisa, float precio) {
        this.fecha = fecha;
        this.divisa = divisa;
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDivisa() {
        return divisa;
    }

    public float getPrecio() {
        return precio;
    }
}
