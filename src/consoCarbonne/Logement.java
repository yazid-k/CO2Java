package consoCarbonne;

public class Logement extends ConsoCarbonne{
	int superficie;
	CE ce;

	public Logement(int superficie, CE ce, int id){
		super(id);
		this.superficie = superficie;
		this.ce = ce;
		this.impact = superficie * ce.getCoeff();
	}

	public int getSuperficie(){
		return superficie;
	}

	public void setSuperficie(int superficie){
		this.superficie = superficie;
	}

	public CE getCe(){
		return ce;
	}

	public void setCe(CE ce){
		this.ce = ce;
	}

	public static void detailLogementMoyen()
	{
		System.out.println("Le français moyen produit 2.7 tCO2eq vis-à-vis du logement : \nEnergie et utilités : 1696 kgCO2eq\nConstruction et gros entretien : 675 kgCO2eq\n" +
		"Equipements des logements : 335 kgCO2eq");
	}

	public String toString(){
		return super.toString() + "superficie : " + this.superficie + "m2\nce : " + this.ce;
	}

	public static void main(String[] args) {
		Logement test = new Logement(25, CE.B, 2);
		System.out.println(test);
	}
}
