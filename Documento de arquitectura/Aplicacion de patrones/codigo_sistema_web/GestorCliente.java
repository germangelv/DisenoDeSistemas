

/**
 * @author Computer
 * @version 1.0
 * @created 16-Oct-2017 9:56:14 AM
 */
public class GestorCliente {

	public Cliente m_Cliente;
	public GestorVentas m_GestorVentas;
	public ControladorMagicBand m_ControladorMagicBand;

	public GestorCliente(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param nrotarjeta
	 * @param banco
	 * @param fechaVencimiento
	 */
	public int asociarTarjetaCredito(nrotarjeta, banco, fechaVencimiento){
		return 0;
	}

	public datosCliente obtenerDatosCliente(){
		return null;
	}

	public tarjeta obtenerDatosTarjeta(){
		return null;
	}

}