

/**
 * @author Computer
 * @version 1.0
 * @created 16-Oct-2017 9:56:13 AM
 */
public class Cliente extends Usuario {

	private String apellido;
	private long dni;
	private String email;
	private String nombre;
	public MagicBand m_MagicBand;
	public TarjetaDeCredito m_TarjetaDeCredito;
	public Historial m_Historial;
	public Nacionalidad m_Nacionalidad;
	public Venta m_Venta;
	public Pase m_Pase;
	public Evento m_Evento;
	public Sorteo m_Sorteo;

	public Cliente(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public añadirTarjetaDeCredito(){

	}

	public int eliminarTarjeta(){
		return 0;
	}

	public modificarDatosTarjetaCreidto(){

	}

}