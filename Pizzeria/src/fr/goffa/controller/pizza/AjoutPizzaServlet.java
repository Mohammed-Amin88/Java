package fr.goffa.controller.pizza;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.goffa.buisiness.pizza.PizzaBusiness;

/**
 * Servlet implementation class AjoutPizzaServlet
 */
@WebServlet("/ajout_pizza")
public class AjoutPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PizzaBusiness pizzaBz = new PizzaBusiness();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjoutPizzaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF//pizza/ajout_pizza.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String libelle = request.getParameter("libelle");
		String ref = request.getParameter("reference");
		Double prix = Double.valueOf(request.getParameter("prix"));
		String url = request.getParameter("url");

		pizzaBz.ajoutPizza(libelle, ref, prix, url);
		response.sendRedirect("pizzas");

	}

}
