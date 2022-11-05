package consoCarbonne;

public enum Taille {
	P(4.2),G(19);

	double conso;

	Taille(double conso){
		this.conso = conso;
	}

	public double getConso(){
		return this.conso;
	}
}
