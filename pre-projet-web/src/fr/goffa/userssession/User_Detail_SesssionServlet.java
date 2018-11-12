package fr.goffa.userssession;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.goffa.utilisateur.Personne;

/**
 * Servlet implementation class User_Detail_SesssionServlet
 */
@WebServlet("/user_detail_session")
public class User_Detail_SesssionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public User_Detail_SesssionServlet() {
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

		/*
		 * Recupérer mon tableau de la session
		 */
		HttpSession session = request.getSession();
		ArrayList<Personne> tableauP = (ArrayList<Personne>) session.getAttribute("tableauPersonne");

		// recuperer l'élement situé à l'indice reçu en param
		Personne personne = tableauP.get(id);
		// envoie a lajsp d'un objet personne
		request.setAttribute("personne", personne);

		this.getServletContext().getRequestDispatcher("/WEB-INF/user_detail_session.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
