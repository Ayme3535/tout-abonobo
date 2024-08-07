
public class ProducerWithRisk extends Employe{
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
