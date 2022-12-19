package consoCarbonne;

/** Classe mère pour tous les postes de consommation carbone
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public abstract class ConsoCarbonne implements Comparable<ConsoCarbonne>{
	private int	id;
	double impact;

	/** Constructeur de la classe ConsoCarbone
	 * @param id Identifiant de l'instance à créer
	 */
	public ConsoCarbonne(int id){
		if (id <= 0) {
			throw new IllegalArgumentException("Identifiant non valide");
		}
		this.id = id;
		this.impact = 0;
	}

	/** Getter de l'attribut id
	 * @return id de l'instance
	 */
	public int getId(){
		return id;
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
	/** Fonction toString pour afficher une instance de la classe ConsoCarbonne */
	public String toString(){
		return "Class : " + this.getClass().getName() + "\nid : " + id + "\nimpact : " + impact + " tCO2eq\n";
	}

	@Override public int compareTo(ConsoCarbonne cc){
		return(Double.compare(impact, cc.getImpact()));
	}
}
