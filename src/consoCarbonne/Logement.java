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

	public String toString(){
		return super.toString() + "superficie : " + this.superficie + "m2\nce : " + this.ce;
	}

	public static void main(String[] args) {
		Logement test = new Logement(25, CE.B, 2);
		System.out.println(test);
	}
}
