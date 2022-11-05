package consoCarbonne;

public class Transport extends ConsoCarbonne{
	boolean possede;
	Taille taille;
	int kilomAnnee;
	int amortissement;
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

	public boolean getPossede(){
		return this.possede;
	}

	public void setPossede(boolean possede){
		this.possede = possede;
	}

	public Taille getTaille(){
		return this.taille;
	}

	public void setTaille(Taille taille){
		this.taille = taille;
	}

	public int getKilomAnnee(){
		return this.kilomAnnee;
	}

	public void setKilmonAnnee(int kilomAnnee){
		this.kilomAnnee = kilomAnnee;
	}

	public int getAmortissement(){
		return this.amortissement;
	}

	public void setAmortissement(int amortissement){
		this.amortissement = amortissement;
	}

	public static void detailTransportMoyen()
	{
		System.out.println("Le français moyen produit 2.9 tCO2eq vis-à-vis du transport : \nVoiture : 1972 kgCO2eq\nAvion : 480 kgCO2eq\nFret et messagerie : 383 kgCO2eq\n" +
		"Train et bus : 85 kgCO2eq");
	}

	public String toString(){
		return super.toString() + "possede : " + this.possede + "\ntaille : " + this.taille + "\nkilomAnnee : " + this.kilomAnnee + " km\namortissement : " + this.amortissement;
	}

	public static void main(String[] args) {
		Transport test = new Transport(true, Taille.P, 1000, 1, 3);
		detailTransportMoyen();
		System.out.println(test);
	}
}
