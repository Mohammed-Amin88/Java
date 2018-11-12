package fr.goffa.client.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {
	private static Logger LOGGER = LoggerFactory.getLogger(Utils.class);

	public static Boolean verifierEmail(String email) {
		Boolean correct = true;
		if (email == null) {
			LOGGER.info("l'adresse mail est null");
			correct = false;
		} else if ("".equals(email)) {
			LOGGER.info("l'adresse mail est vide");
			correct = false;
		} else if (!email.contains("@")) {
			LOGGER.info("l'adresse mail n'est pas valide il manque le char @");
			correct = false;

		} else if (!email.endsWith(".fr") && !email.endsWith(".com")) {
			LOGGER.info("l'adress mail n'est pas valide il manque le .fr ou .com à la fin");
			correct = false;

		}
		return correct;

	}

	public static Boolean verifierTelPortable(String telP) {

		Boolean correct = true;
		if (telP == null) {
			LOGGER.info("telephone portable est null");
			correct = false;
		} else if ("".equals(telP)) {
			LOGGER.info("telephone portable est vide");
			correct = false;
		} else if (!telP.startsWith("0")) {
			LOGGER.info("telephone portable n'est pas valide il manque le 0");
			correct = false;

		} else if (telP.length() != 10) {
			LOGGER.info(" le numero de telephone portable est incomplet");
			correct = false;

		}
		return correct;

	}

}
