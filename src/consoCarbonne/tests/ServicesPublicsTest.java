package consoCarbonne.tests;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import consoCarbonne.ServicesPublics;
/** Classe test ServicesPublics
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public class ServicesPublicsTest {
	private static ServicesPublics ccTest = new ServicesPublics(0);

	@BeforeClass
	public static void setUpTests(){
		ccTest.setId(5);
		ccTest.setimpact(10);
	}

	@Test
	public void getId_ConsoCarbonne_returnsId(){
		int expected = 5;
		assertEquals(expected, ccTest.getId());
	}

	@Test
	public void getImpact_ConsoCarbonne_returnsImpact(){
		double expected = 10;
		assertEquals(expected, ccTest.getImpact(), 0.001);
	}

	@Test
	public void toString_ConsoCarbonne_returnsDescription(){
		String expected = "Class : consoCarbonne.ServicesPublics\nid : 5\nimpact : 10.0 tCO2eq\n";
		assertEquals(expected, ccTest.toString());
	}
}
