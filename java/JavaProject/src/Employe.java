public abstract class Employe{
    String nom;
    String prenom;
    int age;
    String date;
    public Employe(String nom, String prenom, int age, String date){
      this.nom = nom;
      this.prenom = prenom; 
      this.age = age;
      this.date = date;
  }
    public abstract int salaire();
}
