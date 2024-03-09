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

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getNumeroVictorias() 
    {
        return numeroVictorias;
    }

    public void setNumeroVictorias(int numeroVictorias) 
    {
        this.numeroVictorias = numeroVictorias;
    }

    public int getPuntosExtra() {
        return puntosExtra;
    }

    public void setPuntosExtra(int puntosExtra) 
    {
        this.puntosExtra = puntosExtra;
    }   
}
