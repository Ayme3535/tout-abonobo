Une petite entreprise de produits chimiques souhaite informatiser la gestion du calcul du salaires de ses employés. Cet exercice a pour but la réflexion et la pratique autour des problématiques de programmation orientées objets. En effet afin permettre à cette entreprise d'informatiser le calcul des salaires, il faut tout d'abord construire une hierarchie d'objets permettant de représenter ses salariés.
 
Lors de votre entretien avec le directeur, vous notez les contraintes suivantes :
 
    Tout employé est caractérisé par son nom, son prénom, son âge, et sa date d'entrée en service
    Tout employé a un salaire mensuel calculé selon le poste qu'il occupe dans l'entreprise
    Les types d'employés
        Vendeur : Son salaire est calculé avec 20% du chiffre d'affaire qu'il a effectué dans le mois, plus une prime fixe de 400€
        Représentant : Son salaire est calculé avec 20% du chiffre d'affaire qu'il a effectué dans le mois, plus une prime fixe de 800€
        Producteur : Son salaire est calculé avec le nombre d'unités produites dans le mois multiplié par un taux fixe de 5€
        Manutentionnaire : Son salaire est calculé avec le nombre d'heures effectuées dans le mois multiplié par un taux fixe de 65€
    Certains employés des secteurs production et manutention sont appelés à manipuler des produits dangereux
        Une prime fixe de 200€ est ajoutée à leur salaire mensuel
    Le programme doit permettre de gérer une collection d'employés à partir de laquelle on peut afficher de détails des salaires de chaque employés, mais aussi le salaire moyen.
 
Le code suivant doit permettre de tester le programme :
 
public class Main {
  public static void main(final String[] args) {
    final Staff myEmployees = new Staff();
    myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
    myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
    myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
    myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
    myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
    myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));
    myEmployees.displaySalaries();
    myEmployees.displayAverageSalary();
  }
}
Top, du coup, voici un petit extra avec la même base: 
 
Lorsque vous montrez au directeur le résultat de votre programme permettant d'afficher les salaires, il est content mais il y a un problème... Il a oublié de vous parler du fait que la societé travaille avec des indépendants, et leur factures doivent entrer en compte dans le calcul des salaires.
Vous récupérez les informations suivantes sur les indépendants :
Ils sont caractérisés par un nom et un numéro SIREN, ainsi qu'une liste de facture pour le mois courant
L'équivalent de leur salaire se calcul avec la somme des factures qui lui sont associées
Une facture est caractérisée par une date, une somme en euros, et un libellé représentant la nature de la prestation
Les factures dont le libellé commence par "Frais de déplacement - " ne doivent pas être prises en compte dans le calcul du salaire d'un indépendant
A la fin de votre entretien, vous récupérez une information supplémentaire de dernière minute. Le directeur aimerait avoir l'affichage du nom complet de l'employé lors de l'affichage de son salaire, et si il est indépendant, cela doit être facilement reconnaissable.


on veut réaliser un programme de gestion des recettes de cuisine, qui sera installé sur
des appareils électroménagers pour leur permettre de faire la cuisine de façon autonome. Un
programmeur a déjà écrit la classe Ingredient donnée ci-dessous :
 
class Ingredient{
    String nom_aliment, etat;
    int quantite;
    String unite;
    Ingredient(String n, String e, int q, String unite){
        this.nom_aliment = n;
        this.etat = e;
        this.quantite = q;
        this.unite = unite;
    }
}
 
NB: l'état d'un ingrédient peut être cuit, entier, cru, découpé, ou une combinaison de ces états (par
exemple cuit et entier). L'unité peut être une unité de poids (gramme, kg, etc), de volume (litre, ml, cl)
ou simplement une cardinalité.
a. Écrivez une classe Plat qui représente les plats, chaque plat ayant un nom et une liste
d'ingrédients. On doit pouvoir créér un plat avec son nom. Il faut également avoir des accesseurs sur
le nom du plat et les ingrédients, et pouvoir ajouter un ingrédient à un plat. Écrivez également une
méthode main qui crée un plat appelé choucroute contenant comme ingrédients : 500g de choucroute
cuite, 150g de lard cuit et entier et 2 saucisses entières et cuites
b. On veut pouvoir comparer les plats et donc leurs ingrédients. Ajoutez une méthode equals
dans la classe Ingrédient qui renvoie true si deux ingrédients ont le même nom d'aliment et le même
état (pas forcément la même quantité). Ajoutez une méthode equals dans la classe Plat, qui renvoie true
si deux plats contiennent les mêmes ingrédients, au sens donné juste avant.
c. On veut faire la distinction entre les ingrédients qu'on peut cuire et ceux qu'on peut découper.
Un ingrédient qu'on peut cuire doit avoir une méthode cuire() qui le fait passer dans l'état "cuit" et une
température de cuisson. Un ingrédient qu'on peut découper doit avoir une méthode decouper() qui le
fait passer dans l'état "découpé". Proposez du code objet pour représenter ces types d'ingrédients.

Hello, wep j'ai quelquechose sous la main: 
 
On veut créer la fonction de recherche d'un shop de vêtements en ligne
 
Une collection contient des vêtements, a un nom, une année et une saison
Un vêtement peut-être un short, un pantalon, une robe, un pull, un t-shirt ou un sous-vêtement (VetementType)
Un vêtement peut-être en coton, en synthéthique, en laine, en cuir, en lin (VetementCompo)
Un vêtement appartient à une collection, caractérisée par un nom et une année
 
 
1. Ecrire la structure de ces données. 
2. Ecrire une fonction qui va créer 20 collections aléatoires, nommées après les noms des grandes villes où elles ont été exposées avec des années comprises entre 2015 et 2023.
3. Ecrire une fonction pour ajouter 100 produits aléatoires dans chacune de ces collections
4. Écrire unu fonction qui va retourner x produits aléatoires du stock créé aux points 2 et 3.
4. Écrire le contenu de la fonction suivante:
 
 
public List<Vetement> filterClothes(List<Vetement> stock, List<VetementType> vetementTypes, List<VetementCompo> vetementCompos) {
    // Cette méthode doit filtrer les vêtements du stock et retourner tous les vêtements qui correspondent à au moins un des types présents dans la variable vetementTypes
    // et au moins composés d'une des matières présente dans la variable vetementCompos
    .....
}

écrire une fonction qui calcule la valeur factorielle d'un nombre: 
par exemple:
 
5! = 1*2*3*4*5 = 120
7! = 1*2*3*4*5*6*7 = 5040
 
l'intitulé de la fonction sera:  "public int factorielle(int n) {}"
