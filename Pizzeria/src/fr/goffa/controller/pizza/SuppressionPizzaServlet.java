package fr.goffa.controller.pizza;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.goffa.buisiness.pizza.PizzaBusiness;

/**
 * Servlet implementation class SupPizzaServlet
 */
@WebServlet("/suppression_pizza")
public class SuppressionPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PizzaBusiness pizzaB = new PizzaBusiness();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SuppressionPizzaServlet() {
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
		pizzaB.supprimerPizza(id);
		response.sendRedirect("pizzas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect("pizzas");

	}

}
