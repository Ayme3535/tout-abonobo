
import java.util.ArrayList;
import java.util.List;

import Ingredient.Etat;

public class App {
    public static void main(String[] args){
        App app = new App();
        
        List<Ingredient> ingredient1 = new ArrayList<>();
        List<Ingredient> ingredient2 = new ArrayList<>();

        ingredient1.add(new Ingredient("Choucroute",Ingredient.Etat.CRUES, 500, "grammes"));
        ingredient1.add(new Ingredient("Lard", Ingredient.Etat.CRUS_ET_ENTIERS, 150, "grammes"));
        ingredient1.add(new Ingredient("Saucisse", Ingredient.Etat.CRUES_ET_ENTIERES, 2, ""));
        ingredient1.add(new Ingredient("Saucisse", Ingredient.Etat.CRUES_ET_ENTIERES, 3, ""));

        ingredient2.add(new Ingredient("Pomme de terre", Ingredient.Etat.CRUES, 5, ""));
        ingredient2.add(new Ingredient("Lait", Ingredient.Etat.ENTIER, 150, "litres"));
        ingredient2.add(new Ingredient("Saucisse", Ingredient.Etat.CRUES_ET_ENTIERES, 2, ""));

        Plat plat1 = app.new Plat("Choucroute", ingredient1);
        Plat plat2 = app.new Plat("Purée", ingredient2);

        
        System.out.println(plat1.equals(plat1));
        plat1.listeIngredient();
    }
    class Plat {
        String nom;
        List<Ingredient> ingredients;
        Plat(String nom, List<Ingredient>ingredients){
            this.nom = nom;
            this.ingredients = ingredients;
        }
        public void listeIngredient(){
          for(Ingredient ingredient : ingredients){
              System.out.println(this.nom + ": " +  ingredient.nom_aliment + " " +  ingredient.etat + " : " + ingredient.quantite + " " + ingredient.unite );
              if(ingredient.etat == ingredient.etat.CRUS || ingredient.etat == ingredient.etat.CRUES || ingredient.etat == ingredient.etat.CRUS_ET_ENTIERS || ingredient.etat == ingredient.etat.CRUES_ET_ENTIERES ){
                System.out.println(ingredient.nom_aliment + " doit être " + ingredient.cuire() + " à " + ingredient.temperature);
              }
          }
        }
    
  
    }
}
