public class App {
    public static void main(String[] args) {
        App app = new App();
        double resultatFinal = app.factorielles(5);
        System.out.println(resultatFinal);
    }
    public double factorielle(int n){
        int z = n - 1;
        double resultat = z * n;
        for (z = n - 1 ; z > 0; z-- ){
            if (z != n -1  && z != 0){
             resultat = resultat * z ;
            }
        }
        return resultat;
    }
    public double factorielles (int n){
     double resultat = 1;
     if (n == 0){
        return resultat;
     }
      resultat = n * factorielles(n - 1);  
       return resultat;
    }
}
