package consoCarbonne;

public class BienConso extends ConsoCarbonne{
	double montant;

	public BienConso(double montant, int id){
		super(id);
		this.montant = montant;
		this.impact = montant / 1750;
	}

	public double getMontant(){
		return this.montant;
	}

	public void setMontant(double montant){
		this.montant = montant;
	}

	public static void detailBienConsonMoyen()
	{
		System.out.println("Le français moyen produit 2.6 tCO2eq vis-à-vis de la consommation : \nAchat et usages Internet et technologies : 1180 kgCO2eq\nAutres biens et services : 682 kgCO2eq\n" +
		"Habillement : 763 kgCO2eq");
	}

	public String toString(){
		return super.toString() + "montant : " + this.montant + " €";
	}
}
