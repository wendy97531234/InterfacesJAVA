/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;
import Interfaces_modelos.*;
import java.util.Arrays;

/**
 *
 * @author Danya
 */
public class Main {
     public static void main(String[] args) {
        // Pruebas de Animales
        Perro perro = new Perro();
        Gato gato = new Gato();
        perro.hacerSonido();
        perro.mover();
        gato.hacerSonido();
        gato.mover();
        
         // Pruebas de Vehiculos
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();
        coche.arrancar();
        coche.detener();
        bicicleta.arrancar();
        bicicleta.detener();
        
          // Pruebas de Pagos
        Pago pagoTarjeta = new PagoConTarjeta();
        Pago pagoEfectivo = new PagoConEfectivo();
        pagoTarjeta.procesarPago(1000);
        pagoEfectivo.procesarPago(500);
        
        // Pruebas de Figuras Geométricas
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4,6);
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Perímetro del rectángulo: " + rectangulo.perimetro());
        
        // Crear instancias de Desarrollador y Diseñador
        Trabajador desarrollador = new Desarrollador();
        Trabajador diseñador = new Diseñador();
        desarrollador.trabajar();
        diseñador.trabajar();
        
         // Pruebas de Ordenamiento
        ListaNumeros lista = new ListaNumeros();
        lista.ordenar(Arrays.asList(10012, 655411, 6589, 8512, 531249));
}}
