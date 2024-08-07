package vet.habit;


import java.util.ArrayList;
import java.util.List;

import vet.habit.Vetement.Materiel;
import vet.habit.Vetement.Type;

public class App {
    public static void main(String[] args) {
        App vetement = new App();

       List<Vetement> vetementTypes1 = new ArrayList<>();
       vetementTypes1.add(new Vetement(Type.PANTALON, Materiel.COTON));
       vetementTypes1.add(new Vetement(Type.PULL, Materiel.SYNTHETHIQUE));
       vetementTypes1.add(new Vetement(Type.SHORT, Materiel.LAINE));

        Collection collection = vetement.new Collection(vetementTypes1, "Bla", 2022, Saison.AUTONME);

        collection.listeCollection();
    }
    class Collection {
        String nom;
        List<Vetement> vetementTypes;
        int annee;
        int identifiant;
        Saison saison;
        Collection(List<Vetement> vetementTypes, String nom, int annee, Saison saison){
            this.vetementTypes = vetementTypes;
            this.nom = nom;
            this.annee = annee;
            this.saison = saison;
            this.identifiant = id();
        }
        public int id(){
            for(Vetement vetement : vetementTypes){
                this.identifiant += 1;
            }
            return identifiant;
        }
        public void listeCollection(){
            /*for (Vetement vetement : vetementTypes){
                   System.out.println(this.identifiant + ":" + vetement.type + " en " + vetement.materiel);
            }
        }   
    }
    public enum Saison {
        PRINTEMPS, HIVER, AUTONME, ETE
    }

}

