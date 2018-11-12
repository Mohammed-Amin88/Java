package fr.goffa.client.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.goffa.client.dao.IClientDao;
import fr.goffa.client.domain.Client;

public class ClientDaoImpl implements IClientDao {

	@Override
	public List<Client> findAll() {
		List<Client> listeClients = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift"
							+ "=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "mspe1988");
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM client");
			ResultSet resultat = ps.executeQuery();
			while (resultat.next()) {
				Integer id = resultat.getInt("id");
				Integer numClient = resultat.getInt("numero_client");
				String nom = resultat.getString("Nom");
				String prenom = resultat.getString("Prenom");
				String adresse = resultat.getString("Adress");
				String telFixe = resultat.getString("Tel_Fixe");
				String telPortable = resultat.getString("Tel_Portable");
				String dateNaissance = resultat.getString("Date_Naissance");
				String email = resultat.getString("Email");

				Client c = new Client(id, numClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
				listeClients.add(c);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listeClients;
	}

	@Override
	public Client findOneById(Integer id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift="
							+ "-true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "mspe1988");
			PreparedStatement ps = cnx.prepareStatement(
					"SELECT id ,numero_client,Nom,Prenom,Adress,Tel_Fixe,Tel_Portable,Date_Naissance,Email FROM client WHERE id=?");
			ps.setInt(1, id);
			ResultSet resultat = ps.executeQuery();
			while (resultat.next()) {
				Integer idBD = resultat.getInt("id");
				Integer numClient = resultat.getInt("numero_client");
				String nom = resultat.getString("Nom");
				String prenom = resultat.getString("Prenom");
				String adresse = resultat.getString("Adress");
				String telFixe = resultat.getString("Tel_Fixe");
				String telPortable = resultat.getString("Tel_Portable");
				String dateNaissance = resultat.getString("Date_Naissance");
				String email = resultat.getString("Email");

				Client c = new Client(id, numClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
				return c;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void ajoutClient(Integer numClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "mspe1988");

			PreparedStatement ps = cnx.prepareStatement(
					"INSERT INTO client(numero_client,Nom,Prenom,Adress,Tel_Fixe,Tel_Portable,Date_Naissance,Email) VALUES (?,?,?,?,?,?,?,?)");
			ps.setInt(1, numClient);
			ps.setString(2, nom);
			ps.setString(3, prenom);
			ps.setString(4, adresse);
			ps.setString(5, telFixe);
			ps.setString(6, telPortable);
			ps.setString(7, dateNaissance);
			ps.setString(8, email);

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Override
	public void modifierClient(Integer id, Integer numClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift"
							+ "=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "mspe1988");

			PreparedStatement ps = cnx.prepareStatement(
					"UPDATE client SET numero_client = ?, Nom = ?, Prenom= ?, Adress = ? ,Tel_fixe = ?,Tel_Portable = ?, Date_Naissance = ? ,Email = ? WHERE id = ?");
			ps.setInt(1, numClient);
			ps.setString(2, nom);
			ps.setString(3, prenom);
			ps.setString(4, adresse);
			ps.setString(5, telFixe);
			ps.setString(6, telPortable);
			ps.setString(7, dateNaissance);
			ps.setString(8, email);
			ps.setInt(9, id);

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
