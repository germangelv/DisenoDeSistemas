

/**
 * This class constructs an object using the Builder interface.
 * @version 1.0
 * @created 24-nov.-2017 11:35:36 p. m.
 */
public class GestorCombos {

	private char ListaCombos;
	public ComboBuilder m_ComboBuilder;

	public GestorCombos(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param builder
	 */
	public void CrearCombo(AbstractoComboBuilder builder){
		builder.BuildPart();
	
	}

	public Combo getCombo(){
		return null;
	}
}//end GestorCombos