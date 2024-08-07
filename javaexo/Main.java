import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(final String[] args) {
      final Staff myEmployees = new Staff();
      myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
      myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
      myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
      myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
      myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
      myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));
      myEmployees.displaySalaries();
      myEmployees.displayAverageSalary();
    }
    class Staff {
      List<Employe> liste = new ArrayList<Employe>();

      public void displaySalaries(){
        for(Employe employe : liste){
          System.out.println(employe.salaire());
        }
      }
      public void displayAverageSalary(){
        for(Employe employe : liste){
        
      }
    }
    public abstract class Employe{
      String nom;
      String prenom;
      int age;
      String date;
      public Employe(String nom, String prenom, int age, String date){
        this.nom = nom;
        this.prenom = prenom; 
        this.age = age;
        this.date = date;
    }
      public abstract int salaire();
  }

    class Salesman extends Employe{
     int argentGagne;

     public Salesman(String nom, String prenom, int age, String date, int argentGagne){
      super(nom, prenom, age, date);
      this.argentGagne = argentGagne;
     }
     @Override
     public int salaire(){
      int salaireSalesman = (argentGagne * 20 / 100)+ 400; 
      return salaireSalesman;
     }   
    }


    class Representant extends Employe{
      int argentGagne;
      
      public Representant(String nom, String prenom, int age, String date, int argentGagne){
        super(nom, prenom, age, date);
       this.argentGagne = argentGagne;
      }
      @Override
      public int salaire(){
        int salaireRepre = (argentGagne * 20 / 100)+ 800;
        return salaireRepre;
      } 

    }
    class Producer extends Employe{
      int produit;
      
      public Producer(String nom, String prenom, int age, String date, int produit){
       super(nom, prenom, age, date);
       this.produit = produit;
      }
      @Override
      public int salaire(){
        int salaireProducter = produit * 5;
        return salaireProducter;
      } 
    }


    class Wharehouseman extends Employe{
      int heure;
      
      public Wharehouseman(String nom, String prenom, int age, String date, int heure){
       super(nom, prenom, age, date);
       this.heure = heure;
      }
      @Override
      public int salaire(){
        int salaireWhare = heure * 65;
        return salaireWhare;
      } 
    }


    class ProducerWithRisk extends Employe{
      int produit;
      
      public ProducerWithRisk(String nom, String prenom, int age, String date, int produit){
       super(nom, prenom, age, date);
       this.produit = produit;
      }
      @Override
      public int salaire(){
        int salaireRiskProd = produit * 5 + 200;
        return salaireRiskProd;
      } 
    }


    class WharehousemanWithRisk extends Employe{
      int heure;
      public WharehousemanWithRisk(String nom, String prenom, int age, String date, int heure){
      super(nom, prenom, age, date);
       this.heure = heure;
      }
      @Override
      public int salaire(){
        int salaireRiskWhare = (heure * 65)+ 200;
        return salaireRiskWhare;
      } 
    }
  }
}