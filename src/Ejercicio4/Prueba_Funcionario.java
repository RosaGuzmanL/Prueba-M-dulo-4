/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;
import Ejercicio4.Funcionario;



/**
 *
 * @author PC
 */
public class Prueba_Funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("23.116.180-5","Dylan Andrés Galindo Guzmán","Los Avellanos 567","13-01-1990 ",700.500);
        System.out.println(funcionario.mostrarDatos());
    }
    
}
