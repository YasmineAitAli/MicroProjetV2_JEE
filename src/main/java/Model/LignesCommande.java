package Model;

import javax.persistence.*;

@Entity
@Table(name="lignescommandes")
public class LignesCommande {
    @Id
    @ManyToOne
    private Commande commande;
    @Id
    @ManyToOne
    private Article article;
    private int qteCde;

    public LignesCommande() {
        super();
    }

    public LignesCommande(Commande commande, Article article, int qteCde) {
        super();
        this.commande = commande;
        this.article = article;
        this.qteCde = qteCde;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQteCde() {
        return qteCde;
    }

    public void setQteCde(int qteCde) {
        this.qteCde = qteCde;
    }
}
