/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 * Clase `AnimalAcuatico` que extiende la clase `Animal`.
 * @author Damian
 * Esta clase representa un animal acuático y hereda atributos y métodos de la clase `Animal`.
 */
public class AnimalAcuatico extends Animal {
    int numeroAletas;

    /**
     * Constructor vacío de la clase `AnimalAcuatico`.
     */
    public AnimalAcuatico() {
    }

    /**
     * Constructor de la clase `AnimalAcuatico` con parámetros.
     *
     * @param numeroAletas El número de aletas del animal acuático.
     * @param nombre El nombre del animal.
     * @param lugarOrigen El lugar de origen del animal.
     * @param color El color del pelaje o piel del animal.
     */
    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }

    /**
     * Obtiene el número de aletas del animal acuático.
     *
     * @return El número de aletas del animal acuático.
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }

    /**
     * Establece el número de aletas del animal acuático.
     *
     * @param numeroAletas El número de aletas del animal acuático.
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
    /**
     * Realiza la acción de nadar y muestra un mensaje en la consola.
     */
    public void nadar(){
        System.out.println("Estoy nadando");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo peces");
    }

    /**
     * Sobrescribe el método `toString` para representar la información del animal acuático de manera personalizada.
     *
     * @return Una representación en cadena de caracteres del objeto `AnimalAcuatico`.
     */
    @Override
    public String toString() {
        return "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + super.toString() + '}';
    }  
}
