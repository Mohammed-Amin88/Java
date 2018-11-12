package fr.goffa.client.dao;

import java.util.List;

import fr.goffa.client.domain.Client;

public interface IClientDao {

	public List<Client> findAll();

	public Client findOneById(Integer id);

	public void ajoutClient(Integer numClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email);

	public void modifierClient(Integer id, Integer numClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email);
}
