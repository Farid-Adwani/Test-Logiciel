package junit.monprojet;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PorteMonnaieTest {
	@Test
	public void testAjouteSomme() {
		PorteMonnaie p1 = new PorteMonnaie();
		SommeArgent s1 = new SommeArgent(18, "EUR");
		SommeArgent s2 = new SommeArgent(5, "USD");
		p1.ajouteSomme(s1);
		p1.ajouteSomme(s1);
		p1.ajouteSomme(s2);
		assertEquals(p1.getContenu().get("EUR"), Integer.valueOf(20));
		assertEquals(p1.getContenu().get("USD"), Integer.valueOf(5));

	}

	@Test
	public void testEquals() {
		PorteMonnaie p1 = new PorteMonnaie();
		PorteMonnaie p2 = new PorteMonnaie();
		SommeArgent s1 = new SommeArgent(5, "EUR");
		SommeArgent s2 = new SommeArgent(5, "EUR");
		SommeArgent s3 = new SommeArgent(5, "USD");
		p1.ajouteSomme(s1);
		p1.ajouteSomme(s3);
		p2.ajouteSomme(s2);
		p2.ajouteSomme(s3);
		assertTrue(p1.equals(p2));
		assertTrue(p2.equals(p1));
	}
}