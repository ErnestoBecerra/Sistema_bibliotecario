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
public class Tesis extends Libro{
    private String categoria = "";
    private String area = "";

    public Tesis(int piso, int pasillo, String anio, String autor, String titulo, int ID, String categoria, String area) {
        super(piso, pasillo, anio, autor, titulo, ID);
        this.categoria = categoria;
        this.area = area;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getArea() {
        return area;
    }
    
    
    public String mostrar() {
        String x = "Titulo: " + getTitulo() + 
                "\nAutor: " + getAutor() + 
                "\nAño: " + getAnio() + 
                "\nCategoria: " + getCategoria() + 
                "\nArea: " + getArea() + 
                "\nID: " + getID() + 
                "\nPiso: " + getPiso() + 
                "\nPasillo: " + getPasillo() + "\n";
        
        return x;
    }
}
