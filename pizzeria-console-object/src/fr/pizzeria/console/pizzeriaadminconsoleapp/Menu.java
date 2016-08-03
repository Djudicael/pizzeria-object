package fr.pizzeria.console.pizzeriaadminconsoleapp;

import java.util.Scanner;

public class Menu {

	public Scanner sc = new Scanner(System.in);
	public int choix;
	
	public void affichermenu(){
		// menu du programme
				System.out.println("***** Pizzeria Administration *****");
				System.out.println("1. Lister les pizzas");
				System.out.println("2. Ajouter une nouvelle pizza");
				System.out.println("3. Mettre à jour une pizza");
				System.out.println("4. Supprimer une pizza");
				System.out.println("99. Sortir");
		
	}
	
	public void afficherchoix(Pizza[] tabPiz){
		  
		  System.out.println("***** Select your instruction here*****");
		  choix = sc.nextInt();
		
		switch (choix) {
		case (1) : 
			AfficherTab piz = new  AfficherTab();
			piz.afficherpizz(tabPiz);
		break;
		case (2) : 
			System.out.println("Menu 2. Ajouter une nouvelle pizza");
			System.out.println("veuiller saisir le code");
			String newcode = sc.next();
	
			System.out.println("veuillez saisir le nom sans espace");
			String newnom = sc.next();
	
			System.out.println("veuillez saisir le prix");
			double newprix = sc.nextDouble();
			// creation de la copie d'un tableau dans un autre tableau
			Control copy = new Control();
			copy.copyTab(tabPiz, newcode, newnom, newprix);
			AfficherTab piz2 = new  AfficherTab();
			piz2.afficherpizz(tabPiz);
		break;
		case (3) : 
			System.out.println("test3");
		break;
		case (4) : 
			System.out.println("test4");
		break;
		default :System.out.println("default");;
		}
		
	}
}
