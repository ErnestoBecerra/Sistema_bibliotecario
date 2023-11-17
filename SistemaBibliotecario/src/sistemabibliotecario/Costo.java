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
public class Costo {
    private String Divisas;
    private Double Precio;

    public Costo(String Divisas, String Año, String Mes, String Dia, Double Precio) {
        this.Divisas = Divisas;
        this.Precio = Precio;
    }

    public Costo(String Divisas, String Dia, Double Precio) {
        this.Divisas = Divisas;
        this.Precio = Precio;
    }

    public void setDivisas(String Divisas) {
        if(Divisas.length()<5)this.Divisas = Divisas;
        else System.out.println("Cadena muy grande");
     
     }


    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }
    
    public String getDivisas() {
        return Divisas;
    }



    public Double getPrecio() {
        return Precio;
    }
}
