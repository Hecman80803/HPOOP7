/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo7;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * @author Damian
 * El programa crea instancias de varias clases relacionadas con animales y las imprime en la consola.
 */
public class POO7 {

    public static void main(String[] args) {
        // Crear una instancia de la clase Animal
        Animal animal = new Animal();
        animal.setNombre("Max");
        animal.setLugarOrigen("Mexico");
        animal.setColor("Gris");
        System.out.println(animal);

        // Crear una instancia de la clase AnimalAcuatico
        AnimalAcuatico animalAcuatico = new AnimalAcuatico();
        animalAcuatico.setNombre("leo");
        animalAcuatico.setLugarOrigen("Africa");
        animalAcuatico.setColor("Rojo");
        animalAcuatico.setNumeroAletas(4);
        System.out.println(animalAcuatico);

        // Crear una instancia de la clase Ballena
        Ballena ballena = new Ballena(30, 2, "juan", "Brasil", "Gris");
        System.out.println(ballena);

        // Crear una instancia de la clase AnimalTerrestre
        AnimalTerrestre animalTerrestre = new AnimalTerrestre();
        animalTerrestre.setNombre("Nala");
        animalTerrestre.setLugarOrigen("Mexico");
        animalTerrestre.setColor("Cafe");
        animalTerrestre.setNumeroPatas(4);
        System.out.println(animalTerrestre);

        // Crear una instancia de la clase Perro
        Perro perro = new Perro("Amarillo", 4, "Nala", "Mexico", "Cafe");
        System.out.println(perro);

        // Crear una instancia de la clase AnimalAereo
        AnimalAereo animalAereo = new AnimalAereo();
        animalAereo.setNombre("Carpintero");
        animalAereo.setLugarOrigen("Canada");
        animalAereo.setColor("Rojo y Negro");
        animalAereo.setNumeroAlas(2);
        System.out.println(animalAereo);

        // Crear una instancia de la clase Pajaro
        Pajaro pajaro = new Pajaro("Picudo", 2, "Carpintero", "Canada", "Rojo y Negro");
        System.out.println(pajaro);
    }
}
