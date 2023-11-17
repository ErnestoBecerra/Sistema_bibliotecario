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
public class Enciclopedia extends Libro{
    private String tipo = "";

    public Enciclopedia(int piso, int pasillo, String anio, String autor, String titulo, int ID, String tipo) {
        super(piso, pasillo, anio, autor, titulo, ID);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    @Override
    public String mostrar() {
        String x = "Titulo: " + getTitulo() + 
                "\nAutor: " + getAutor() + 
                "\nAño: " + getAnio() + 
                "\nTipo: " + getTipo() + 
                "\nID: " + getID() + 
                "\nPiso: " + getPiso() + 
                "\nPasillo: " + getPasillo() + "\n";
        
        return x;
    }
}
