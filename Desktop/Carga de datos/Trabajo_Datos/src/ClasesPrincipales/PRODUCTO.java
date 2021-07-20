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
public class PRODUCTO {
    private int COD_PRODUCTO;
    private String NOMBRE;
    private String LINEA;
    private int PRECIO_UNITARIO;
    private String TIPO;
    private String TAMAÑO;
    private String MODELO;
    private String COLOR;
    private int COD_ALMACEN;


    public PRODUCTO(int COD_PRODUCTO, String NOMBRE, String LINEA, int PRECIO_UNITARIO, String TIPO, String TAMAÑO, String MODELO, String COLOR, int COD_ALMACEN) {
        this.COD_PRODUCTO = COD_PRODUCTO;
        this.NOMBRE = NOMBRE;
        this.LINEA = LINEA;
        this.PRECIO_UNITARIO = PRECIO_UNITARIO;
        this.TIPO = TIPO;
        this.TAMAÑO = TAMAÑO;
        this.MODELO = MODELO;
        this.COLOR = COLOR;
        this.COD_ALMACEN = COD_ALMACEN;
    }

    public int getCOD_PRODUCTO() {
        return COD_PRODUCTO;
    }

    public void setCOD_PRODUCTO(int COD_PRODUCTO) {
        this.COD_PRODUCTO = COD_PRODUCTO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getLINEA() {
        return LINEA;
    }

    public void setLINEA(String LINEA) {
        this.LINEA = LINEA;
    }

    public int getPRECIO_UNITARIO() {
        return PRECIO_UNITARIO;
    }

    public void setPRECIO_UNITARIO(int PRECIO_UNITARIO) {
        this.PRECIO_UNITARIO = PRECIO_UNITARIO;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getMODELO() {
        return MODELO;
    }

    public void setMODELO(String MODELO) {
        this.MODELO = MODELO;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    public int getCOD_ALMACEN() {
        return COD_ALMACEN;
    }

    public void setCOD_ALMACEN(int COD_ALMACEN) {
        this.COD_ALMACEN = COD_ALMACEN;
    }
    
        
    public String getTAMAÑO() {
        return TAMAÑO;
    }

    public void setTAMAÑO(String TAMAÑO) {
        this.TAMAÑO = TAMAÑO;
    }
    
    
}
