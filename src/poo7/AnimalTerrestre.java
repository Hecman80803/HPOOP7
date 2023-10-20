/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 * Clase `AnimalTerrestre` que extiende la clase `Animal`.
 * @Damian, hecman, Jhonny
 * Esta clase representa un animal terrestre y hereda atributos y métodos de la clase `Animal`.
 */
public class AnimalTerrestre extends Animal {
    int numeroPatas;

    /**
     * Constructor vacío de la clase `AnimalTerrestre`.
     */
    public AnimalTerrestre() {
    }
    
    /**
     * Constructor de la clase `AnimalTerrestre` con parámetros.
     *
     * @param numeroPatas El número de patas del animal terrestre.
     * @param nombre El nombre del animal.
     * @param lugarOrigen El lugar de origen del animal.
     * @param color El color del pelaje o piel del animal.
     */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    /**
     * Obtiene el número de patas del animal terrestre.
     *
     * @return El número de patas del animal terrestre.
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * Establece el número de patas del animal terrestre.
     *
     * @param numeroPatas El número de patas del animal terrestre.
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    /**
     * Realiza la acción de correr y muestra un mensaje en la consola.
     */
    public void correr(){
       System.out.println("Estoy corriendo");
   }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo croquetas"); 
    }

    /**
     * Sobrescribe el método `toString` para representar la información del animal terrestre de manera personalizada.
     *
     * @return Una representación en cadena de caracteres del objeto `AnimalTerrestre`.
     */
    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + super.toString() + '}';
    }
}
