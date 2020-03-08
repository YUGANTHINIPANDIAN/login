package niitpro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pro1
 */
@WebServlet("/pro1")
public class pro1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pro1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
         PrintWriter out = response.getWriter();
         out.println("<html>");
out.println("<head>");
out.println("<title>web page</title>");
out.println("</head>");
out.println("<body>");
out.println("<form action='submitservlet' method='post'>");
out.println("<table>");
out.println("<tr>");
out.println("<td>username</td>");
out.println("<td><input type = 'text' name='uname'></td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>password</td>");
out.println("<td><input type = 'password' name = 'pwd'></td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td><input type = 'submit' value ='login'></td>");
out.println("<td><input type = 'reset' value ='cancel'></td>");
out.println("</tr>");
out.println("</table>");
out.println("</form>");

out.println("</body>");
out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
