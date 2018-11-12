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
 * Servlet implementation class UsersServlet
 */
@WebServlet("/usersession")
public class UsersSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsersSessionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Personne amin = new Personne("GOFFA", "Mohammed-Amin", "1988-04-12", "0668704996", "gof122@hotmail.fr",
				"01 rue de fff", "lille", "Ressources/Images/vissage.png");

		Personne jack = new Personne("FOFANA", "Jack", "1989-06-25", "0655545258", "jack1989@hotmail.fr",
				"23 rue de rr", "lille", "Ressources/Images/visage 4.jpg");

		Personne imad = new Personne("AIT IGHIL", "Imad", "1990-03-25", "0777658923", "imad@gmail.fr", "45rue de paris",
				"paris", "Ressources/Images/visage 2.jpg");

		Personne george = new Personne("CAM", "George", "1980-07-25", "0666684477", "goerge@hotmail.fr",
				"22 rue de la fff", "lille", "Ressources/Images/visage 3.jpg");

		ArrayList<Personne> Personnes = new ArrayList<Personne>();

		Personnes.add(amin);
		Personnes.add(jack);
		Personnes.add(imad);
		Personnes.add(george);

		/*
		 * Ajout du tableau dans la session
		 */
		HttpSession session = request.getSession();
		session.setAttribute("tableauPersonne", Personnes);

		request.setAttribute("Personnes", Personnes);

		this.getServletContext().getRequestDispatcher("/WEB-INF/usersession.jsp").forward(request, response);

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
