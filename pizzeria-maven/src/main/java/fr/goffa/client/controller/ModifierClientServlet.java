package fr.goffa.client.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.goffa.client.business.IClientBusiness;
import fr.goffa.client.business.impl.ClientBusinessImpl;
import fr.goffa.client.domain.Client;

/**
 * Servlet implementation class ModifierClientServlet
 */
@WebServlet("/modifier_client")
public class ModifierClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IClientBusiness clientBusiness = new ClientBusinessImpl();
	private static Logger LOGGER = LoggerFactory.getLogger(ModifierClientServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierClientServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));
		Client client = clientBusiness.getClientById(id);
		request.setAttribute("client", client);

		this.getServletContext().getRequestDispatcher("/WEB-INF/client/modifier_client.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Integer numClient = Integer.valueOf(request.getParameter("numero_client"));
		String nom = request.getParameter("Nom");
		String prenom = request.getParameter("Prenom");
		String adresse = request.getParameter("Adress");
		String telFixe = request.getParameter("Tel_Fixe");
		String telPortable = request.getParameter("Tel_Portable");
		String dateNaissance = request.getParameter("Date_Naissance");
		String email = request.getParameter("Email");

		clientBusiness.modifierClient(id, numClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
		response.sendRedirect("clients");
	}

}
