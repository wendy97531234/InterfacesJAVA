/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_modelos;

/**
 *
 * @author Danya
 */
public class Gato implements Animal {

    @Override
    public void hacerSonido() {
         System.out.println("El gato maulla: ¡Miau miau!");
    }

    @Override
    public void mover() {
        System.out.println("El gato se mueve sigilosamente.");
    }
    
}
