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
        
        // Alimentacion 
         Alimentacion persona = new Persona();
        Alimentacion animal = new Alimentanimal();
        persona.comer();  // Salida: La persona está comiendo con cubiertos.
        animal.comer();   // Salida: El animal está comiendo con sus patas.
        
        // Notificaciones 
         Notificable correo = new CorreoElectronico();
        Notificable sms = new SMS();
        
        correo.enviarNotificacion();
        sms.enviarNotificacion();
        
        //Comparacion de productos
        Producto producto1 = new Producto(1000.0);
        Producto producto2 = new Producto(100.0);
        
        int resultado = producto1.comparar(producto2);
        if (resultado < 0) {
            System.out.println("El producto1 es más barato que el producto2.");
        } else if (resultado > 0) {
            System.out.println("El producto1 es más caro que el producto2.");
        } else {
            System.out.println("Ambos productos tienen el mismo precio.");
        }
        
        //Descuento
         Descontable descuentoPorcentaje = new DescuentoPorcentaje(8.8); // 20%
        Descontable descuentoFijo = new DescuentoFijo(30); // $15
        
        double precioOriginal = 100.0;
        
        double precioConDescuentoPorcentaje = descuentoPorcentaje.calcularDescuento(precioOriginal);
        double precioConDescuentoFijo = descuentoFijo.calcularDescuento(precioOriginal);
        
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Precio con descuento porcentaje: " + precioConDescuentoPorcentaje);
        System.out.println("Precio con descuento fijo: " + precioConDescuentoFijo);
}}
