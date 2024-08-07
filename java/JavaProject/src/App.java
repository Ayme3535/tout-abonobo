import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        App app = new App();
        Staff myEmployees = app.new Staff();

        Independants inde = app.new Independants();
        List<Facture> facturesIndependant1 = new ArrayList<>();
        facturesIndependant1.add(new Facture("18 juin", "DEPLACEMENT"));
        facturesIndependant1.add(new Facture("19 juin", "MATERIEL"));
        facturesIndependant1.add(new Facture("11 juin", "DEPLACEMENT"));
        facturesIndependant1.add(new Facture("12 juin", "MATERIEL"));

        List<Facture> facturesIndependant2 = new ArrayList<>();
        facturesIndependant2.add(new Facture("13 juin", "MATERIEL"));
        facturesIndependant2.add(new Facture("14 juin", "MATERIEL"));
        facturesIndependant2.add(new Facture("15 juin", "MATERIEL"));
        facturesIndependant2.add(new Facture("16 juin", "MATERIEL"));

        List<Facture> facturesIndependant3 = new ArrayList<>();
        facturesIndependant3.add(new Facture("21 juin", "MATERIEL"));
        facturesIndependant3.add(new Facture("31 juin", "MATERIEL"));
        facturesIndependant3.add(new Facture("23 juin", "DEPLACEMENT"));
        facturesIndependant3.add(new Facture("1 juin", "MATERIEL"));

        inde.add(new Independant1("Samuel",1218, 3300,facturesIndependant1));
        inde.add(new Independant2("Lorik",1219, 3300,facturesIndependant2));
        inde.add(new Independant3("Etienne",1217, 3300,facturesIndependant3));

        myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
        myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
        myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
        myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
        myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
        myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));
        myEmployees.displaySalaries();
        inde.displaySalaries2();
        int moyenneFinale = myEmployees.displayAverageSalary() + inde.displayAverageSalary2();
        System.out.println("Salaire moyen :" + moyenneFinale / 9);
    }
    public class Staff {
        List<Employe> liste = new ArrayList<Employe>();
         public void add(Employe employe){
            liste.add(employe);
         }
  
        public void displaySalaries(){
          for(Employe employe : liste){
            System.out.println(employe.nom + ": " + employe.salaire());
          }
        }
        public int displayAverageSalary(){
            int moyenne = 0;
            for(Employe employe : liste){
                moyenne += employe.salaire();
              }
            return moyenne;
      }
}
    public class Independants {
      List<Independant> liste2 = new ArrayList<Independant>();
      public void add(Independant independant){
        liste2.add(independant);    
    }
      public void displaySalaries2(){
        for (Independant independant : liste2){
            System.out.println(independant.nom + ", independant : " + independant.salaire2());
        }
    }
      public int displayAverageSalary2(){
        int moyenne2 = 0;
        for (Independant independant : liste2){
            moyenne2 += independant.salaire2();
        }
        return moyenne2;
    }
  }
}
