package vet.habit;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import vet.habit.Vetement;  

import vet.habit.Vetement.Materiel;
import vet.habit.Vetement.Type;

public class App {
    public static final Random aleatoire = new Random();
    public static void main(String[] args) {
        App vetement = new App();
        /*List<Collection> collections = vetement.creationCollection();
        
        for (Collection collection : collections){
            collection.listeCollection();
        }*/

        List<Vetement> vetements = Vetement.filterClothes();
        for (Vetement unvetement : vetements){
            unvetement.listeVetement(vetements);
        }

    }
    
    public List <Collection> creationCollection(){
        List<Collection> collections = new ArrayList<>();
        for (int i = 0; i < 5 ; i++){
            List<Vetement> vetementTypes1 = new ArrayList<>();
            for (int z = 0; z < 2 ; z ++){
                vetementTypes1.add(new Vetement(Vetement.Type.values()[aleatoire.nextInt(Vetement.Type.values().length)], Vetement.Materiel.values()[aleatoire.nextInt(Vetement.Materiel.values().length)]));
            }
            String str = "";
            for (int y = 0; y < 4; y++){
                char c = (char)(aleatoire.nextInt(26) + 97);
                str = str + c;
            }
            String nom = str ;
            Ville ville = Ville.values()[aleatoire.nextInt(Ville.values().length)];
            int annee = 2015 + aleatoire.nextInt(2023 - 2015);
            Saison saison = Saison.values()[aleatoire.nextInt(Saison.values().length)];

            collections.add(new Collection(vetementTypes1,nom , annee, saison, ville));
        } 
        return collections;
    }
    class Collection {
        String nom;
        Ville ville;
        List<Vetement> vetementTypes;
        int annee;
        int identifiant;
        Saison saison;
        Collection(List<Vetement> vetementTypes, String nom, int annee, Saison saison, Ville ville){
            this.vetementTypes = vetementTypes;
            this.nom = nom;
            this.annee = annee;
            this.saison = saison;
        }

        public void listeCollection(){
            System.out.println("Collection " + nom + ", Saison " + saison + ", Année " + annee);
            for (Vetement vetement : vetementTypes){
                System.out.println(vetement.type + " en " + vetement.materiel);
            }
            /*for (Vetement vetement : vetementTypes){
                   System.out.println(this.identifiant + ":" + vetement.type + " en " + vetement.materiel);
            }*/
        }   

    }
    public enum Saison {
        PRINTEMPS, HIVER, AUTONME, ETE
    }
    public enum Ville {
        PARIS, GENEVE, BERNE, NEW_YORK, TOKYO, LONDRES, MADRID, BERLIN , MUNICH, ALGER, DAKAR, MIAMI
    }

}

