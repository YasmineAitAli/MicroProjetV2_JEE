package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDB {
    private Connection connexion=null;
    private Statement instruction;
    protected ResultSet resultat;
    private static ConnectionDB instance=null;

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public ConnectionDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }

        catch (Exception e)
        {
            System.err.println("Problème de pilote");
        }

        try
        {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            instruction = connexion.createStatement();
            String query = "SELECT COUNT(*) FROM information_schema.tables WHERE table_schema='mydb'";
            resultat = instruction.executeQuery(query);
            resultat.next();
            boolean exists = resultat.getInt("COUNT(*)") > 0;
            if(!exists)
            {
                String sql="CREATE DATABASE mydb;" +
                        "USE mydb;" +
                        "CREATE TABLE clients( id INT(10) AUTO_INCREMENT, email  VARCHAR(30), nom VARCHAR(30), prenom VARCHAR(30), adresse VARCHAR(30),codepostal VARCHAR(30),ville VARCHAR(30),tel VARCHAR(30),motdepasse VARCHAR(100), PRIMARY KEY(id));" +
                        "CREATE TABLE commandes( numcommande INT(10) AUTO_INCREMENT, codeclient INT(10),datecommande DATE, PRIMARY KEY(numcommande), FOREIGN KEY(codeclient) REFERENCES clients(id) );" +
                        "CREATE TABLE categories(refcat INT(10),cat VARCHAR(30),PRIMARY KEY(refcat));" +
                        "CREATE TABLE articles(codearticle INT(10) AUTO_INCREMENT,designation VARCHAR(255),prix DOUBLE,stock INT(10),categorie INT(10),image BLOB,PRIMARY KEY(codearticle),FOREIGN KEY(categorie) REFERENCES categories(refcat));" +
                        "CREATE TABLE lignescommandes(numcommande INT(10),codearticle INT(10),qtecde INT(10),FOREIGN KEY(numcommande) REFERENCES commandes(numcommande),FOREIGN KEY(codearticle) REFERENCES articles(codearticle));";
                instruction.executeUpdate(sql);
                System.out.println("Database created !");

                //conn.close();


            }
            else
            {
                String sql="USE mydb;";
                instruction.executeUpdate(sql);
            }

        }

        catch(SQLException ex)
        {
            System.err.println("Base de données non trouvée ou requête incorrecte");
            System.out.println("SQLException : "+ ex.getMessage());
            System.out.println("SQLState : "+ ex.getSQLState());
            System.out.println("VendorError : "+ ex.getErrorCode());

        }
    }


    public static ConnectionDB getInstance()
    {
        if(instance == null)
        {
            instance= new ConnectionDB();
        }

        return instance;
    }

}

