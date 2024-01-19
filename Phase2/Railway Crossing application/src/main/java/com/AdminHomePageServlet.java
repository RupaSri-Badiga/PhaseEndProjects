package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/adminHomePage")
public class AdminHomePageServlet extends HttpServlet {
	private RailwayCrossingsDAO crossingDAO;

	public void init() {
		crossingDAO = new RailwayCrossingsDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Fetch all railway crossing details from the database
		List<RailwayCrossing> crossings = crossingDAO.getAllCrossings();

		// Pass the crossing details to the JSP page
		request.setAttribute("crossings", crossings);
		request.getRequestDispatcher("adminHome.jsp").forward(request, response);
	}
}