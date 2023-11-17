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
public class Comics extends Libro{
    private String productora = "";
    private String heroe = "";

    public Comics(int piso, int pasillo, String anio, String autor, String titulo, int ID, String productora, String heroe) {
        super(piso, pasillo, anio, autor, titulo, ID);
        this.productora = productora;
        this.heroe = heroe;
    }

    public String getProductora() {
        return productora;
    }

    public String getHeroe() {
        return heroe;
    }
    
    @Override
    public String mostrar() {
        String x = "Titulo: " + getTitulo() + 
                "\nAutor: " + getAutor() + 
                "\nAño: " + getAnio() + 
                "\nProductora: " + getProductora() +
                "\nHéroe(s): " + getHeroe() +
                "\nID: " + getID() + 
                "\nPiso: " + getPiso() + 
                "\nPasillo: " + getPasillo() + "\n";
        
        return x;
    }
}
