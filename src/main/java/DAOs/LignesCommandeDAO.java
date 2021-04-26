package DAOs;

import java.util.ArrayList;
import java.util.List;

import Model.LignesCommande;
import Model.Article;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LignesCommandeDAO  {
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
    public List<LignesCommande> selectAll() {
        EntityManager em = getEntityManager();
        List<LignesCommande> maListe = em.createNativeQuery("select a from LignesCommande a", Article.class)
                .getResultList();
        return maListe;
    }


    public void create( LignesCommande obj)  {
        EntityManager em = getEntityManager();
        em.persist(obj);
        em.flush();
    }

    public void delete( LignesCommande obj ) {
        EntityManager em = getEntityManager();
        em.remove(obj);
        em.flush();
    }

    public void update(LignesCommande obj) {
        EntityManager em = getEntityManager();
        em.persist(obj);
        em.flush();
    }


    public LignesCommande find( long id ){
        EntityManager em = getEntityManager();
        return em.find( LignesCommande.class, id);
    }

}