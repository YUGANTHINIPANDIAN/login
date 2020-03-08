package niitpro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class submitservlet
 */
@WebServlet("/submitservlet")
public class submitservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public submitservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String user = request.getParameter("uname");
		String pass = request.getParameter("pwd");
		if(user.equals("yuga")&&pass.equals("yuga@123"))
		{
			RequestDispatcher dis = getServletContext().getRequestDispatcher("/welcomeServlet");
			dis.forward(request,response);
		}
		else
		{

			RequestDispatcher dis = getServletContext().getRequestDispatcher("/HomeServlet");
			dis.forward(request,response);
			PrintWriter out=response.getWriter();
			out.println("invalid login");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
