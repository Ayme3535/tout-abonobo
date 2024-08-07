import java.util.List;
public class Independant {
    String nom;
    int numero;
    int factureFixe;
    List<Facture> factures;
    public Independant(String nom, int numero, int factureFixe,List<Facture> factures){
      this.nom = nom;
      this.numero = numero;
      this.factureFixe = factureFixe;
      this.factures = factures;
  }
    public int salaire2(){ 
     int salaireFinal = 0;
     for  (Facture facture: factures){
        if (!facture.frais.equals("DEPLACEMENT") )
        salaireFinal += facture.factureHasard;
     }
    return salaireFinal;
    };
    public int calculSalaire() {
        return 0;
    }
}
