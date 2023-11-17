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
public class Estante{
    private int piso = 0;
    private int pasillo = 0;

    public Estante(int piso, int pasillo) {
        this.piso = piso;
        this.pasillo = pasillo;
    }

    public int getPiso() {
        return piso;
    }

    public int getPasillo() {
        return pasillo;
    }
}
