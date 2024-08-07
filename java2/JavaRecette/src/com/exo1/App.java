package com.exo1;

import java.util.ArrayList;
import java.util.List;

import com.exo1.Ingredient.Etat;

public class App {
    public static void main(String[] args){
        App app = new App();
        
        List<Ingredient> ingredient1 = new ArrayList<>();
        List<Ingredient> ingredient2 = new ArrayList<>();

        ingredient1.add(new Ingredient("Choucroute",Etat.CRUES, 500, "grammes"));
        ingredient1.add(new Ingredient("Lard", Etat.CRUS_ET_ENTIERS, 150, "grammes"));
        ingredient1.add(new Ingredient("Saucisse", Etat.CRUES_ET_ENTIERES, 2, ""));
        
        ingredient2.add(new Ingredient("Choucroute",Etat.CRUES, 500, "grammes"));
        ingredient2.add(new Ingredient("Lard", Etat.CRUS_ET_ENTIERS, 150, "grammes"));
        ingredient2.add(new Ingredient("Saucisse", Etat.CRUES_ET_ENTIERES, 2, ""));

        Plat plat1 = app.new Plat("Choucroute", ingredient1);
        Plat plat2 = app.new Plat("Purée", ingredient2);

        System.out.println(plat1.equals(plat1));
        System.out.println(plat1.equals(plat2));
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
              System.out.println(this.nom + " : " +  ingredient.nom_aliment + " " +  ingredient.etat + " : " + ingredient.quantite + " " + ingredient.unite );
              if(ingredient.etat == Etat.CRUS || ingredient.etat == Etat.CRUES || ingredient.etat == Etat.CRUS_ET_ENTIERS || ingredient.etat == Etat.CRUES_ET_ENTIERES ){
                System.out.println(ingredient.nom_aliment + " doit être " + ingredient.cuire() + " à " + ingredient.temperature + " degré");
              }
              if (ingredient.etat == Etat.COUPE) {
                System.out.println(ingredient.nom_aliment + " doit être " + ingredient.decouper());
              }
          }
        }
        public boolean equals (Plat autrePlat){
            List<Ingredient> name = new ArrayList<>();
            List<Ingredient> name2 = new ArrayList<>();
            for(Ingredient ingredient : this.ingredients){
                if(!autrePlat.ingredients.contains(ingredient) ){
                    name.add(ingredient);
                } 
            }
            for(Ingredient autreingrdient : autrePlat.ingredients){
                if(!ingredients.contains(autreingrdient)){
                    name2.add(autreingrdient);              
                  }
            }
        return (name.isEmpty() && name2.isEmpty());
    }
    }
}

