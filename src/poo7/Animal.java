/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 * Clase `Animal` que representa a un animal genérico.
 *
 * Esta clase define las características básicas de un animal, como su nombre, lugar de origen y color.
 */
public class Animal {
    private String nombre, lugarOrigen, color;
    
    /**
     * Constructor vacío de la clase `Animal`.
     */
    public Animal(){
    }

    /**
     * Constructor de la clase `Animal` con parámetros.
     *
     * @param nombre El nombre del animal.
     * @param lugarOrigen El lugar de origen del animal.
     * @param color El color del pelaje o piel del animal.
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    /**
     * Obtiene el nombre del animal.
     *
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del animal.
     *
     * @param nombre El nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el lugar de origen del animal.
     *
     * @return El lugar de origen del animal.
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * Establece el lugar de origen del animal.
     *
     * @param lugarOrigen El lugar de origen del animal.
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Obtiene el color del pelaje o piel del animal.
     *
     * @return El color del pelaje o piel del animal.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del pelaje o piel del animal.
     *
     * @param color El color del pelaje o piel del animal.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Realiza la acción de comer y muestra un mensaje en la consola.
     */
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    /**
     * Sobrescribe el método `toString` para representar la información del animal de manera personalizada.
     *
     * @return Una representación en cadena de caracteres del objeto `Animal`.
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
}
