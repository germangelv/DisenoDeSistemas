

/**
 * @author SG0221051
 * @version 1.0
 * @created 16-Oct-2017 9:56:20 AM
 */
public class GestorParque {

	public Parque m_Parque;
	public ControladorConsultas m_ControladorConsultas;

	public GestorParque(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param id_evento
	 */
	public int consultarEstadoEvento(int id_evento){
		return 0;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public int crearEvento(String descripcion){
		return 0;
	}

	/**
	 * 
	 * @param id_parque
	 */
	public int obtenerAtracciones(int id_parque){
		return 0;
	}

	/**
	 * 
	 * @param id_parque
	 */
	public int obtenerDescripcion(int id_parque){
		return 0;
	}

	public int obtenerRestaurantes(){
		return 0;
	}

	public int obtenerTurnodisponibles(){
		return 0;
	}

	public int obtenerTurnosRestaurant(){
		return 0;
	}

	/**
	 * 
	 * @param id_atraccion
	 * @param id_turno
	 */
	public int reservarTurno(int id_atraccion, int id_turno){
		return 0;
	}

}