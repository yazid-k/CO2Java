package consoCarbonne;

/** Classe mère pour tous les postes de consommation carbone
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public class ConsoCarbonne {
	private int	id;
	double impact;

	/** Constructeur de la classe ConsoCarbone
	 * @param id Identifiant de l'instance à créer
	 */
	public ConsoCarbonne(int id){
		this.id = id;
		this.impact = 0;
	}

	/** Getter de l'attribut id
	 * @return id de l'instance
	 */
	public int getId(){
		return this.id;
	}

	/** Setter de l'attribut id
	 * @param id Nouveau id
	 */
	public void setId(int id){
		this.id = id;
	}

	/** Getter de l'attribut impact
	 * @return impact de l'instance
	 */
	public double getImpact(){
		return impact;
	}

	/** Setter de l'attribut impact
	 * @param impact Nouveau impact
	 */
	public void setimpact(double impact){
		this.impact = impact;
	}
	@Override
	/** Fonction toString pour afficher une instance de la classe Alimentation */
	public String toString(){
		return "Class : " + this.getClass().getName() + "\nid : " + id + "\nimpact : " + impact + " tCO2eq\n";
	}
}
