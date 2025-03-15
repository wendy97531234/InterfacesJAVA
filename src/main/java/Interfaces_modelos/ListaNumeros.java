/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_modelos;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Danya
 */
public class ListaNumeros implements Ordenable {
    @Override
    public void ordenar(List<Integer> numeros) {
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }
}
