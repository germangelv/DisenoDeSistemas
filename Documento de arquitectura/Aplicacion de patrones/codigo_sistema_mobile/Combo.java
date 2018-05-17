import java.util.*;

/**
 * This class (a) represents the complex object under construction.
 * ConcreteBuilder builds the product's internal representation and defines the
 * process by which it's assembled, and (b) includes classes that define the
 * constituent parts, including interfaces for assembling the parts into the final
 * result.
 * @version 1.0
 * @created 24-nov.-2017 11:35:14 p. m.
 */
public class Combo {

	private int TipoDePases;
	private Pase pases;
	private ArrayList<Souvenir> listaSouvenirs;
	private double porcentajeDescuento;
	private double costoFinal;
	public ItemDeVenta m_ItemDeVenta;

	public Combo(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param part
	 */
	public void Add(Object part){
		parts.addElement(part);
	}

	/**
	 * 
	 * @param souvenir
	 */
	public void addSouvenir(Souvenir souvenir){

	}

	public double calcularTotal(){
		return 0;
	}

	/**
	 * 
	 * @param porcentaje
	 */
	public void setDescuento(double porcentaje){

	}

	/**
	 * 
	 * @param pase
	 */
	public void setPase(Pase pase){

	}

	/**
	 * 
	 * @param tipoDePase
	 */
	public void setTipo(char tipoDePase){

	}
}//end Combo