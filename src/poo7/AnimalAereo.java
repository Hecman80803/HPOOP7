/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 * Clase `AnimalAereo` que extiende la clase `Animal`.
 * @author Damian, Hecman, Jhonny
 * Esta clase representa un animal aéreo y hereda atributos y métodos de la clase `Animal`.
 */
public class AnimalAereo extends Animal {
    int numeroAlas;
            
    /**
     * Constructor vacío de la clase `AnimalAereo`.
     */
    public AnimalAereo() {
    }
    /**
     * Constructor de la clase `AnimalAereo` con parámetros.
     *
     * @param numeroAlas El número de alas del animal aéreo.
     * @param nombre El nombre del animal.
     * @param lugarOrigen El lugar de origen del animal.
     * @param color El color del pelaje o plumaje del animal.
     */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * Obtiene el número de alas del animal aéreo.
     *
     * @return El número de alas del animal aéreo.
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
     * Establece el número de alas del animal aéreo.
     *
     * @param numeroAlas El número de alas del animal aéreo.
     */
    
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    /**
     * Realiza la acción de volar y muestra un mensaje en la consola.
     */
    public void volar(){
        System.out.println("Estoy volando");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo gusanos"); 
    }
    
    /**
     * Sobrescribe el método `toString` para representar la información del animal aéreo de manera personalizada.
     *
     * @return Una representación en cadena de caracteres del objeto `AnimalAereo`.
     */
    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas + super.toString()+ '}';
    }
    
    
}
