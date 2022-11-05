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

	public String toString(){
		return super.toString() + "montant : " + this.montant + " €";
	}
}
