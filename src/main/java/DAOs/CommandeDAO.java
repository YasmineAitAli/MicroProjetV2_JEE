package DAOs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Commande;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CommandeDAO{
    public static EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GI4");
        EntityManager em = emf.createEntityManager();
        return em;
    }
    /*	em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		em.close();
	*/
    public List<Commande> selectAll() {
        EntityManager em = getEntityManager();
        List<Commande> maListe = em.createQuery("select a from Commande a", Commande.class)
                .getResultList();
        return maListe;
    }

    public void create( Commande obj )  {
        EntityManager em = getEntityManager();
        em.persist(obj);
        em.flush();

    }


    public void delete( Commande commande) {
        EntityManager em = getEntityManager();
        em.remove(commande);
        em.flush();

    }

    public Commande update(Commande obj) {
        EntityManager em = getEntityManager();
        em.persist(obj);
        em.flush();
        return obj;

    }


    public Commande find(int id){
        EntityManager em = getEntityManager();
        return em.find( Commande.class, id );
    }


    public  Commande findLastRow(){
        EntityManager em = getEntityManager();
        return  em.find(Commande.class,1);


    }

}