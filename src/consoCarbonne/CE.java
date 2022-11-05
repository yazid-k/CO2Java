package consoCarbonne;

public enum CE {
	A(0.005), B(0.01), C(0.02), D(0.035), E(0.055), F(0.08), G(0.1);

	public double coeff;

	CE(double coeff){
		this.coeff = coeff;
	}

	public double getCoeff(){
		return this.coeff;
	}

	public void setCoeff(double coeff){
		this.coeff = coeff;
	}
}
