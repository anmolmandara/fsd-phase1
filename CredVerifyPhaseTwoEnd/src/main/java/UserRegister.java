

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.HibernateUtil;
import com.example.Users;

/**
 * Servlet implementation class UserRegister
 */
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			PrintWriter out = response.getWriter();
			out.println("</body></html>");
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
			Users u = new Users();
			u.setName(name);
			u.setEmail(email);
			u.setUsername(username);
			u.setPassword(password);
			u.setDateAdded(new Date());
			session.save(u);
			session.getTransaction().commit();
			session.close();
			out.println("Account created for "+name + "<br>With email: "+email+"<br>With username: "+username+"<br> With password: "+password);
			out.println("<br><br><a href=\"login.jsp\">Login</a><br>");
			out.println("<br><a href=\"index.jsp\">Go back to homepage</a><br>");
			out.println("</body></html>");	
		}
		catch (Exception ex) {
		throw ex;
		}	
	}
}
