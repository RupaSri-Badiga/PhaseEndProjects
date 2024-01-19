package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/addToFavorites")
public class AddToFavoritesServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String crossingId = request.getParameter("crossingId");
		if (crossingId != null && !crossingId.isEmpty()) {
			int railwayCrossingId = Integer.parseInt(crossingId);
			// Perform the database operation to add the crossing to favorites
			RailwayCrossingsDAO crossingDAO = new RailwayCrossingsDAO();
			crossingDAO.addToFavorites(railwayCrossingId); // Implement this method in RailwayCrossingDAO
		}
		// Redirect back to the userHome.jsp page
		response.sendRedirect("userHome.jsp");
	}
}