import time

liste = [4,2,54,1]

def exo_croissant(liste):
  taille_de_tableau = len(liste) - 1
  i_debut = 0
  j_debut = -1
  for i in range(i_debut,taille_de_tableau): 
     j_debut = j_debut + 1   
     for j in range (j_debut ,taille_de_tableau):   
      if liste[i] > liste[j + 1]:
       temp = liste[i]
       liste[i] = liste[j + 1]
       liste[j + 1] = temp
      print(liste)
   
  return liste 

def exo_decroissant(liste):
  i = 0
  n = len(liste)
  j= 0
  for i in range(n- 1):
   for j in range (i, n - 1):
    if liste[i] < liste[j + 1]:
       temp = liste[i]
       liste[i] = liste[j + 1]
       liste[j + 1] = temp
    print(liste)
     
  return liste  
 
print("Hello") 
exo_croissant(liste)

print("Hello decroissant")
exo_decroissant(liste)



def exooo(liste):
    for i in range(len(liste)):
        print(liste[i]) 



    









# i = 0
 # j = 0

 # if liste[i] < liste[j + 1] :
 #   liste [i], liste [j + 1],liste [j + 2],liste [j + 3],liste [j + 4] = liste [j + 1], liste [i],liste [j + 2],liste [j + 3],liste [j + 4] 

 # elif liste[i] < liste[j + 2] :
  #  liste [i], liste [j + 1], liste [j + 2],liste [j + 3],liste [j + 4]  = [j + 2], liste [j + 1], liste [i],liste [j + 3],liste [j + 4] 

# elif liste[i] < liste[j + 3] :
#   liste[j + 2], liste [j + 1], liste [i], liste [j + 3],liste [j + 4]  = [j + 2], liste [j + 1],  liste [j + 3],liste [i],liste [j + 4] 

 # elif liste[i] < liste[j + 4] :
 #   liste[j + 2], liste [j + 1], liste [i], liste [j + 3], liste[j +4] = liste[j + 2], liste [j + 1], liste [j + 4], liste [j + 3], liste[i]
 #  else:    
  #  print("erreur")
  
  
 # return liste 