def calcul(a, b, c):
    if c == '+':
        resultat = a + b
    elif c == '-':
        resultat = a - b
    elif c == '*':
        resultat = a * b
    elif c == '/':
        if b == 0:
            print("Erreur, imposible d'effectuer une division par 0")
            return None
        else:
            resultat = a / b
            
    else:
        print("Opérateur non pris en charge")
        return None
    
    print(f"Le résultat est {resultat}")
    return resultat

while True:
    a = int(input('Entrez un nombre : '))
    c = input("Entrez le signe de l'opération souhaitée : ")
    b = int(input('Entrez un autre nombre : '))
    calcul(a,b,c) 

    choix = int(input("Voulez-vous recommencer(1) ou quitter(2) ? "))
    if choix != 1:
        break
    else:
        continue
