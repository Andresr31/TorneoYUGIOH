/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.torneoyugioh.models;

/**
 * La clase Carta representa una carta en el juego de YU-GI-OH.
 * @author Angie Campuzano Betancur y Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-03-07
 */
public class Carta {
    ////atributos/////
    /**
     *Nombre de la carta
     */
    private String nombre;
    /**
     * Descripcion de la carta
     */
    private String descripcion;
    
    //// constructor/////
    /**
     * Constructos de la clase carta
     * @param nombre El nombre de la Carta
     * @param descripcion La descripcion de la carta
     */
    
    public Carta(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    
    //// metodos///

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
