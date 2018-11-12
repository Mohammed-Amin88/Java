package fr.goffa.collection;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CollectionServlet
 */
@WebServlet("/collection")

public class CollectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CollectionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<String> tableauCollection = new ArrayList<String>();

		tableauCollection.add("Eau");
		tableauCollection.add("Lait");
		tableauCollection.add("fromage");
		tableauCollection.add("Jus");
		tableauCollection.add("Pain");
		tableauCollection.add("Riz");
		tableauCollection.add("fruit");
		tableauCollection.add(0, "Chocolat");
		tableauCollection.remove(0);
		tableauCollection.remove(3);
		tableauCollection.remove("Pain");
		tableauCollection.set(2, "Frites");

		request.setAttribute("tableauProduits", tableauCollection);

		this.getServletContext().getRequestDispatcher("/WEB-INF/collection.jsp").forward(request, response);
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
