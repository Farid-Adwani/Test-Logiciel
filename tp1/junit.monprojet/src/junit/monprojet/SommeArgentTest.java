package junit.monprojet;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class SommeArgentTest {
	private SommeArgent m12CHF;
	private SommeArgent m14CHF;
	private SommeArgent m14USD;

	@Before
	public void setUp() {
		System.out.println("AVANT exécution d'une méthode de test");
		m12CHF = new SommeArgent(12, "CHF");
		m14CHF = new SommeArgent(14, "CHF");
		m14USD = new SommeArgent(14, "USD");
	}

	@After
	public void tearDown() {
		System.out.println("APRES exécution d'une méthode de test");
	}

	@Test
	public void testAddition() throws UniteDistincteException {
		SommeArgent expected = new SommeArgent(26, "CHF");
		SommeArgent result = m12CHF.add(m14CHF);
		Assert.assertTrue(expected.equals(result));
	}

	@Test
    public void testEquals() {
    SommeArgent m12CHF= new SommeArgent(  12,  "CHF") ;
    SommeArgent m14CHF= new	SommeArgent(  14,"CHF");
    SommeArgent m14USD= new	SommeArgent(  14,  "USD");
    Assert.assertTrue(m12CHF.equals(null));
    Assert.assertEquals(m12CHF, m12CHF);
    Assert.assertEquals(m12CHF, new SommeArgent(  12,  "CHF")); // (1)
    Assert.assertTrue(!m12CHF.equals(m14CHF));
    Assert.assertTrue(!m14USD.equals(m14CHF));
    }

	@Test
    public void testUniteDistincteException() throws UniteDistincteException {
    SommeArgent m1CHF= new SommeArgent (  1,  "CHF");
    SommeArgent m2USD= new SommeArgent (  2,  "USD");
    SommeArgent res= m2USD.add(m1CHF);

    }
}