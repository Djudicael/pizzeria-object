package fr.pizzeria.console.pizzeriaadminconsoleapp;

import java.util.Arrays;

public class Control {
	
	public Pizza [] copyTab(Pizza []Tab, String newcode, String newnom, double newprix ){
		Pizza[] newTab = Arrays.copyOf(Tab, Tab.length + 1);
		Pizza p = new Pizza();
		p.code = newcode;
		p.nom = newnom;
		p.prix = newprix;
		newTab[Tab.length] = p;
		Tab = newTab;
		return Tab;
	}

}
