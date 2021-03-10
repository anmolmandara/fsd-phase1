
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.Dao;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			authenticate(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws Exception {

		RequestDispatcher rd = null;
		Dao log = new Dao();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (log.validate(username, password)) {
			rd=request.getRequestDispatcher("loginsuccess.jsp");
			rd.forward(request, response);

		} else {
			rd=request.getRequestDispatcher("loginfailed.jsp");
			rd.forward(request, response);
		}
	}
}
