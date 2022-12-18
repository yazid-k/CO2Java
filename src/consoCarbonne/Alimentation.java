package consoCarbonne;

/** Alimentation est un poste de consommation carbone
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public class Alimentation extends ConsoCarbonne{
	private double txBoeuf;
	private double txVege;

	/** Constructeur de la classe Alimentation
	 * @param txBoeuf Taux de repas à base de boeuf
	 * @param txVege Taux de repas à végétariens
	 * @param id Identifiant de l'instance à créer
	*/
	public Alimentation(double txBoeuf, double txVege, int id){
		super(id);
		this.txBoeuf = txBoeuf;
		this.txVege = txVege;
		this.impact = 8 * txBoeuf + 1.6 * (1 - txVege - txBoeuf) + 0.9 * txVege;
	}

	/** Getter de l'attribut txBoeuf
	 * @return txBoeuf de l'instance
	*/
	public double gettxBoeuf(){
		return txBoeuf;
	}
	/** Setter de l'attribut txBoeuf
	 * @param txBoeuf Nouveau txBoeuf
	*/
	public void settxBoeuf(double txBoeuf){
		this.txBoeuf = txBoeuf;
	}

	/** Getter de l'attribut txVege
	 * @return txVege de l'instance
	*/
	public double gettxVege(){
		return txVege;
	}
	/** Setter de l'attribut txVege
	 * @param txVege Nouveau txVege
	*/
	public void settxVege(double txVege){
		this.txVege = txVege;
	}
	/** Fonction qui donne le détail des emissions carbone d'un francais moyen par rapport à son alimlentation*/
	public static void detailAlimentationMoyen()
	{
		System.out.println("Le français moyen produit 2.4 tCO2eq vis-à-vis de l'alimentation : \nBoissons : 263 kgCO2eq\nProduits laitiers et autres : 408 kgCO2eq\nAutres : 538 kgCO2eq\n" +
		"Produits laitiers et oeufs : 1144 kgCO2eq");
	}
	@Override
	/** Fonction toString pour afficher une instance de la classe Alimentation */
	public String toString(){
		return super.toString() + "txBoeuf : " + this.txBoeuf + "\ntxVege : " + this.txVege;
	}

	/** Main
	 * @param args Paramètre non utilisé
	*/
	public static void main(String[] args) {
		detailAlimentationMoyen();
		Alimentation test = new Alimentation(0.5,0.5,1);
		System.out.println(test);
	}
}
