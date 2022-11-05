package consoCarbonne;

public class Alimentation extends ConsoCarbonne{
	double txBoeuf;
	double txVege;

	public Alimentation(double txBoeuf, double txVege, int id){
		super(id);
		this.txBoeuf = txBoeuf;
		this.txVege = txVege;
		this.impact = 8 * txBoeuf + 1.6 * (1 - txVege - txBoeuf) + 0.9 * txVege;
	}

	public double gettxBoeuf(){
		return txBoeuf;
	}

	public void settxBoeuf(double txBoeuf){
		this.txBoeuf = txBoeuf;
	}

	public double gettxVege(){
		return txVege;
	}

	public void settxVege(double txVege){
		this.txVege = txVege;
	}

	public String toString(){
		return super.toString() + "txBoeuf : " + this.txBoeuf + "\ntxVege : " + this.txVege;
	}

	public static void main(String[] args) {
		Alimentation test = new Alimentation(0.5,0.5,1);
		System.out.println(test);
	}
}
