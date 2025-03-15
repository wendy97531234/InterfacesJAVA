/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_modelos;

/**
 *
 * @author Danya
 */
public class PagoConEfectivo  implements Pago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pago de " + cantidad + " procesado en efectivo.");
    }
}
