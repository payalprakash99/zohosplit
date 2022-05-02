package zohosplits.signuplogin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zohosplits.signuplogin.dao.UsersDao;
import zohosplits.signuplogin.model.Users;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/register")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UsersDao usersDao = new UsersDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home/local/ZOHOCORP/payal-13124/Softwares/eclipse-workspace/ZohoSplits/src/main/webapp/WEB-INF/views/signuploginpage.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String emailID = request.getParameter("emailID");
		
		Users users = new Users();
		users.setUserName(userName);
		users.setEmailID(emailID);
		users.setPassword(password);
		
		try {
			usersDao.registerUser(users);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/success.jsp");
		dispatcher.forward(request, response);	}

}
