package fr.goffa.users;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class User_detaiServlet
 */
@WebServlet("/user_detail")
public class User_detaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public User_detaiServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = request.getParameter("url");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String dateDeNaissance = request.getParameter("dateDeNaissance");
		String numeroTelephone = request.getParameter("numeroTelephone");
		String mail = request.getParameter("mail");
		String numeroRue = request.getParameter("numerorue");
		String ville = request.getParameter("ville");

		request.setAttribute("url", url);
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("dateDeNaissance", dateDeNaissance);
		request.setAttribute("numeroTelephone", numeroTelephone);
		request.setAttribute("mail", mail);
		request.setAttribute("numeroRue", numeroRue);
		request.setAttribute("ville", ville);

		this.getServletContext().getRequestDispatcher("/WEB-INF/user_detail.jsp").forward(request, response);

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
