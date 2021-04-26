package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import Model.Article;
import Model.Client;
import Model.Panier;
import DAOs.ArticleDAO;

@WebServlet(name = "AjouterAuPanier", value = "/AjouterAuPanier")
public class AjouterAuPanier extends HttpServlet {
    public AjouterAuPanier() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        HttpSession session=request.getSession();
        Client client=(Client)session.getAttribute("utilisateur");
        ArticleDAO articleDao=new ArticleDAO();

        Article article=articleDao.find(Integer.valueOf(request.getParameter("param")));
        int quantite=Integer.valueOf((request.getParameter("quantite")));
        System.out.println(request.getParameter("quantite"));
        System.out.println(article.getDesignation());
        client.ajouterAuPanier(new Panier(article,quantite));


        session.setAttribute("utilisateur", client);
        RequestDispatcher view=request.getRequestDispatcher("/restreint/WebForm2.jsp");
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
