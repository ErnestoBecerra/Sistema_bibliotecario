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
public class Registro extends Persona implements Requisito{
    private String telefono;
    private String curp;
    private boolean foto;
    private String ID;

    public Registro(String telefono, String curp, boolean foto, String ID, String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.telefono = telefono;
        this.curp = curp;
        this.foto = foto;
        this.ID = ID;
    }
    
    public void Actualizar(String Curp, String Telefono) {
        this.telefono = Telefono;
        this.curp = Curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCurp() {
        return curp;
    }

    public boolean isFoto() {
        return foto;
    }

    public String getID() {
        return ID;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setFoto(boolean foto) {
        this.foto = foto;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String Vigencia(boolean renovar) {
        String respuesta;
        if(renovar == true)
            return respuesta = "Vigente";
        else
            return respuesta = "Necesita renovar, por favor";
    }

    @Override
    public String Adeudo(boolean adeudo) {
        String respuesta;
        if(adeudo == true)
            return respuesta = "Usted debe $500 pesos(MXN)";
        else
            return respuesta = "Sin adeudos";
    }
}
