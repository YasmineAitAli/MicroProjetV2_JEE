package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.util.Date;
import java.util.List;

import Model.Client;
import Model.Commande;
import Model.LignesCommande;
import Model.Panier;
import DAOs.ClientDAO;
import DAOs.CommandeDAO;
import DAOs.LignesCommandeDAO;


@WebServlet(name = "AfficherCommandes", value = "/AfficherCommandes")
public class AfficherCommandes extends HttpServlet {
    public AfficherCommandes() {
        super();
        // TODO Auto-generated constructor stub
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        HttpSession session=request.getSession();
        Client utilisateur=(Client)session.getAttribute("utilisateur");
        List<Panier> monPanier=utilisateur.getPanier();

        for(int i=0;i<monPanier.size();i++)
        {
            Commande commande=new Commande(utilisateur,new Date());
            CommandeDAO commandeDao=new CommandeDAO();
            commandeDao.create(commande);
            commande=commandeDao.findLastRow();
            LignesCommande ligneCommande=new LignesCommande(commande,monPanier.get(i).getArticle(),monPanier.get(i).getQuantite());
            LignesCommandeDAO lignesCommandeDao=new LignesCommandeDAO();
            lignesCommandeDao.create(ligneCommande);
        }
        utilisateur.getPanier().clear();
        ClientDAO clientDao=new ClientDAO();
        utilisateur.setAchats(clientDao.selectAllbyClient(utilisateur.getId()));
        session.setAttribute("utilisateur",utilisateur);

        RequestDispatcher view=request.getRequestDispatcher("/restreint/voirCommandes.jsp");
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
