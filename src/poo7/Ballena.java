/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 * Clase `Ballena` que extiende la clase `AnimalAcuatico`.
 * @author Damian, hecman, Jhonny
 * Esta clase representa una ballena y hereda atributos y métodos de la clase `AnimalAcuatico`.
 */
public class Ballena extends AnimalAcuatico {
    private int largo;

    /**
     * Constructor vacío de la clase `Ballena`.
     */
    public Ballena() {
    }

    /**
     * Constructor de la clase `Ballena` con parámetros.
     *
     * @param largo La longitud de la ballena.
     * @param numeroAletas El número de aletas de la ballena.
     * @param nombre El nombre de la ballena.
     * @param lugarOrigen El lugar de origen de la ballena.
     * @param color El color de la piel de la ballena.
     */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    /**
     * Obtiene la longitud de la ballena.
     *
     * @return La longitud de la ballena.
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Establece la longitud de la ballena.
     *
     * @param largo La longitud de la ballena.
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
     * Realiza la acción de pelear con Pinocho y muestra un mensaje en la consola.
     */
    public void PelearconPinocho(){
        System.out.println("Estoy peleando");
    }

    /**
     * Sobrescribe el método `toString` para representar la información de la ballena de manera personalizada.
     *
     * @return Una representación en cadena de caracteres del objeto `Ballena`.
     */
    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + super.toString() + '}';
    }
}
