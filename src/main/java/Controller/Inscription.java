package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import DAOs.ClientDAO;
import Model.Client;

@WebServlet(name = "Inscription", value = "/Inscription")
public class Inscription extends HttpServlet {

    public Inscription() {
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
        String nom=request.getParameter("nom");
        String prenom=request.getParameter("prenom");
        String adresse=request.getParameter("adresse");
        String codePostal=request.getParameter("codepostal");
        String ville=request.getParameter("ville");
        String tel=request.getParameter("tel");
        String motDePasse=request.getParameter("motdepasse");
        Client utilisateur=new Client(email,nom,prenom,adresse,codePostal,ville,tel,motDePasse);
        ClientDAO clientDao=new ClientDAO();
        clientDao.create(utilisateur);
        RequestDispatcher view=request.getRequestDispatcher("identifier.jsp");
        view.forward(request, response);
    }
    }

