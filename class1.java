/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 
// classe fournissant des fonctions de lecture au clavier -
import java.io.* ;
public class class1
{ 
  /*public static String lireString ()   // lecture d'une chaine
  { String ligne_lue = null ;
    try
    { InputStreamReader lecteur = new InputStreamReader (System.in) ;
      BufferedReader entree = new BufferedReader (lecteur) ;
      ligne_lue = entree.readLine() ;
    }
    catch (IOException err)
    { System.exit(0) ;
    }
    return ligne_lue ;
  }
  public static float lireFloat ()   // lecture d'un float
  { float x=0 ;   // valeur a lire
   try
    { 
      String ligne_lue = lireString() ;
      x = Float.parseFloat(ligne_lue) ;
    }
    catch (NumberFormatException err)
    { System.out.println ("*** Erreur de donnee ***") ;
      System.exit(0) ;
    }
    return x ;
  }
  public static double lireDouble ()   // lecture d'un double
  { double x=0 ;   // valeur a lire
    try
    { String ligne_lue = lireString() ;
      x = Double.parseDouble(ligne_lue) ;
    }
    catch (NumberFormatException err)
    { System.out.println ("*** Erreur de donnee ***") ;
      System.exit(0) ;
    }
    return x ;
  }
  public static int lireInt ()         // lecture d'un int
  { int n=0 ;   // valeur a lire
    try
    { String ligne_lue = lireString() ;
      n = Integer.parseInt(ligne_lue) ;
      }
    catch (NumberFormatException err)
    { System.out.println ("*** Erreur de donnee ***") ;
      System.exit(0) ;
    }
    return n ;
  }

  public static char lireChar ()   // lecture d'un char
  { char c=0 ;   // valeur a lire
    try
    { String ligne_lue = lireString() ;
      c = ligne_lue.charAt(0) ;
    }
    catch (StringIndexOutOfBoundsException err)
    { System.out.println ("*** Erreur de donnee 'vide' ***") ;
      System.exit(0) ;
    }
    return c ;
  }*/
  
   // programme de test de la classe Clavier
  public static void main (String[] args)
  { 
      //System.out.println("bonjour");
      
      ReelContraint e = new ReelContraint(2.15, 3.2, 2.1);
      ReelContraint e2 = new ReelContraint(1,30000,0.5);
        
        e.affiche();
        e2.affiche();
        
       /* e.saisir();
        e.affiche();
        e.incr(5);
        e.affiche();*/
      
      /* System.out.println("donnez un flottant") ;
    float x ;
    x = class1.lireFloat() ;
    System.out.println("merci pour " + x) ;
    System.out.println("donnez un entier") ;
    int n  ;
    n = class1.lireInt() ;
    System.out.println("merci pour " + n) ;
	System.out.println("donnez un caractère") ;
    char c ;
    c = class1.lireChar() ;
    System.out.println("merci pour " + c) ;*/	
  }
}


