package fr.goffa.client.business.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.goffa.client.business.IClientBusiness;
import fr.goffa.client.dao.IClientDao;
import fr.goffa.client.dao.impl.ClientDaoImpl;
import fr.goffa.client.domain.Client;

public class ClientBusinessImpl implements IClientBusiness {
	private IClientDao clientDao = new ClientDaoImpl();
	private static Logger LOGGER = LoggerFactory.getLogger(ClientBusinessImpl.class);

	@Override
	public List<Client> findAll() {
		List<Client> clients = clientDao.findAll();
		LOGGER.info("les clients : {}", clients.size());

		return clients;
	}

	@Override
	public Client getClientById(Integer id) {
		Client client = clientDao.findOneById(id);
		return client;
	}

	@Override
	public void ajoutClient(Integer numClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email) {
		clientDao.ajoutClient(numClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
	}

	@Override
	public void modifierClient(Integer id, Integer numClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email) {
		clientDao.modifierClient(id, numClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);

	}
}
