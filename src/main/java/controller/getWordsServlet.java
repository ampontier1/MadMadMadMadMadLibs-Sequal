package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLibMaker;

/**
 * Servlet implementation class getWordsServlet
 */
@WebServlet("/getWordsServlet")
public class getWordsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWordsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String noun = request.getParameter("noun");
		String verb = request.getParameter("verb");
		String adverb = request.getParameter("adverb");
		String adjective = request.getParameter("adjective");
		String bang = request.getParameter("bang");
		
		if (noun.isEmpty() || verb.isEmpty() || adverb.isEmpty() || adjective.isEmpty() || bang.isEmpty() || noun == null || verb == null || adverb == null || adjective == null || bang == null) {
			
			getServletContext().getRequestDispatcher("/empty.jsp").forward(request, response);
			
		} else {
			
			MadLibMaker newWords = new MadLibMaker(noun, verb, adverb, adjective, bang);
			
			request.getSession().setAttribute("words" , newWords);
			
		}
		
	}

}
