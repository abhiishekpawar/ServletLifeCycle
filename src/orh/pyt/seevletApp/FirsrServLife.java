package orh.pyt.seevletApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirsrServLife extends GenericServlet {
	public FirsrServLife() {
		System.out.println("Default constructor is called");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() is called to initalize");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor='#e6e600'><h1> Student details</h1>"
				+"<h3>"+"Name: "+name+"</br>"
				+"Place: " +place+"</br></h3></body></html>");
		
		out.flush();
		out.close();
		System.out.println("Service()  executed!");		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method is called to close all "
				+ "the costly rsource");
	}

}
