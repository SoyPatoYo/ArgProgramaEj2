/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrantes;

/**
 *
 * @author Matias
 */
public class MatiasPato {
    private int edad;
    private int numero;
//probando cambiar en dos ramas distintas a la vez
    
    public MatiasPato(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "MatiasPato{" + "edad=" + edad + '}';
    }
   
    public void volar(){
        System.out.println("hola");
        System.out.println("hay que entrenar el cerebro y pensar como programador");
        System.out.println("hola");
        System.out.println("Hola Hola Hola");
    }
}
