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
}}
