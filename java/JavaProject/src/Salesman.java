
public class Salesman extends Employe {
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
