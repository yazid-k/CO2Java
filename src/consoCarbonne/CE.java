package consoCarbonne;
/** Enumeration des différentes classes énergétiques possibles d'un logement
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public enum CE {
	/** Classe énergétique A */
	A(0.005),
	/** Classe énergétique B */
	B(0.01),
	/** Classe énergétique C */
	C(0.02),
	/** Classe énergétique D */
	D(0.035),
	/** Classe énergétique E */
	E(0.055),
	/** Classe énergétique F */
	F(0.08),
	/** Classe énergétique G */
	G(0.1);

	/** Coefficient émission GES par m2 */
	public double coeff;

	CE(double coeff){
		this.coeff = coeff;
	}

	/** Getter de l'attribut coeff
	 * @return coeff de l'instance
	*/
	public double getCoeff(){
		return this.coeff;
	}

	/** Setter de l'attribut coeff
	 * @param coeff Nouveau coeff
	*/
	public void setCoeff(double coeff){
		this.coeff = coeff;
	}
}
