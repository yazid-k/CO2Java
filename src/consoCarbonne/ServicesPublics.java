package consoCarbonne;

/** ServicesPublics est un poste de consommation carbone
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public class ServicesPublics extends ConsoCarbonne{
	/** Constructeur de la classe ServicesPublics
	 * @param id Identifiant de l'instance à créer
	*/
	public ServicesPublics(int id){
		super(id);
		this.impact = 1.5;
	}
	/** Fonction qui donne le détail des emissions carbone d'un francais moyen par rapport à son utilisation des services publics */
	public static void detailServicesMoyen()
	{
		System.out.println("Le français moyen produit 1.5 tCO2eq vis-à-vis des services publiques : \nServices publiques : 1489 kgCO2eq");
	}
}
