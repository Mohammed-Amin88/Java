package fr.goffa.client.business;

import java.util.List;

import fr.goffa.client.domain.Client;

public interface IClientBusiness {

	public List<Client> findAll();

	public Client getClientById(Integer id);

	public void ajoutClient(Integer numClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email);

	public void modifierClient(Integer id, Integer numClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email);

}
