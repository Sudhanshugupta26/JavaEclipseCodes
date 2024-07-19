package serverlet2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// press ctrl + space for recommendations on methods and keywords in java.

@SuppressWarnings("serial")
public class Myservlet extends HttpServlet
{										
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();	
		out.print("I am Sudhanshu Gupta");
		System.out.println("I am Sudhanshu Gupta");
	}
}
