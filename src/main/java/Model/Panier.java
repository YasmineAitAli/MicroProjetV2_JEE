package Model;

import java.util.Objects;

public class Panier {
    Article article;
    int quantite;

    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Panier panier = (Panier) o;
        // field comparison
        return Objects.equals(article.getCodeArticle(), panier.getArticle().getCodeArticle())
                && Objects.equals(quantite, panier.getQuantite());
    }
    public Panier() {
        super();
    }

    public Panier(Article article, int quantite) {
        super();
        this.article = article;
        this.quantite = quantite;
    }
    public Article getArticle() {
        return article;
    }
    public void setArticle(Article article) {
        this.article = article;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

}