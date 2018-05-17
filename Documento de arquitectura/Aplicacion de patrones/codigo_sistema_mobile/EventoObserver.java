

/**
 * @author SG0221051
 * @version 1.0
 * @created 24-nov.-2017 11:33:22 p. m.
 */
public class EventoObserver {

	public Evento m_Evento;

	public EventoObserver(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param cliente
	 */
	public int AgregarParticipante(Cliente cliente){
		return 0;
	}

	/**
	 * 
	 * @param cliente
	 */
	public int EliminarParticipante(Cliente cliente){
		return 0;
	}

	public int NotificarPartipante(){
		return 0;
	}
}//end EventoObserver