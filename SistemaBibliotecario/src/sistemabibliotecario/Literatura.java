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
public class Literatura extends Libro{
    private String genero = "";

    public Literatura(int piso, int pasillo, String anio, String autor, String titulo, int ID, String genero) {
        super(piso, pasillo, anio, autor, titulo, ID);
        this.genero = genero;
    }
    
    public String getGenero() {
        return genero;
    }
    
    @Override
    public String mostrar() {
        String x = "Titulo: " + getTitulo() + 
                "\nAutor: " + getAutor() + 
                "\nAño: " + getAnio() + 
                "\nGénero: " + getGenero() + 
                "\nID: " + getID() + 
                "\nPiso: " + getPiso() + 
                "\nPasillo: " + getPasillo() + "\n";
        
        return x;
    }
}
