/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 * Clase `Pajaro` que extiende la clase `AnimalAereo`.
 * @author Damian, hecman, Jhonny 
 * Esta clase representa un pájaro y hereda atributos y métodos de la clase `AnimalAereo`.
 */
public class Pajaro extends AnimalAereo {
    private String TipoPico;

    /**
     * Constructor vacío de la clase `Pajaro`.
     */
    public Pajaro() {
    }

    /**
     * Constructor de la clase `Pajaro` con parámetros.
     *
     * @param TipoPico El tipo de pico del pájaro.
     * @param numeroAlas El número de alas del pájaro.
     * @param nombre El nombre del pájaro.
     * @param lugarOrigen El lugar de origen del pájaro.
     * @param color El color del plumaje del pájaro.
     */
    public Pajaro(String TipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.TipoPico = TipoPico;
    }

    /**
     * Obtiene el tipo de pico del pájaro.
     *
     * @return El tipo de pico del pájaro.
     */
    public String getTipoPico() {
        return TipoPico;
    }

    /**
     * Establece el tipo de pico del pájaro.
     *
     * @param TipoPico El tipo de pico del pájaro.
     */
    public void setTipoPico(String TipoPico) {
        this.TipoPico = TipoPico;
    }
    
    /**
     * Realiza la acción de recolectar ramas y muestra un mensaje en la consola.
     */
    public void recolectarRamas(){
        System.out.println("Estoy recolectando ramas xD");
    }

    /**
     * Sobrescribe el método `toString` para representar la información del pájaro de manera personalizada.
     *
     * @return Una representación en cadena de caracteres del objeto `Pajaro`.
     */
    @Override
    public String toString() {
        return "Pajaro{" + "TipoPico=" + TipoPico + super.toString() + '}';
    }
}

