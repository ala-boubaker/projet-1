package com.sdz.personnage;

import com.sdz.comportement.Deplacement;
import com.sdz.comportement.EspritCombatif;

class Test{

	  public static void main(String[] args) {

	    Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};

	        

	    for(int i = 0; i < tPers.length; i++){

	      System.out.println("\nInstance de " + tPers[i].getClass().getName());

	      System.out.println("*****************************************");

	      tPers[i].combattre();

	      tPers[i].seDeplacer();

	      tPers[i].soigner();
	      
	    

	    }    
	    
        tPers[0].setDeplacement(new Deplacement() {
			
			@Override
			public void deplacer() {
				System.out.println("je me deplace ano");
				
			}
		});
        tPers[0].setEspritCombatif(new EspritCombatif() {
			
			@Override
			public void combat() {
				System.out.println("je combat ano");				
			}
		});
        tPers[0].seDeplacer();
        tPers[0].combattre();

	  }
}