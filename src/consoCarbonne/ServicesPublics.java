package consoCarbonne;

public class ServicesPublics extends ConsoCarbonne{
	public ServicesPublics(int id){
		super(id);
		this.impact = 1.5;
	}

	public static void detailServicesMoyen()
	{
		System.out.println("Le français moyen produit 1.5 tCO2eq vis-à-vis des services publiques : \nServices publiques : 1489 kgCO2eq");
	}
}
