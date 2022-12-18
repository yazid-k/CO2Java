package consoCarbonne;

/** Transport est un poste de consommation carbone
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public class Transport extends ConsoCarbonne{
	private boolean possede;
	private Taille taille;
	private int kilomAnnee;
	private int amortissement;
	/** Constructeur de la classe Transport
	 * @param possede Booléen indiquant si l'utilisateur possède une voiture
	 * @param taille Taille du véhicule
	 * @param kilomAnnee Nombre de kilomètres parcourus par an
	 * @param amortissement Durée de conservation du véhicule
	 * @param id Identifiant de l'instance à créer
	*/
	public Transport(boolean possede, Taille taille, int kilomAnnee, int amortissement, int id){
		super(id);
		this.possede = possede;
		this.taille = taille;
		this.kilomAnnee = kilomAnnee;
		this.amortissement = amortissement;
		if(possede){
			this.impact = kilomAnnee * 0.000193 + (taille.getConso() / amortissement);
		}
	}
	/** Getter de l'attribut possede
	 * @return possede de l'instance
	*/
	public boolean getPossede(){
		return this.possede;
	}
	/** Setter de l'attribut possede
	 * @param possede Nouveau possede
	*/
	public void setPossede(boolean possede){
		this.possede = possede;
	}
	/** Getter de l'attribut taille
	 * @return taille de l'instance
	*/
	public Taille getTaille(){
		return this.taille;
	}
	/** Setter de l'attribut taille
	 * @param taille Nouveau taille
	*/
	public void setTaille(Taille taille){
		this.taille = taille;
	}
	/** Getter de l'attribut kilomAnnee
	 * @return kilomAnnee de l'instance
	*/
	public int getKilomAnnee(){
		return this.kilomAnnee;
	}
	/** Setter de l'attribut kilomAnnee
	 * @param kilomAnnee Nouveau kilomAnnee
	*/
	public void setKilmonAnnee(int kilomAnnee){
		this.kilomAnnee = kilomAnnee;
	}
	/** Getter de l'attribut amortissement
	 * @return amortissement de l'instance
	*/
	public int getAmortissement(){
		return this.amortissement;
	}
	/** Setter de l'attribut amortissement
	 * @param amortissement Nouveau amortissement
	*/
	public void setAmortissement(int amortissement){
		this.amortissement = amortissement;
	}
	/** Fonction qui donne le détail des emissions carbone d'un francais moyen par rapport à ses moyens de transport*/
	public static void detailTransportMoyen()
	{
		System.out.println("Le français moyen produit 2.9 tCO2eq vis-à-vis du transport : \nVoiture : 1972 kgCO2eq\nAvion : 480 kgCO2eq\nFret et messagerie : 383 kgCO2eq\n" +
		"Train et bus : 85 kgCO2eq");
	}
	/** Fonction toString pour afficher une instance de la classe Transport */
	public String toString(){
		return super.toString() + "possede : " + this.possede + "\ntaille : " + this.taille + "\nkilomAnnee : " + this.kilomAnnee + " km\namortissement : " + this.amortissement;
	}
	/** Main
	 * @param args Paramètre non utilisé
	*/
	public static void main(String[] args) {
		Transport test = new Transport(true, Taille.P, 1000, 1, 3);
		detailTransportMoyen();
		System.out.println(test);
	}
}
