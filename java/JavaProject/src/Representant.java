
public class Representant extends Employe {
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
