package utilisateur;

import consoCarbonne.*;

/** Utilisateur représente une personne
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public class Utilisateur {
	private Alimentation alimentation;
	private BienConso bienConso;
	private Logement logement;
	private Transport transport;
	private ServicesPublics servicesPublics;
	/** Constructeur de la classe Utilisateur
	 * @param alimentation Poste de consommation carbone alimentation
	 * @param bienConso Poste de consommation carbone BienConso
	 * @param logement Poste de consommation carbone Logement
	 * @param transport Poste de consommation carbone Transport
	 * @param servicesPublics Poste de consommation carbone ServicesPublics
	 */
	public Utilisateur(Alimentation alimentation, BienConso bienConso, Logement logement, Transport transport, ServicesPublics servicesPublics){
		this.alimentation = alimentation;
		this.bienConso = bienConso;
		this.logement = logement;
		this.transport = transport;
		this. servicesPublics = servicesPublics;
	}
	/** Getter de l'attribut alimentation
	 * @return alimentation de l'instance
	 */
	public Alimentation getAlimentation() {
		return alimentation;
	}
	/** Setter de l'attribut alimentation
	 * @param alimentation Nouveau alimentation
	*/
	public void setAlimentation(Alimentation alimentation) {
		this.alimentation = alimentation;
	}
	/** Getter de l'attribut bienConso
	 * @return bienConso de l'instance
	 */
	public BienConso getBienConso() {
		return bienConso;
	}
	/** Setter de l'attribut bienConso
	 * @param bienConso Nouveau bienConso
	*/
	public void setBienConso(BienConso bienConso) {
		this.bienConso = bienConso;
	}
	/** Getter de l'attribut logement
	 * @return logement de l'instance
	 */
	public Logement getLogement() {
		return logement;
	}
	/** Setter de l'attribut logement
	 * @param logement Nouveau logement
	*/
	public void setLogement(Logement logement) {
		this.logement = logement;
	}
	/** Getter de l'attribut servicesPublics
	 * @return servicesPublics de l'instance
	 */
	public ServicesPublics getServicesPublics() {
		return servicesPublics;
	}
	/** Setter de l'attribut servicesPublics
	 * @param servicesPublics Nouveau servicesPublics
	*/
	public void setServicesPublics(ServicesPublics servicesPublics) {
		this.servicesPublics = servicesPublics;
	}
	/** Getter de l'attribut transport
	 * @return transport de l'instance
	 */
	public Transport getTransport() {
		return transport;
	}
	/** Setter de l'attribut transport
	 * @param transport Nouveau transport
	*/
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	/** Fonction qui calcule la totalité des emissions carbone de l'utilisateur moyen par rapport à ses postes de consommation carbone
	 * @return Empreinte totale de l'utilisateur
	*/
	public double calculerEmpreinte(){
		double empreinte;
		empreinte = this.alimentation.getImpact() + this.logement.getImpact() + this.bienConso.getImpact() + this.transport.getImpact() + this.servicesPublics.getImpact();
		return(empreinte);
	}
	/** Fonction qui donne le détail des emissions carbone de l'utilisateur moyen par rapport à ses postes de consommation carbone */
	public void detaillerEmpreinte(){
		System.out.println("Impact alimentation : " + this.alimentation.getImpact() + " tCO2eq\nImpact bienConso : " + this.bienConso.getImpact() +" tCO2eq\nImpact logement : " +
		this.logement.getImpact() +" tCO2eq\nImpact transport : " + this.transport.getImpact() +" tCO2eq\nImpact services publics : " + this.servicesPublics.getImpact()+
		" tCO2eq\nEnpreinte totale : "+this.calculerEmpreinte()+" tCO2eq");
	}
	/** Main
	 * @param args Paramètre non utilisé
	*/
	public static void main(String[] args) {
		Alimentation alimentation = new Alimentation(0.5 , 0.5, 1);
		BienConso bienConso = new BienConso(1750, 2);
		Logement logement = new Logement(25, CE.G, 3);
		Transport transport = new Transport(true, Taille.G, 300, 5, 4);
		ServicesPublics servicesPublics = new ServicesPublics(5);
		Utilisateur user = new Utilisateur(alimentation, bienConso, logement, transport, servicesPublics);
		user.detaillerEmpreinte();
	}
}
