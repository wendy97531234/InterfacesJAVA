/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_modelos;

/**
 *
 * @author Danya
 */
public class Circulo implements FiguraGeometrica {
    private double radio;
    public Circulo(double radio) { this.radio = radio; }
    @Override
    public double area() { return Math.PI * radio * radio;}
    @Override
    public double perimetro() {return 2 * Math.PI * radio;    }   
}
