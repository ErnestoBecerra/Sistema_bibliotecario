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
public class Libro extends Estante{
    private String anio = "";
    private String autor = "";
    private String titulo = "";
    private int ID = 0;

    public Libro(int piso, int pasillo, String anio, String autor, String titulo, int ID) {
        super(piso, pasillo);
        this.anio = anio;
        this.autor = autor;
        this.titulo = titulo;
        this.ID = ID;
    }

    public String getAnio() {
        return anio;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getID() {
        return ID;
    }
    
    public String mostrar() {
        String x = "Titulo: " + getTitulo() + 
                "\nAutor: " + getAutor() + 
                "\nAño: " + getAnio() + 
                "\nID: " + getID() + 
                "\nPiso: " + getPiso() + 
                "\nPasillo: " + getPasillo() + "\n";
        
        return x;
    }
}
