/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

/**
 *
 * @author USER
 */
public class Cliente {
    int DNI;
    String NOMBRE;
    int NUMERO_CONTACTO;
    String DIRECCION;

    public Cliente(int DNI, String NOMBRE, int NUMERO_CONTACTO, String DIRECCION) {
        this.DNI = DNI;
        this.NOMBRE = NOMBRE;
        this.NUMERO_CONTACTO = NUMERO_CONTACTO;
        this.DIRECCION = DIRECCION;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getNUMERO_CONTACTO() {
        return NUMERO_CONTACTO;
    }

    public void setNUMERO_CONTACTO(int NUMERO_CONTACTO) {
        this.NUMERO_CONTACTO = NUMERO_CONTACTO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }
 
    
}
