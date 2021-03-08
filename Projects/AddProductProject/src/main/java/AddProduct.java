
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.ecommerce.EProduct;
import com.ecommerce.HibernateUtil;

/**
 * Servlet implementation class AddProduct
 */
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("pname");
		BigDecimal price = new BigDecimal(request.getParameter("pprice"));
		try {
			PrintWriter out = response.getWriter();
			out.println("</body></html>");
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
			EProduct ep = new EProduct();
			ep.setName(name);
			ep.setPrice(price);
			ep.setDateAdded(new Date());
			session.save(ep);
			session.getTransaction().commit();
			List<EProduct> list = session.createQuery("from EProduct", EProduct.class).list();
			session.close();
			out.println("Added "+name +" for price "+price);
			out.println("<a href=\"index.jsp\">Go home</a><br>");
			out.println("</body></html>");	
		}
		catch (Exception ex) {
		throw ex;
		}	
	}

}
