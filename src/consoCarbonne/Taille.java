package consoCarbonne;
/** Enumeration des différentes tailles possibles d'une voiture
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public enum Taille {
	/** Petite taille P*/
	P(4.2),
	/** Grande taille G */
	G(19);

	/** Emission de tCO2 à la production */
	private double conso;

	Taille(double conso){
		this.conso = conso;
	}
	/** Getter de l'attribut conso
	 * @return conso de l'instance
	*/
	public double getConso(){
		return conso;
	}
	/** Setter de l'attribut coeff
	 * @param conso de l'instance
	*/
	public void setConso(double conso) {
		this.conso = conso;
	}
}
