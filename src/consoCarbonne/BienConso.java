package consoCarbonne;

/** BienConso est un poste de consommation carbone
 * @author KADIRI El Yazid GROSJEAN Adrien
*/
public class BienConso extends ConsoCarbonne{
	private double montant;

	/** Constructeur de la classe BienConso
	 * @param montant Montant annuel des dépenses de l'utilisateur
	 * @param id identifiant de l'instance à créer
	*/
	public BienConso(double montant, int id){
		super(id);
		if (montant < 0)
			throw new IllegalArgumentException("Le montant doit être positif");
		this.montant = montant;
		this.impact = montant / 1750;
	}
	/** Getter de l'attribut montant
	 * @return montant de l'instance
	*/
	public double getMontant(){
		return montant;
	}
	/** Setter de l'attributr montant
	 * @param montant Nouveau montant
	*/
	public void setMontant(double montant){
		this.montant = montant;
	}
	/** Fonction qui donne le détail des emissions carbone d'un francais moyen par rapport à ses dépenses annuelles*/
	public static void detailBienConsonMoyen()
	{
		System.out.println("Le français moyen produit 2.6 tCO2eq vis-à-vis de la consommation : \nAchat et usages Internet et technologies : 1180 kgCO2eq\nAutres biens et services : 682 kgCO2eq\n" +
		"Habillement : 763 kgCO2eq");
	}
	@Override
	/** Fonction toString pour afficher une instance de la classe BienConso */
	public String toString(){
		return super.toString() + "montant : " + this.montant + " €";
	}
}
