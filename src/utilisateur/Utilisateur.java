package utilisateur;

import java.util.ArrayList;
import java.util.Collections;

import consoCarbonne.*;

/** Utilisateur représente une personne
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public class Utilisateur {
	private Alimentation alimentation;
	private BienConso bienConso;
	private ArrayList<Logement> logement;
	private ArrayList<Transport> transport;
	private ServicesPublics servicesPublics;
	/** Constructeur de la classe Utilisateur
	 * @param alimentation Poste de consommation carbone alimentation
	 * @param bienConso Poste de consommation carbone BienConso
	 * @param logement Poste de consommation carbone Logement
	 * @param transport Poste de consommation carbone Transport
	 * @param servicesPublics Poste de consommation carbone ServicesPublics
	 */
	public Utilisateur(Alimentation alimentation, BienConso bienConso, ArrayList<Logement> logement, ArrayList<Transport> transport, ServicesPublics servicesPublics){
		this.alimentation = alimentation;
		this.bienConso = bienConso;
		this.logement = logement;
		this.transport = transport;
		this.servicesPublics = servicesPublics;
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
	public ArrayList<Logement> getLogement() {
		return logement;
	}
	/** Setter de l'attribut logement
	 * @param logement Nouveau logement
	*/
	public void setLogement(ArrayList<Logement> logement) {
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
	public ArrayList<Transport> getTransport() {
		return transport;
	}
	/** Setter de l'attribut transport
	 * @param transport Nouveau transport
	*/
	public void setTransport(ArrayList<Transport> transport) {
		this.transport = transport;
	}
	/** Fonction qui calcule la totalité des emissions carbone de l'utilisateur moyen par rapport à ses postes de consommation carbone
	 * @return Empreinte totale de l'utilisateur
	*/
	public double calculerEmpreinte(){
		double empreinte;
		double empreinteLogement = 0;
		double empreinteTransport = 0;
		for (Logement i : this.logement)
			empreinteLogement+=i.getImpact();
		for (Transport i : this.transport)
			empreinteTransport+=i.getImpact();
		empreinte = this.alimentation.getImpact() + empreinteLogement + this.bienConso.getImpact() + empreinteTransport + this.servicesPublics.getImpact();
		return(empreinte);
	}
	/** Fonction qui donne le détail des emissions carbone de l'utilisateur moyen par rapport à ses postes de consommation carbone */
	public void detaillerEmpreinte(){
		double empreinteLogement = 0;
		double empreinteTransport = 0;
		for (Logement i : this.logement)
			empreinteLogement+=i.getImpact();
		for (Transport i : this.transport)
			empreinteTransport+=i.getImpact();
		System.out.println("Impact alimentation : " + this.alimentation.getImpact() + " tCO2eq\nImpact bienConso : " + this.bienConso.getImpact() +" tCO2eq\nImpact logement : " +
		empreinteLogement +" tCO2eq\nImpact transport : " + empreinteTransport +" tCO2eq\nImpact services publics : " + this.servicesPublics.getImpact()+
		" tCO2eq\nEnpreinte totale : "+this.calculerEmpreinte()+" tCO2eq");
	}
	/** Fonction qui ordonne les consommations carbone de l'utilisateur
	 * @return Liste ordonnées contenant les consommations carbones de l'utilisateur en fonction de leur impact
	*/
	public ArrayList<ConsoCarbonne> ordonnerConso(){
		ArrayList<ConsoCarbonne> cc = new ArrayList<>();
		cc.add(alimentation);
		cc.add(bienConso);
		cc.add(servicesPublics);
		for (Logement i : logement)
			cc.add(i);
		for (Transport i : transport)
			cc.add(i);
		Collections.sort(cc);
		return(cc);
	}
	/** Main
	 * @param args Paramètre non utilisé
	*/
	public static void main(String[] args) {
		Alimentation alimentation = new Alimentation(0.9 , 0.1, 1);
		BienConso bienConso = new BienConso(1750, 2);
		Logement logement1 = new Logement(25, CE.G, 3);
		Transport transport1 = new Transport(true, Taille.G, 300, 5, 4);
		Logement logement2 = new Logement(50, CE.A, 5);
		Transport transport2 = new Transport(true, Taille.P, 600, 5, 6);
		ServicesPublics servicesPublics = new ServicesPublics(7);
		ArrayList<Logement> logement = new ArrayList<Logement>();
		ArrayList<Transport> transport = new ArrayList<Transport>();
		logement.add(logement1);
		logement.add(logement2);
		transport.add(transport1);
		transport.add(transport2);
		Utilisateur user = new Utilisateur(alimentation, bienConso, logement, transport, servicesPublics);
		user.detaillerEmpreinte();
		System.out.println("\n"+ user.ordonnerConso());
	}
}
