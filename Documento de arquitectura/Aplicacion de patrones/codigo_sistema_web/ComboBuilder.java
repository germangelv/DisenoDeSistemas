

/**
 * This class specifies an abstract interface for creating parts of a Product
 * object.
 * @version 1.0
 * @created 24-nov.-2017 11:35:26 p. m.
 */
public abstract class ComboBuilder {

	private Combo combo;
	public Combo m_Combo;

	public ComboBuilder(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param descuento
	 */
	public void ImponerDescuento(double descuento){

	}

	public double getCosto(){
		return 0;
	}

	/**
	 * 
	 * @param pase
	 * @param tipo
	 */
	public void asignarTipoyPase(Pase pase, char tipo){

	}

	/**
	 * 
	 * @param so
	 */
	public void EditarListaSouvenirs(list<Souvenir> so){

	}
}//end ComboBuilder