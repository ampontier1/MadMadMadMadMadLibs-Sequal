package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLibMaker;

/**
 * Servlet implementation class showWordsServlet
 */
@WebServlet("/showWordsServlet")
public class showWordsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showWordsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String words = "words";
	    //request.setAttribute("words", words); // add to request
	    //request.getSession().setAttribute("words", words); // add to session
	    //this.getServletConfig().getServletContext().setAttribute("words", words); // add to application context
	    //request.getRequestDispatcher("/getWordsServlet").forward(request, response);
		//request.getSession().getAttribute(words);
		
		MadLibMaker newWords = (MadLibMaker) request.getSession().getAttribute(words);
		
		request.setAttribute("wonderfulWordPlay", newWords);
		
		getServletContext().getRequestDispatcher("/fun.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
