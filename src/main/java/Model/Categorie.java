package Model;

import javax.persistence.*;

@Entity
@Table(name="categories")
public class Categorie {
    @Id
    private int refCat;
    private String cat;

    public Categorie() {
        super();
    }

    public Categorie(int refCat, String cat) {
        super();
        this.refCat = refCat;
        this.cat = cat;
    }

    public int getRefCat() {
        return refCat;
    }

    public void setRefCat(int refCat) {
        this.refCat = refCat;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

}