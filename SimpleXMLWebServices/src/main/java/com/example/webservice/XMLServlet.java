package com.example.webservice;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class XMLServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3207228810829310267L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/xml");
        response.getWriter().write("<message>Hello, World!</message>");
    }
}
