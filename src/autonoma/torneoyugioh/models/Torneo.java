
package autonoma.torneoyugioh.models;

import java.util.Date;

/**
 *
 * @author Carlos Andrés Rojas Parra
 */
public class Torneo {
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Atributos
    private String numeroEdicion;
    private Date fechaRealizacion;
    private String localizacion;
    
    // Relaciones
//    private Mazo mazo;
//    private ArrayList<Jugador> jugadores;
//    private ArrayList<Combate> combates;    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Constructor
    public Torneo(String numeroEdicion, Date fechaRealizacion, String localizacion) {
        this.numeroEdicion = numeroEdicion;
        this.fechaRealizacion = fechaRealizacion;
        this.localizacion = localizacion;
    }
    
    public Torneo(){
        
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Métodos de Acceso
    public String getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(String numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Gestión de Jugadores
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Gestión de Combates
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Gestión de Juego

    
    
}
