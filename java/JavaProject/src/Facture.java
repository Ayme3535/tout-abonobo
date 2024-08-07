public class Facture {
    /*public enum Libelle {
        DEPLACEMENT, MATERIEL
    }*/
    String date;
    //public Libelle libelle;
    String frais;
    int factureHasard; 

    public Facture(String date, String frais){
        this.date = date;
        this.frais =  frais;
        this.factureHasard = hasard();
    }
    
    public int hasard(){
        int min = 50;
        int max = 400;
        int random = (int)(Math.random() * (max - min + 1) + min);
        return random;
    };
}
