package consoCarbonne;

public class ConsoCarbonne {
	int	id;
	double impact;

	public ConsoCarbonne(int id){
		this.id = id;
		this.impact = 0;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public double getImpact(){
		return impact;
	}

	public void setimpact(double impact){
		this.impact = impact;
	}

	public String toString(){
		return "Class : " + this.getClass().getName() + "\nid : " + id + "\nimpact : " + impact + "tCO2eq\n";
	}

	public interface Comparable{}
}
