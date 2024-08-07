import time
running = True
liste = []
def ordre_croissant(a,b,c,d,e):
   liste = [a,b,c,d,e]
   i = 0
   n = len(liste)
   for i in range(n-1):
    for j in range (i, n - 1):
     if liste[i] > liste[j + 1]:
       temp = liste[i]
       liste[i] = liste[j + 1]
       liste[j + 1] = temp

   return liste 


def ordre_decroissant(a,b,c,d,e):
   liste = [a,b,c,d,e]
   i = 0
   n = len(liste)
   for i in range (n-1):
    for j in range (i, n - 1):
     if liste[i] < liste[j + 1]:
       temp = liste[i]
       liste[i] = liste[j + 1]
       liste[j + 1] = temp
       
   return liste

while running:
    a = int(input("Choisissez un nombre : "))
    b = int(input("Choisissez un nombre : "))
    c = int(input("Choisissez un nombre : "))
    d = int(input("Choisissez un nombre : "))
    e = int(input("Choisissez un nombre : "))

    erreur_question = True 
    while erreur_question:
     question = int(input("Voulez-vous trier les nombres dans un ordre croissant (1) ou decroissant (2) ? "))
     if question == 1:
        print("Les nombres ont été classés dans l'ordre croissant :")
        time.sleep(2)
        liste = ordre_croissant(a,b,c,d,e)
        print(liste)
        time.sleep(3)
        break
     elif question == 2:
        print("Les nombres ont été classés dans l'ordre décroissant :")
        time.sleep(2)
        liste = ordre_decroissant(a,b,c,d,e)
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




