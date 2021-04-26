package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import Model.Article;
import DAOs.ArticleDAO;

@WebServlet(name = "GenererArticle", value = "/GenererArticle")
public class GenererArticle extends HttpServlet {
    public GenererArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        System.out.println("ça marche " + request.getParameter("param"));
        ArticleDAO articleDao=new ArticleDAO();
        Article article=articleDao.find(Integer.valueOf(request.getParameter("param")));
        request.setAttribute("article", article);

        RequestDispatcher view=request.getRequestDispatcher("/restreint/WebForm1.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
        doGet(request, response);
    }
}
