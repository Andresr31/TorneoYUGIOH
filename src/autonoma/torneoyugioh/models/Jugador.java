package autonoma.torneoyugioh.models;
/**
 * Participantes del torneo
 * @author Samuel Esteban Herrera Bedoya
 * @version 0.2.0
 * @since 2024-03-8
 */
public class Jugador 
{
    private String nombre;
    private int numeroVictorias;
    private int puntosExtra;

    public Jugador(String nombre, int numeroVictorias, int puntosExtra) 
    {
        this.nombre = nombre;
        this.numeroVictorias = numeroVictorias;
        this.puntosExtra = puntosExtra;
    }
}
