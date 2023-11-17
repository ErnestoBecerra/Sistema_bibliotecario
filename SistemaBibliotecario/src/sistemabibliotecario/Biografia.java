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
public class Biografia extends Libro{
    private String fechaNacimiento;

    public Biografia(String fechaNacimiento, int piso, int pasillo, String anio, String autor, String titulo, int ID) {
        super(piso, pasillo, anio, autor, titulo, ID);
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String mostrar() {
        String x = "Titulo: " + getTitulo() + 
                "\nAutor: " + getAutor() + 
                "\nAño: " + getAnio() + 
                "\nProductora: " + getFechaNacimiento() +
                "\nID: " + getID() + 
                "\nPiso: " + getPiso() + 
                "\nPasillo: " + getPasillo() + "\n";
        
        return x;
    }
}
