package fr.goffa.client.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.goffa.client.business.IClientBusiness;
import fr.goffa.client.business.impl.ClientBusinessImpl;
import fr.goffa.client.domain.Client;

/**
 * Servlet implementation class DetailClientServlet
 */
@WebServlet("/client")
public class DetailClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IClientBusiness clientBusiness = new ClientBusinessImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DetailClientServlet() {
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
		Client client = clientBusiness.getClientById(id);
		request.setAttribute("client", client);

		this.getServletContext().getRequestDispatcher("/WEB-INF/client/client.jsp").forward(request, response);
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
