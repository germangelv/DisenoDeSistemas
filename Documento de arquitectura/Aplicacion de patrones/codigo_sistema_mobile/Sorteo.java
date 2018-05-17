

/**
 * @author SG0221051
 * @version 1.0
 * @created 24-nov.-2017 11:37:38 p. m.
 */
public class Sorteo {

	private String descripcion;
	private int id_sorteo;
	private String estado;
	public Premio m_Premio;
	public Parque m_Parque;
	public GestorEventos m_GestorEventos;
	public Cliente m_Cliente;
	public SorteoObserver m_SorteoObserver;

	public Sorteo(){

	}

	public void finalize() throws Throwable {

	}
	public int finalizarSorteo(){
		return 0;
	}

	public int ObtenerGanadores(){
		return 0;
	}
}//end Sorteo