package nl.hackexample.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StealLoginFromCookieServlet extends HttpServlet {

    private static final long serialVersionUID = 3390629554585283276L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getParameter("cookies");
        
        RequestDispatcher view = req.getRequestDispatcher("jsp/stealLoginFromCookie.jsp");
        view.forward(req, resp);
    }

}
