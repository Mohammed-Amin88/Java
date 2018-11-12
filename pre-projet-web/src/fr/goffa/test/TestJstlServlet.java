package fr.goffa.test;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestJstlServlet
 */
@WebServlet("/test_jstl")

public class TestJstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestJstlServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer nombre = Integer.valueOf(request.getParameter("param1"));
		Integer nombre2 = Integer.valueOf(request.getParameter("param2"));

		request.setAttribute("ligne", nombre);
		request.setAttribute("colonne", nombre2);

		Random r = new Random();
		int ligneRandom = r.nextInt(100 - 1) + 1;
		int colonneRandom = r.nextInt(100 - 1) + 1;
		request.setAttribute("ligneRandom", ligneRandom);
		request.setAttribute("colonneRandom", colonneRandom);

		this.getServletContext().getRequestDispatcher("/WEB-INF/test_jstl.jsp").forward(request, response);
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
