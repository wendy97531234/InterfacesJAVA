/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_modelos;

/**
 *
 * @author Danya
 */
public class SMS implements Notificable {

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por SMS.");    }
    
}
