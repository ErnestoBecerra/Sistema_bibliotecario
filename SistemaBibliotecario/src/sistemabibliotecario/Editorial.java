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
public class Editorial {
    private String calle = "";
    private String cp = "";
    private String ciudad ="";
    private String pais = "";
    private String correo = "";
    private String telefono = "";

    public Editorial(String calle, String cp, String ciudad, String pais, String correo, String telefono) {
        this.calle = calle;
        this.cp = cp;
        this.ciudad = ciudad;
        this.pais = pais;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public String getCp() {
        return cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
}
