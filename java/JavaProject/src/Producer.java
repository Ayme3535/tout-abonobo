
public class Producer extends Employe{
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
