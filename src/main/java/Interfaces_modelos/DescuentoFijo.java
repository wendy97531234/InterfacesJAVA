/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_modelos;

/**
 *
 * @author Danya
 */
public class DescuentoFijo implements Descontable {
    private double cantidad;
    public DescuentoFijo(double cantidad) { this.cantidad = cantidad; }
    @Override
    public double calcularDescuento(double precio) {
        return precio - cantidad;
    }
}
