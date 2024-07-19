package servlet10Session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/redirect")
public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String em = req.getParameter("email");
		String pass = req.getParameter("pass");

		if (em.equals("sudhanshu@gmail.com") && pass.equals("26022004")) {
		
			HttpSession session = req.getSession();
			session.setAttribute("name_key", "SUDHANSHU GUPTA");
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		} else {
			resp.setContentType("text/html"); // This defines the html page into web page otherwise all of the coding in
												// html page will be shown.
			PrintWriter out = resp.getWriter();
			out.print("<h3 style='color:red'>Email And Password are not Matched !!!</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp); // This includes both , the above print statement and index.html on one page.
		}

	}
}