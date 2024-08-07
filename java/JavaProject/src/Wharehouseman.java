
public class Wharehouseman extends Employe{
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
