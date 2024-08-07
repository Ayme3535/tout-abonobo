public class Ingredient {
    String nom_aliment;
    int quantite;
    String unite;
    int temperature;
    Etat etat;
    Ingredient(String nom_aliment, Etat etat, int quantite, String unite){
        this.nom_aliment = nom_aliment;
        this.etat = etat;
        this.quantite = quantite;
        
        this.temperature = hasard();
    }
    public enum Etat{
        CRUS,CRUES,
        CRUS_ET_ENTIERS,CRUES_ET_ENTIERES,
        COUPE,ENTIER,
        CUITES,CUITS,
        CUITES_ET_ENTIERES,CUITS_ET_ENTIERS
    }
    public boolean equals(Ingredient ingredient){
        return(this.nom_aliment.equals(ingredient.nom_aliment) && this.etat.equals(ingredient.etat)) ;
      }

    public Etat cuire(){
       switch (etat) {
        case CRUES:
            return Ingredient.Etat.CUITES;

        case CRUS:
        return Ingredient.Etat.CUITS;
           
        case CRUES_ET_ENTIERES :
        return Ingredient.Etat.CUITES_ET_ENTIERES;

        case CRUS_ET_ENTIERS:
        return Ingredient.Etat.CUITS_ET_ENTIERS;

        default:
            return etat;
       }
    }
    public int hasard(){
        if(this.etat == etat.CRUS || this.etat == etat.CRUES || this.etat == etat.CRUS_ET_ENTIERS || this.etat == etat.CRUES_ET_ENTIERES ){
            int min = 50;
            int max = 400;
            int random = (int)(Math.random() * (max - min + 1) + min);
            return random;  
        }
        else return 0;
    }
    
}
