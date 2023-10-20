/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 * Clase `Perro` que extiende la clase `AnimalTerrestre`.
 * @author Damian, hecman, Jhonny
 * Esta clase representa un perro y hereda atributos y métodos de la clase `AnimalTerrestre`.
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    /**
     * Constructor vacío de la clase `Perro`.
     */
    public Perro() {
    }
    
    /**
     * Constructor de la clase `Perro` con parámetros.
     *
     * @param colorCollar El color del collar del perro.
     * @param numeroPatas El número de patas del perro.
     * @param nombre El nombre del perro.
     * @param lugarOrigen El lugar de origen del perro.
     * @param color El color del pelaje del perro.
     */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    /**
     * Obtiene el color del collar del perro.
     *
     * @return El color del collar del perro.
     */
    public String getColorCollar() {
        return colorCollar;
    }

    /**
     * Establece el color del collar del perro.
     *
     * @param colorCollar El color del collar del perro.
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Realiza trucos específicos del perro e imprime un mensaje en la consola.
     */
    public void hacerTrucos(){
        System.out.println("Estoy haciendo trucos");
    }

    /**
     * Sobrescribe el método `toString` para representar la información del perro de manera personalizada.
     *
     * @return Una representación en cadena de caracteres del objeto `Perro`.
     */
    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar + super.toString() + '}';
    }
}
