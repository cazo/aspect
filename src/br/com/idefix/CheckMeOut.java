package br.com.idefix;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckMeOut
 */
@WebServlet(description = "Just check me out", urlPatterns = { "/CheckMeOut" })
public class CheckMeOut extends HttpServlet {
	private static final long serialVersionUID = 198765433656431L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckMeOut() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String aspectType = (String)request.getParameter("aspect");
		if (aspectType != null && aspectType
				.equals("behavior")) {
			response.getWriter().print("passou lendo por aqui...");
		} else {
			response.getWriter().print("nenhum aspect conhecido...");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
