package fr.goffa.client.business.impl;

import java.util.List;

import fr.goffa.client.business.IClientBusiness;
import fr.goffa.client.dao.IClientDao;
import fr.goffa.client.dao.impl.ClientDaoImpl;
import fr.goffa.client.domain.Client;

public class ClientBusinessImpl implements IClientBusiness {
	private IClientDao clientDao = new ClientDaoImpl();

	@Override
	public List<Client> findAll() {
		List<Client> listeClients = clientDao.findAll();

		return listeClients;
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
