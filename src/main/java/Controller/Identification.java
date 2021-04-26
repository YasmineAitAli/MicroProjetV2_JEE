package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.util.List;
import Model.Categorie;
import Model.Client;
import DAOs.CategorieDAO;
import DAOs.ClientDAO;

@WebServlet(name = "Identification", value = "/Identification")
public class Identification extends HttpServlet {
    public Identification() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        String email=request.getParameter("email");
        String motdepasse=(String)request.getParameter("motdepasse");
        ClientDAO clientDao= new ClientDAO();
        Client client=clientDao.find(email);
        HttpSession session=request.getSession();
        CategorieDAO catDao=new CategorieDAO();



        System.out.println(motdepasse+" "+client.getMotDePasse());

        if(client != null && motdepasse.matches(client.getMotDePasse()))
        {
            List<String> taListe=catDao.selectAll();
            session.setAttribute("taListe", taListe);
            session.setAttribute("utilisateur",client);

            RequestDispatcher view=request.getRequestDispatcher("acceuil1.jsp");
            view.forward(request, response);
        }
        else
        {
            RequestDispatcher view=request.getRequestDispatcher("identifier.jsp");
            view.forward(request, response);
        }
    }
}

