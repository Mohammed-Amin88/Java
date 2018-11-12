package fr.goffa.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.goffa.utilisateur.Personne;

/**
 * Servlet implementation class Loginservlet
 */

@WebServlet("/login")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Loginservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String jstl = "Hello JSTL";
		Personne jack = new Personne("Dupond", "Jack", "1990-01-01", "0666775544", "jackdupond@gmail.fr",
				"05 rue de ff", "lille", "");
		String login = "abcd";
		String pass = "126555";
		Integer nombre1 = 5;
		Integer nombre2 = 3;

		request.setAttribute("helloJstl", jstl);
		request.setAttribute("jackInfos", jack);
		request.setAttribute("login", login);
		request.setAttribute("passWord", pass);
		request.setAttribute("nombre1", nombre1);
		request.setAttribute("nombre2", nombre2);

		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
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
