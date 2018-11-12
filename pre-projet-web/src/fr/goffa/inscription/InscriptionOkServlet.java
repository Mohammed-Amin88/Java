package fr.goffa.inscription;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InscriptionOkServlet
 */
@WebServlet("/inscriptionOk")
public class InscriptionOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InscriptionOkServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/inscriptionOk.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String dateNaissance = request.getParameter("date-naissance");
		String adresse = request.getParameter("adresse");
		String ville = request.getParameter("ville");
		String departement = request.getParameter("departement");
		String pays = request.getParameter("pays");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String comments = request.getParameter("comments");

		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("dateNaissance", dateNaissance);
		request.setAttribute("adresse", adresse);
		request.setAttribute("ville", ville);
		request.setAttribute("departement", departement);
		request.setAttribute("pays", pays);
		request.setAttribute("phone", phone);
		request.setAttribute("email", email);
		request.setAttribute("comments", comments);

		this.getServletContext().getRequestDispatcher("/WEB-INF/inscriptionOk.jsp").forward(request, response);
	}

}
