import random 

import time  

objet = ["ciseau","pierre","papier"] 

score = 0 

boucle = True 

def verification(coup): 

 if coup not in objet: 

  print("Erreur de syntaxe") 
  return None 
 else: 
   coup_ordi = ordi_raisonnement() 
   raisonnement(coup,coup_ordi) 

 

def ordi_raisonnement(): 

   coup_ordi = random.choice(objet) 
   return coup_ordi 


def raisonnement(coup, coup_ordi): 

 global score 

 if coup == "ciseau" and coup_ordi == "pierre" : 

  print ("L'ordinateur a choisi la pierre") 

  time.sleep(2) 

  print("Vous avez perdu !!!") 

  time.sleep(2)  

  score_perdant(1) 

 elif coup == "ciseau" and coup_ordi == "papier" : 

  print ("L'ordinateur a choisi le papier") 

  time.sleep(2) 

  print("Vous avez gagné !!!") 

  time.sleep(2) 

  score_gagnant(1) 

 

 elif coup == "pierre" and coup_ordi == "ciseau" : 

  print ("L'ordinateur a choisi le ciseau") 

  time.sleep(2) 

  print("Vous avez gagné !!!") 

  time.sleep(2) 

  score_gagnant(1) 

 

 elif coup == "pierre" and coup_ordi == "papier" : 

   print ("L'ordinateur a choisi le papier") 

   time.sleep(2) 

   print("Vous avez perdu !!!")  

   time.sleep(2) 

   score_perdant(1) 

 

 elif coup == "papier" and coup_ordi == "pierre" : 

   print ("L'ordinateur a choisi la pierre") 

   time.sleep(2) 

   print("Vous avez gagné !!!") 

   time.sleep(2) 

   score_gagnant(1) 

 

 elif coup == "papier" and coup_ordi == "ciseau" : 

  print ("L'ordinateur a choisi le ciseau") 

  time.sleep(2) 

  print("Vous avez perdu !!!") 

  time.sleep(2) 

  score_perdant(1) 

 

 elif coup == coup_ordi : 

  print ("Vous avez le même objet") 

  time.sleep(2) 

  print("Le score n'a pas changé") 

 else: 
  print("Erreur de syntaxe") 
  return None 

 

def score_perdant(points): 

 global score 

 score -= points 

 print(f"Votre score est de {score} points") 

 

def score_gagnant(points): 

 global score 
 score += points 
 print(f"Votre score est de {score} points") 

 

while boucle: 

 coup = input("Choisissez entre pierre, papier, ciseau : ") 

 verification(coup) 

 time.sleep(2) 

 question = int(input("Voulez vous continuer(1) ou quitter (2) ? ")) 

 if question != 1: 

  boucle=False 

 else: 
  continue 