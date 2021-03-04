package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.DBConnection;

/**
 * Servlet implementation class ProductsToFind
 */
public class ProductsToFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductsToFind() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");

		try {
			PrintWriter out = response.getWriter();
			out.println("<html><body>");

			InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
			Properties props = new Properties();
			props.load(in);

			DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"),
					props.getProperty("password"));
			Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);

			ResultSet rst = stmt.executeQuery("select * from cars where id ="+id);

			
			if(rst.next()) {
				out.println("Product ID, "+rst.getInt("id")+ ", was found. <br> Name: "+rst.getString("name")+"<br> Price: "+rst.getBigDecimal("price")+"<br>");
				out.println("<a href=\"index.html\"> Back to home page</a>");
			}
			else {
				out.println("Product ID, "+id+", was not found. <br>" +"<a href=\"index.html\"> Back to home page</a>");
			}

			stmt.close();

			out.println("</body></html>");
			conn.closeConnection();
		

			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}		

}
