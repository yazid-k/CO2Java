package consoCarbonne.tests;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import consoCarbonne.Alimentation;

/** Classe test Alimentation
 * @author KADIRI El Yazid GROSJEAN Adrien
 */
public class AlimentationTest {
	private static Alimentation aTest = new Alimentation(0, 0, 0);

	@BeforeClass
	public static void setUpTests(){
		aTest.setId(5);
		aTest.setimpact(10);
		aTest.settxBoeuf(0.5);
		aTest.settxVege(0.5);
	}

	@Test
	public void getId_returnsId(){
		int expected = 5;
		assertEquals(expected, aTest.getId());
	}

	@Test
	public void getImpact_returnsImpact(){
		double expected = 10;
		assertEquals(expected, aTest.getImpact(), 0.001);
	}

	@Test
	public void gettxBoeuf_returnstxBoeuf(){
		double expected = 0.5;
		assertEquals(expected, aTest.gettxBoeuf(),0.001);
	}

	@Test
	public void gettxVege_returnstxVege(){
		double expected = 0.5;
		assertEquals(expected, aTest.gettxVege(),0.001);
	}

	@Test
	public void toString_Alimentation_returnsDescription(){
		String expected = "Class : consoCarbonne.Alimentation\nid : 5\nimpact : 10.0 tCO2eq\ntxBoeuf : 0.5\ntxVege : 0.5";
		assertEquals(expected, aTest.toString());
	}
}
