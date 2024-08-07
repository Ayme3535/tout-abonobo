
public class WharehousemanWithRisk extends Employe{
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