boucle = True
while boucle:

  a = int(input('Entrez un nombre : '))
  c = input ("Entrez le signe de l'opération souhaitée : ")
  b= int (input('Entrez un autre nombre : '))
  
  if  c == "+":
    print(f"Le resultat est {a + b}")
  elif c == "-":
    print(f"Le resultat est {a - b}")
  elif c == "*":
    print(f"Le resultat est {a * b}")
  elif c == "/":
    if b != 0:
       print(f"Le resultat est {a / b}")
    else :
        print ("Erreur, impossible d'utiliser zéro dans la divison")
        continue
  else :
    print("Erreur lors de la sélection de l'operateur, Veuillez recommencer ! ")
    continue

  d= int(input("Voulez vous recommencer (1) ou quitter (2) ? "))
  if d == 1:
    continue
  else :
    boucle= False
  
    


