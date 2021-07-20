/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

import java.time.LocalDate;
import java.time.ZoneId;





/**
 *
 * @author USER
 */
public class Pedido_Cliente {
    private int COD_PEDIDO;
    private LocalDate FECHA = LocalDate.now();
    private String METODO_DE_PAGO;
    private int DNI;
    private int COD_EMPLEADO;
    private static int contador=1;
    private int totalpedido;

    public Pedido_Cliente(String METODO_DE_PAGO, int DNI, int COD_EMPLEADO) {
        this.COD_PEDIDO = contador;
        this.METODO_DE_PAGO = METODO_DE_PAGO;
        this.DNI = DNI;
        this.COD_EMPLEADO = COD_EMPLEADO;
        this.FECHA= LocalDate.now(ZoneId.of("America/Montreal"));
        contador++;
    }

    public int getCOD_PEDIDO() {
        return COD_PEDIDO;
    }

    public void setCOD_PEDIDO(int COD_PEDIDO) {
        this.COD_PEDIDO = COD_PEDIDO;
    }

 

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pedido_Cliente.contador = contador;
    }

    public LocalDate getFECHA() {
        return FECHA;
    }

    public void setFECHA(LocalDate FECHA) {
        this.FECHA = FECHA;
    }

  

    public String getMETODO_DE_PAGO() {
        return METODO_DE_PAGO;
    }

    public void setMETODO_DE_PAGO(String METODO_DE_PAGO) {
        this.METODO_DE_PAGO = METODO_DE_PAGO;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCOD_EMPLEADO() {
        return COD_EMPLEADO;
    }

    public void setCOD_EMPLEADO(int COD_EMPLEADO) {
        this.COD_EMPLEADO = COD_EMPLEADO;
    }
   
}
