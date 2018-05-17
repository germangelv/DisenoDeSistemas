

/**
 * @author SG0221051
 * @version 1.0
 * @created 16-Oct-2017 9:56:28 AM
 */
public class Usuario {

	private String contrasena;
	private String nombreUsuario;
	private String palabraClave;

	public Usuario(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param passwordVieja
	 * @param passwordNueva
	 */
	public int cambiarContrasena(String passwordVieja, String passwordNueva){
		return 0;
	}

	/**
	 * 
	 * @param palabraClave
	 */
	public int recuperarContrasena(String palabraClave){
		return 0;
	}

	/**
	 * 
	 * @param contrasena
	 */
	public int verificarLogeo(String contrasena){
		return 0;
	}

}