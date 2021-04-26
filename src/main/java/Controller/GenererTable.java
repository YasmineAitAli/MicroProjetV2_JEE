package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.util.List;

import Model.Article;
import DAOs.ArticleDAO;
import DAOs.CategorieDAO;

@WebServlet(name = "GenererTable", value = "/GenererTable")
public class GenererTable extends HttpServlet {
    public GenererTable() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        String cat=(String) request.getParameter("categorie");

        CategorieDAO catDao=new CategorieDAO();
        ArticleDAO artDao=new ArticleDAO();

        List<Article> maListe=artDao.selectAllByCategorie(cat);
        HttpSession session=request.getSession();


        List<String> taListe=catDao.selectAll();
        session.setAttribute("selected", cat);
        session.setAttribute("taListe", taListe);
        request.setAttribute("maListe", maListe);

        RequestDispatcher view=request.getRequestDispatcher("/restreint/WebForm2.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
