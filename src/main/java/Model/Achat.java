package Model;

import java.util.Date;

public class Achat {
    private int codeArticle;
    private String designation;
    private double prix;
    private int qteCde;
    private double totale;
    private Date dateCommande;


    public Achat() {
        super();
    }
    public Achat(int codeArticle, String designation, double prix, int qteCde, double totale, Date dateCommande) {
        super();
        this.codeArticle = codeArticle;
        this.designation = designation;
        this.prix = prix;
        this.qteCde = qteCde;
        this.totale = totale;
        this.dateCommande = dateCommande;
    }
    public int getCodeArticle() {
        return codeArticle;
    }
    public void setCodeArticle(int codeArticle) {
        this.codeArticle = codeArticle;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getQteCde() {
        return qteCde;
    }
    public void setQteCde(int qteCde) {
        this.qteCde = qteCde;
    }
    public double getTotale() {
        return totale;
    }
    public void setTotale(double totale) {
        this.totale = totale;
    }
    public Date getDateCommande() {
        return dateCommande;
    }
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

}