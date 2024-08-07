package vet.habit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import vet.habit.App.Collection;
import vet.habit.App.Saison;
import vet.habit.App.Ville;

public class Vetement {
    public static final Random aleatoire = new Random();
    Type type;
    Materiel materiel;
    Vetement(Type type,Materiel materiel){
        this.type = type;
        this.materiel = materiel;
    }
    public enum Materiel{
        COTON, SYNTHETHIQUE, LAINE, CUIR, LIN
    }
    public enum Type {
    SHORT, PANTALON, ROBE, PULL, T_SHIRT, SOUS_VETEMENT
 }
 public static List <Vetement> filterClothes(){
        List<Vetement> vetementsListe = new ArrayList<>();
        for (int i = 0; i < 20 ; i ++){
                Type type = Type.values()[aleatoire.nextInt(Type.values().length)];
                Materiel materiel = Materiel.values()[aleatoire.nextInt(Materiel.values().length)];
                if (type == Type.SHORT ){
                  vetementsListe.add(new Vetement(type, materiel));
                }
            }
            return vetementsListe ;
        }
        public void listeVetement(List<Vetement> vetementsListe){
            for (Vetement unvetement : vetementsListe ){
                System.out.println(unvetement.type + " en " + unvetement.materiel);
            }
        }  
    }

