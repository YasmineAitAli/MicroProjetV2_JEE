package DAOs;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Categorie;
import Model.Client;
import Model.Commande;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategorieDAO  {

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
    public List<String> selectAll() {
        EntityManager em = getEntityManager();
        List<String> maListe= em.createNativeQuery("select a from Categorie a", Categorie.class)
                .getResultList();
        return maListe;
    }


    public void create( Categorie obj )  {
        EntityManager em = getEntityManager();
        em.persist( obj );
        em.flush();

    }

    public void delete( Categorie obj) {
        EntityManager em = getEntityManager();
        em.remove( obj  );
        em.flush();

    }

    public Categorie update(Categorie obj) {
        EntityManager em = getEntityManager();
        em.persist(obj);
        em.flush();
        return obj;
    }

    public Categorie find( int id ){
        EntityManager em = getEntityManager();
        return em.find( Categorie.class, id );
    }

    public Categorie find(String categorie ){
        EntityManager em = getEntityManager();
        return em.find( Categorie.class, categorie );
    }


}