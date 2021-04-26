package DAOs;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Article;
import Model.Categorie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ArticleDAO  {

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
    public List<Article> selectAll() {
        EntityManager em = getEntityManager();
        List<Article> maListe = em.createQuery("select a from Article a", Article.class)
                .getResultList();
        return maListe;
    }

    public List<Article> selectAllByCategorie(String categorie) {
        EntityManager em = getEntityManager();
        List<Article> maListe = em.createQuery("select a from Article a where Categorie="+categorie, Article.class)
                .getResultList();
        return maListe;
    }

    public void create( Article article )  {
        EntityManager em = getEntityManager();
        em.persist(article);
        em.flush();

    }

    public void delete( Article article ) {
        EntityManager em = getEntityManager();
        em.remove(article);
        em.flush();
    }

    public Article update(Article obj) {
        EntityManager em = getEntityManager();
        em.persist(obj);
        em.flush();
        return obj;
    }

    public Article find( long id ){
        EntityManager em = getEntityManager();
        return em.find( Article.class, id);
    }



}