package org.thisApp.loginApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thisApp.dto.User;
import org.thisApp.service.LoginService;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userID = request.getParameter("userID");
		String password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticatePassword(userID, password);
		if (result) {
			User user = loginService.getUserDetails(userID);
			request.getSession().setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response );
			return;
		} else {
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
