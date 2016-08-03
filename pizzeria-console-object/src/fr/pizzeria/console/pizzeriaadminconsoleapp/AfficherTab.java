package fr.pizzeria.console.pizzeriaadminconsoleapp;

public class AfficherTab {
	
	
	
	public void afficherpizz(Pizza []Tab){
		for (int i = 0; i < Tab.length; i++) {
			System.out.println(Tab[i].id + " " + Tab[i].code + " " + Tab[i].nom + " " + Tab[i].prix);
		}
	}

}
