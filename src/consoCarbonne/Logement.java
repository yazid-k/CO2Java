package consoCarbonne;

/** Logement est un poste de consommation carbone
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public class Logement extends ConsoCarbonne{
	private int superficie;
	private CE ce;
	/** Constructeur de la classe Alimentation
	 * @param superficie Superficie du logement
	 * @param ce Classe énergétique du logement
	 * @param id Identifiant de l'instance à créer
	*/
	public Logement(int superficie, CE ce, int id){
		super(id);
		if (superficie < 0)
			throw new IllegalArgumentException("La superficie doit être positive");
		if (ce == null)
			throw new NullPointerException("Le pointeur sur ce est null");
		this.superficie = superficie;
		this.ce = ce;
		this.impact = superficie * ce.getCoeff();
	}
	/** Getter de l'attribut superficie
	 * @return superficie de l'instance
	*/
	public int getSuperficie(){
		return superficie;
	}
	/** Setter de l'attribut superficie
	 * @param superficie Nouveau superficie
	*/
	public void setSuperficie(int superficie){
		this.superficie = superficie;
	}
	/** Getter de l'attribut ce
	 * @return ce de l'instance
	*/
	public CE getCe(){
		return ce;
	}
	/** Setter de l'attribut ce
	 * @param ce Nouveau ce
	*/
	public void setCe(CE ce){
		this.ce = ce;
	}
	/** Fonction qui donne le détail des emissions carbone d'un francais moyen par rapport à son logement*/
	public static void detailLogementMoyen()
	{
		System.out.println("Le français moyen produit 2.7 tCO2eq vis-à-vis du logement : \nEnergie et utilités : 1696 kgCO2eq\nConstruction et gros entretien : 675 kgCO2eq\n" +
		"Equipements des logements : 335 kgCO2eq");
	}
	@Override
	/** Fonction toString pour afficher une instance de la classe Logement */
	public String toString(){
		return super.toString() + "superficie : " + this.superficie + "m2\nce : " + this.ce;
	}
	/** Main
	 * @param args Paramètre non utilisé
	*/
	public static void main(String[] args) {
		Logement test = new Logement(25, CE.B, 2);
		System.out.println(test);
	}
}
