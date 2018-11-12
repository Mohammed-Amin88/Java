package fr.goffa.client.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void verfierEmailKOEmailNull() {
		String email = null;
		Boolean emailVerif = Utils.verifierEmail(email);
		assertEquals(emailVerif, false);
	}

	@Test
	public void verfierEmailKOEmailVide() {
		String email = "";
		Boolean emailVerif = Utils.verifierEmail(email);
		assertEquals(emailVerif, false);

	}

	@Test
	public void verfierEmailKOEmailOK() {
		String email = "prenom.nom@yahoo.fr";
		Boolean emailVerif = Utils.verifierEmail(email);
		assertEquals(emailVerif, true);

	}

	@Test
	public void verfierEmailKOEmail() {
		String email = "prenom.nomyahoo.fr";
		Boolean emailVerif = Utils.verifierEmail(email);
		assertEquals(emailVerif, false);

	}

	@Test
	public void verfierEmailKOEmail1() {
		String email = "prenom.nom@yahoo";
		Boolean emailVerif = Utils.verifierEmail(email);
		assertEquals(emailVerif, false);

	}

	@Test
	public void verifierTelPortableKoNull() {
		String telP = null;
		Boolean telPlVerif = Utils.verifierTelPortable(telP);
		assertEquals(telPlVerif, false);

	}

	@Test
	public void verifierTelPortableKOVide() {
		String telP = "";
		Boolean telPlVerif = Utils.verifierTelPortable(telP);
		assertEquals(telPlVerif, false);
	}

	@Test
	public void verifierTelPortableKOSS0() {
		String telP = "1668964970";
		Boolean telPlVerif = Utils.verifierTelPortable(telP);
		assertEquals(telPlVerif, false);

	}

	@Test
	public void verifierTelPortableKOMoins10Char() {
		String telP = "064970";
		Boolean telPlVerif = Utils.verifierTelPortable(telP);
		assertEquals(telPlVerif, false);

	}

	@Test
	public void verifierTelPortableKOOK() {
		String telP = "0668709649";
		Boolean telPlVerif = Utils.verifierTelPortable(telP);
		assertEquals(telPlVerif, true);

	}
}
