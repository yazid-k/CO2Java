package utilisateur;

import consoCarbonne.Alimentation;
import consoCarbonne.BienConso;
import consoCarbonne.Logement;
import consoCarbonne.ServicesPublics;
import consoCarbonne.Transport;

public class Utilisateur {
	Alimentation alimentation;
	BienConso bienConso;
	Logement logement;
	Transport transport;
	ServicesPublics servicesPublics;

	public Utilisateur(Alimentation alimentation, BienConso bienConso, Logement logement, Transport transport, ServicesPublics servicesPublics){
		this.alimentation = alimentation;
		this.bienConso = bienConso;
		this.logement = logement;
		this.transport = transport;
		this. servicesPublics = servicesPublics;
	}

	public Alimentation getAlimentation() {
		return alimentation;
	}

	public void setAlimentation(Alimentation alimentation) {
		this.alimentation = alimentation;
	}

	public BienConso getBienConso() {
		return bienConso;
	}

	public void setBienConso(BienConso bienConso) {
		this.bienConso = bienConso;
	}

	public Logement getLogement() {
		return logement;
	}

	public void setLogement(Logement logement) {
		this.logement = logement;
	}

	public ServicesPublics getServicesPublics() {
		return servicesPublics;
	}

	public void setServicesPublics(ServicesPublics servicesPublics) {
		this.servicesPublics = servicesPublics;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public double calculerEmpreinte(){
		double empreinte;
		empreinte = this.alimentation.getImpact() + this.logement.getImpact() + this.bienConso.getImpact() + this.transport.getImpact() + this.servicesPublics.getImpact();
		return(empreinte);
	}

	public void detaillerEmpreinte(){
		System.out.println("Impact alimentation : " + this.alimentation.getImpact() + " tCO2eq\nImpact bienConso : " + this.bienConso.getImpact() +"tCO2eq\nImpact logement : " +
		this.logement.getImpact() +"tCO2eq\nImpact transport : " + this.transport.getImpact() +"tCO2eq\nImpact services publics : " + this.servicesPublics.getImpact());
	}
}
