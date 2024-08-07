import time
running = True
liste = []

def ordre_pair(a,b,c,d,e):
   liste = [a,b,c,d,e]
   i = 0 
   while (i < len(liste)):
      if liste[i] < :
         liste [i] = liste[0]
      i = i + 1
   return liste

def ordre_impair(a,b,c,d,e):
   liste = [a,b,c,d,e]
   i = 0 
   while (i < len(liste)):
      if liste[i] < :
         liste [i] = liste[0]
      i = i + 1
   return liste

while running:
    a = int(input("Choisissez un nombre : "))
    b = int(input("Choisissez un nombre : "))
    c = int(input("Choisissez un nombre : "))
    d = int(input("Choisissez un nombre : "))
    e = int(input("Choisissez un nombre : "))

    erreur_question = True 
    while erreur_question:
     question = int(input("Voulez-vous trier les nombres dans un liste de nombre pair (1) ou impair (2) ? "))
     if question == 1:
        print("Les nombres ont été classés dans l'ordre croissant :")
        time.sleep(2)
        liste = ordre_pair(a,b,c,d,e)
        print(liste)
        time.sleep(3)
        break
     elif question == 2:
        print("Les nombres ont été classés dans l'ordre décroissant :")
        time.sleep(2)
        liste = ordre_impair(a,b,c,d,e)
        print(liste)
        time.sleep(3)
        break
        
     else:
        print("Erreur, veuillez indiquer dans quel ordre vous souhaitez que les nombres soit affichées ")
        time.sleep(2)
        continue
    
    recommencer = int(input("Voulez vous recommencer (1) ou quitter (2) ? "))
    if recommencer != 1:
       running= False
    else:
       continue


