package fr.goffa.controller.produit;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.goffa.bean.Produit;
import fr.goffa.business.produit.ProduitBusiness;

/**
 * Servlet implementation class ProduitBusinessServlet
 */
@WebServlet("/produits")
public class ProduitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProduitBusiness produitB = new ProduitBusiness();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProduitsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Produit> ProduitsAlimentaires = produitB.getProduits();

		request.setAttribute("ProduitsAlimentaires", ProduitsAlimentaires);

		this.getServletContext().getRequestDispatcher("/WEB-INF/produit/produits.jsp").forward(request, response);

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
