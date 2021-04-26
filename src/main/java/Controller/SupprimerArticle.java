package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import Model.Article;
import Model.Client;
import Model.Panier;
import DAOs.ArticleDAO;

@WebServlet(name = "SupprimerArticle", value = "/SupprimerArticle")
public class SupprimerArticle extends HttpServlet {
    public SupprimerArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());

        HttpSession session=request.getSession();
        int articleaSupprimer=Integer.valueOf(request.getParameter("articleasupp"));
        int quantite=Integer.valueOf(request.getParameter("quantite"));
        Client utilisateur=(Client)session.getAttribute("utilisateur");
        ArticleDAO articleDao=new ArticleDAO();
        Article article=articleDao.find(articleaSupprimer);
        Panier panier=new Panier(article,quantite);
        utilisateur.SupprimerDuPanier(panier);
        session.setAttribute("utilisateur", utilisateur);

        RequestDispatcher view=request.getRequestDispatcher("/restreint/voirPanier.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
        doGet(request, response);
    }
}
